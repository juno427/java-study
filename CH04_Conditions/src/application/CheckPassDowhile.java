package application;

import java.util.Scanner;

public class CheckPassDowhile {

	public static void main(String[] args) {
		// �н����带 �Է¹޾� do while������ �´��� �˻��Ѵ�. �н����尡 ������ �ݺ����� ��������
		Scanner scanner = new Scanner(System.in);

		final String USER_PASSWORD = "hello";

		String password = "";
		do {
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			
			
		} while (!password.equals(USER_PASSWORD));	//!�� �ݴ�
		
		scanner.close();
		System.out.println("���� ����.");
		
	}

}
