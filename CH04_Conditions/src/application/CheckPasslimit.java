package application;

import java.util.Scanner;

public class CheckPasslimit {

	public static void main(String[] args) {
		// �н����尡 Ʋ������ 3�� �Է��� �� �ִ� ��ȸ�� �ش�.
		// �н����尡 ������ '���ӽ���' ����ϰ� �ݺ����� ��������
		// �н����� 3ȸ Ʋ���� '���Ӱź�'
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;	//�÷���(flag):�Ҹ������� ���¿� ���� ó���帧 ����
		
		String password = "";
		
		for (int i = 1; i<=3; i++) {
			System.out.println("��й�ȣ �Է�: ");
			password = scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("���ӽ���");
				accessOK = true;
				break;
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
		}
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("���Ӱź�");
		}

	}

}
