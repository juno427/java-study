package pro;

import java.util.Scanner;

public class App {

	static String userName;

	public static void main(String[] args) {
		int lotto[] = new int[6];

		// ����� �̸� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("����Ͻ� �г����� �Է��� �ּ���.");
		userName = scan.nextLine();
		System.out.println(userName + "�� �ȳ��ϼ���.");

		System.out.println("�ζ� ��ȣ�� �������� �����մϴ�.");

		// �ζ� ��ȣ ����
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			// �ߺ� ��ȣ ����
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(userName +"���� ����� �ζ� ��ȣ : ");

		// ��ȣ ���
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + "");
		}

	}

}
