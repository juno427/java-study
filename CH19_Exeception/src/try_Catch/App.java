package try_Catch;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// try catch���� ����� ����ó��

		Scanner scanner = new Scanner(System.in);

		System.out.println("���ڸ� �Է� : ");
		String line = scanner.nextLine();

		int number = 0;
		boolean isNumber = false;

		try { // ������ �� �� �ִ� �ڵ带 try�� �ȿ� �ִ´�.
			number = Integer.parseInt(line); // ���⼭ ������ ���� ������ ���� �Է��� ����
			isNumber = true;
		} catch (NumberFormatException e) { // try ���� ���� �߻� �� catch������ ó���Ѵ�.
			System.out.println("���� �Է��� �ƴմϴ�.");
		}

		if (isNumber) {
		System.out.println("�Է��� ���ڴ� : " + number);
		}
		
		scanner.close();

	}

}
