package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// ������ �����θ� ���ڿ��� ǥ��(\\�� ǥ�õ�)
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\text.txt";
		System.out.println(new File(fileLocation).exists()); // ������ ������ true ������ false�� ����
		System.out.println();

		// ������ ���پ� ������ �ִ� Ŭ����
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {

			String line = null;
			while ((line = reader.readLine()) != null) { // ������ ���پ� �дٰ� ���������� �а��� ����
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// ������ �����ּҿ� ������
			System.out.println("������ ã�� ���� : " + fileLocation);
		} catch (IOException e) {
			// ������ ���� ����
			System.out.println("������ ���� ���� : " + fileLocation);
		}

	}

}