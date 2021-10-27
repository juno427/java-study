package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// ������ �����θ� ���ڿ��� ǥ��(\\�� ǥ�õ�)
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\text.txt";
		System.out.println(new File(fileLocation).exists()); // ������ ������ true ������ false�� ����
		System.out.println();

		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("������");
			br.newLine();
			br.write("����");
			br.newLine();
			br.write("�ٳ���");
			br.newLine();
			br.write("��");

		} catch (IOException e) {
			System.out.println("������ �� ���� ���� : " + fileLocation);
		}

		System.out.println("���� ���� �Ϸ� : " + fileLocation);

	}

}