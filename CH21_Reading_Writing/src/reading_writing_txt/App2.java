package reading_writing_txt;

import java.io.File;

public class App2 {
	public static void main(String[] args) {
		// ������ �����θ� ���ڿ��� ǥ��(\\�� ǥ�õ�)
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\text.txt";
		System.out.println(new File(fileLocation).exists()); // ������ ������ true ������ false�� ����
	}

}