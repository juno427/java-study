package game2;

import java.util.Scanner;

public class Random_number { // 1~100���� ���� ���߱� ����

	public static void main(String[] args) {
		//Random random = new Random();
		//System.out.println("0 ~ 100 ������ ���� ���� : " + (int)(Math.random() * 100));
		//System.out.println("0 ~ 100 ������ ���� ���� : " + random.nextInt(100));
		
		int ori_num = (int)(Math.random() * 100);
		int sub_num = 0;
		boolean run = true;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~100�� �������� �� ���纸����.");
		while(run) {
			sub_num = scanner.nextInt();
			
			if(sub_num == ori_num) {
				System.out.println("�����Դϴ�." +(i+1)+ "��° ���� �����̽��ϴ�.");
				break;
			}
			
			if(sub_num > ori_num) {
				System.out.println("�Է��Ͻ� ������ �������� �Է��غ�����.");
			} else {
				System.out.println("�Է��Ͻ� ������ ū���� �Է��غ�����.");
			}
			i++;
			
		}
		scanner.close();
	}

}
