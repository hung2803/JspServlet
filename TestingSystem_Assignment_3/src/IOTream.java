import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class IOTream {
	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào đường dẫn file");
//		String file = scan.nextLine();
//		System.out.println("Mời bạn nhập vào tên file");
//		String fileName = scan.nextLine();

		// isFileExists("C:\\Users\\Admin\\Desktop\\Student.txt");
		// createFile("C:\\Users\\Admin\\Desktop\\", "hung.docx");
		// deleteFile("C:\\Users\\Admin\\Desktop\\hung.docx");
		// checkFoderOrFoder("C:\\\\Users\\\\Admin\\\\Desktop\\\\hung.docx");
		downLoadFile("file:///C:/Users/Admin/Google%20Drive/EPD_03/Java_Document/Assignments/Testing%20System/Assignment%207.pdf", "abc");
	}

	public static void isFileExists(String path) {
		File file = new File(path);
		if (file.exists()) {
			System.out.println("Error! File Exist.");
		}
	}

	public static void createFile(String path, String fileName) throws IOException {

		File file = new File(path + fileName);

		if (file.createNewFile()) {
			System.out.println("Tạo file thành công");

		} else {
			isFileExists(path);
		}

	}

	public static void deleteFile(String pathFile) {
		File file = new File(pathFile);
		if (file.delete()) {
			System.out.println("Thành công ");
		} else {
			System.out.println("Error! File Not Exist");
		}
	}

	public static void checkFileOrFoder(String path) {
		File file = new File(path);
		if (file.isDirectory()) {
			System.out.println("Là foder");
		} else {
			System.out.println("Không phải foder");
		}
	}

	
	
	public static boolean downLoadFile(String fileLink, String folder) throws IOException {
		File foder = new File(folder);
		if (foder.exists() || foder.isDirectory()) {
			System.out.println("không tim thấy foder");
			return false;
		}
		URL url = new URL(fileLink);

		URLConnection connect = url.openConnection();
		int size = connect.getContentLength();

		InputStream in = connect.getInputStream();

		FileOutputStream ouput = new FileOutputStream(folder);
		return true;
	}
}
