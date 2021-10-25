package try_catch;

import java.util.Scanner;

public class App3 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("�Է��� ���ڴ� : " + number);
		scanner.close();
	}

	private static int getNumber() {
		// ���ڸ� �Է¹��� ������ �ݺ��Ͽ� ���ڸ� �Է¹޾� �����ϴ� �޼ҵ�
		int number = 0;
		boolean isNumber = false; // �����ΰ�? t / f

		do {
			System.out.println("���ڸ� �Է� : ");
			String line = scanner.nextLine();

			try { // ������ �� �� �ִ� �ڵ带 try�� �ȿ� �ִ´�.
				number = Integer.parseInt(line); // ���⼭ ������ ���� ������ ���� �Է��� ����
				isNumber = true;
			} catch (NumberFormatException e) { // try ���� ���� �߻� �� catch������ ó���Ѵ�.
				System.out.println("���� �Է��� �ƴմϴ�.");

			}
		} while (!isNumber);

		return number;
	}
}
