package reading_writing_txt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {

		File currentDirectory = new File(".");

//		for(String f : currentDirectory.list()) {
//			System.out.println(f);
//		}

		// �ؽ�Ʈ ���� ����
		String text = "Hello! \n HOW ARE YOU ?";

		Path path = Paths.get("text.txt");
		Files.write(path, text.getBytes()); // Files.write(�����ּ�,��������)

		// ���� �б�
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
		// �ؽ�Ʈ ���� ����

	}

}