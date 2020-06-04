import java.text.DecimalFormat;

public class Exercise2 {
	public static void Question1() {

		/*
		 * Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5
		 * phần tử theo cú pháp (sử dụng vòng for để khởi tạo):  Email: "Email 1" 
		 * Username: "User name 1"  FullName: "Full name 1"  CreateDate: now
		 */

		Account[] account = new Account[5];
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account();
			account[i].setId(i + 1);
			account[i].setFullName("abc" + i);
		}
		for (Account account2 : account) {
			System.out.println(account2.getId());
			System.out.println(account2.getFullName() + "\n");
		}
	}

	public static void Question2() {
		/*
		 * Khởi tạo lương có datatype là Integer có giá trị bằng 5000. Sau đó convert
		 * lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu
		 * thập phân)
		 */
		Integer salary = new Integer(5000);

		float salary1 = salary.floatValue();

		String pattern = "##,##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(salary1);
		System.out.println(format);
	}

	public static void Question3() {
		/*
		 * Khai báo 1 String có value = "1234567" Hãy convert String đó ra số int
		 */
		String value = "1234567";
		int so = Integer.parseInt(value);
		System.out.println(so);
	}

	public static void Question4() {
		/*
		 * Khởi tạo 1 số Integer có value là chữ "1234567" Sau đó convert số trên thành
		 * datatype int
		 */

		Integer a = new Integer("1234567");
		int b = a.intValue();
		System.out.println(b);
	}

}
