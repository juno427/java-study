package login;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// �α���, ȸ������
		Scanner sc = new Scanner(System.in);
		String id1 = null, id2 = null;
		String pwd1 = null, pwd2 = null;
		int num = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------");
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.println("-----------");
			num = sc.nextInt();
			if(num == 1) {
				if(id1 == null && pwd1 == null) {
					System.out.println("ȸ�������� �ؾ��մϴ�.");
					continue;
				}
				System.out.println("���̵�: ");
				id2 = sc.next();
				System.out.println("��й�ȣ: ");
				pwd2 = sc.next();
				if(id1.equals(id2) && pwd1.equals(pwd2)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
				} else {
					System.out.println("�ٽ� �Է��� �ּ���.");
				}
			} else if(num == 2) {
				System.out.println("���̵�: ");
				id1 = sc.next();
				System.out.println("��й�ȣ: ");
				pwd1 = sc.next();
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			} else if(num == 3) {
				run = false;
				System.out.println("���α׷��� �����մϴ�.");
			}
			
		}

	}

}
