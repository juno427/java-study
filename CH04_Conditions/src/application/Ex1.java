package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�޴�");
		System.out.println("====\n");
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ�'");
		System.out.println("3. ���α׷� ����\n");
		
		System.out.println("����� ���� > ");
		int option = scanner.nextInt();
		scanner.close();
		
		// ����ġ������ �Ȱ��� �����ϵ���
		switch(option) {
		case 1:
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ�");
		case 3:
			System.out.println("���α׷� ����");
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
		default:
			System.out.println("�߸��� �ɼ��Դϴ�.");
		} 
		
		/*
		if(option == 1) {
			System.out.println("��ο�");
		} else if (option == 2) {
			System.out.println("�ȳ� ?");
		} else if (option == 3) {
			System.out.println("�����մϴ�...");
		} else if (option == 10000) {
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
		} else {
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}
		*/

	}

}
