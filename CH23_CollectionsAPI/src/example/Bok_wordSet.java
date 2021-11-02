package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Bok_wordSet {

	public static void main(String[] args) throws IOException {
		// å ������ �ҷ��ͼ� �ܾ�� ���� ���
		File wordsSherlock = new File("sherlock.txt");
		File wordsDra = new File("dracula.txt");

		System.out.println(wordsSherlock.exists());
		System.out.println(wordsDra.exists());

		TreeSet<String> sherlist = loadWords(wordsSherlock);
		TreeSet<String> dralist = loadWords(wordsDra);

		System.out.println(sherlist.size());
		System.out.println(dralist.size());

		displayWords(sherlist);

	}

	private static void displayWords(TreeSet<String> list) {
		// Ʈ������ �Է¹޾� �� �ȿ� �ܾ���� ����Ѵ�.

		int count = 0;
		for (String w : list) {
			if (w.length() >= 6) {
				System.out.printf("%-10s \t", w);
				count++;
				if (count == 6) {
					System.out.println();
					count = 0;
				}
			}

		}

	}

	private static TreeSet<String> loadWords(File file) throws IOException {
		// ������ �Է��ϸ� �о �ܾ���� TreeSet���� ����
		TreeSet<String> wordSet = new TreeSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line = null;
			while ((line = br.readLine()) != null) { // ������ ���پ� �дٰ� ���������� �а��� ����
				String[] words = line.split("[^a-zA-Z]+"); // ���� �ܾ� �迭�� ����

				for (String w : words) {
					if(w.length() < 2) continue; // �ܾ� ö�� 1 ���ϴ� ����
					wordSet.add(w.toLowerCase()); // �ܾ���� �ҹ��ڷ� ����Ʈ�� �߰�
				}
			}
		}

		return wordSet;
	}

}
