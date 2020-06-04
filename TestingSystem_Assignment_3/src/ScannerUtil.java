import java.util.Scanner;

public class ScannerUtil {
	public static void inputString() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String input = scan.nextLine().trim();
			if (!input.isEmpty()) {
				System.out.println(input);
				break;
			} else {
				System.out.println("Nhập sai mời nhập lại 1 chuỗi");
			}

		}

	}

	public static void inputInt() {

	}

	public static void main(String[] args) {
		inputString();

	}
}
