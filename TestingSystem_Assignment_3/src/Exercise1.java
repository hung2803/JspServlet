import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	public static String Question2() {
		/*
		 * Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở
		 * đầu cho đủ 5 chữ số)
		 */
		Random rand = new Random();

		String pattern = "00000";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		int so = rand.nextInt(9999 - 1000 + 1) + 1000;
		String format = decimalFormat.format(so);
		System.out.println(format);
		return format;
	}

	public static void Question3() {
		/*
		 * Lấy 2 số cuối của số ở Question 2 và in ra. Gợi ý: Cách 1: convert số có 5
		 * chữ số ra String, sau đó lấy 2 số cuối Cách 2: chia lấy dư số đó cho 100
		 */
		System.out.println(Question2().substring(3, 5));
	}

	public static void Question5(String loi) {
		/*
		 * Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		 */
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {

				System.out.println("Mời bạn nhập 1 số nguyên a ");
				String so1 = scan.nextLine();
				float a = Integer.parseInt(so1);
				System.out.println("Mời bạn nhập 1 số nguyên b ");
				String so2 = scan.nextLine();
				float b = Integer.parseInt(so2);

				float c = (float) a / b;
				System.out.println("Thương của số nguyên là : " + c);
				break;
			} catch (Exception e) {
				System.out.println(loi);
			}
		}

	}

}
