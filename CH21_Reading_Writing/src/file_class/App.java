package file_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {

		String text = "헬로우! \n 하 와 유?";

		Path path = Paths.get("text.txt");
		Files.write(path, text.getBytes());

		String recivedText = Files.readString(path);
		System.out.println(recivedText);

	}

}
