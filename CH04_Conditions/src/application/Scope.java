package application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// ������ ������ �ڵ���{} ���� ����

		{
			int value = 0;
			System.out.println(value);
		}

		// System.out.println(value); �ڵ��� �ۿ��� ���Ұ�

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}

		// System.out.println(i);

		String input = "";
		do {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
			
			scanner.close();
		
		} while (!input.equals("q"));
		
	}

}
