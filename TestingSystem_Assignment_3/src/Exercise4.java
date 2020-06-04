import java.util.Scanner;

public class Exercise4 {
	public static void question1() {
		/*
		 * Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể
		 * cách nhau bằng nhiều khoảng trắng );
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập 1 chuỗi");
		String chuoi = scan.nextLine();
		String[] a = chuoi.split(" ");
		System.out.println(a.length);
	}

	public static void question2() {
		/* Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1; */
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi 1");
		String s1 = scan.nextLine();
		System.out.println("Mời bạn nhập chuỗi 2");
		String s2 = scan.nextLine();
		System.out.println(s1.concat(" " + s2));
	}

	public static void question3() {
		/*
		 * Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư viết
		 * hoa chữ cái đầu thì viết hoa lên
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào tên ");
		String name = scan.nextLine();

		String[] name1 = name.split(" ");
		for (int i = 0; i < name1.length; i++) {
			System.out.print(name1[i].toUpperCase().charAt(0) + name1[i].substring(1) + " ");
		}

	}

	public static void question4() {
		/*
		 * Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của
		 * người dùng ra VD: Người dùng nhập vào "Nam", hệ thống sẽ in ra
		 * "Ký tự thứ 1 là: N" "Ký tự thứ 1 là: A" "Ký tự thứ 1 là: M"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập tên");
		String name = scan.nextLine();
		char[] name1 = name.toUpperCase().toCharArray();

		for (int i = 0; i < name1.length; i++) {
			System.out.println("Ký tự thứ " + (i + 1) + " : " + name1[i]);
		}

	}

	public static void question5() {
		/*
		 * Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập
		 * vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào họ");
		String lastName = scan.nextLine().trim();

		System.out.println("Mời bạn nhập vào tên");
		String firstName = scan.nextLine().trim();
		String fullName = lastName + firstName;
		if (!firstName.isEmpty() && !lastName.isEmpty()) {
			System.out.println(fullName);
		} else {
			System.out.println("Mời bạn nhập đầy đủ");
		}
	}

	public static void question6() {

		/*
		 * Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ
		 * thống sẽ tách ra họ, tên , tên đệm VD: Người dùng nhập vào "Nguyễn Văn Nam"
		 * Hệ thống sẽ in ra "Họ là: Nguyễn" "Tên đệm là: Văn" "Tên là: Nam"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên đầy đủ");
		String fullName = scan.nextLine().trim();

		if (!fullName.isEmpty()) {
			String[] tenDayDu = fullName.split(" ");
			System.out.println("Họ là : " + tenDayDu[0]);
			System.out.println("Tên Đệm là : " + tenDayDu[1]);
			System.out.println("Tên là : " + tenDayDu[2]);
		} else {
			System.out.println("Mời bạn nhập đầy đủ");
		}
	}

	public static void question7() {
		String x = "abcqaaabcabc";
		char[] name1 = x.toCharArray();
		for (int i = 0; i < name1.length; i++) {
			if (name1[i] == 'a') {
				String b = Character.toString(name1[i]);
				String[] c = b.split(" ");
				System.out.println(c.length);
			}
		}

	}
}
