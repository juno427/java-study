package game1;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		int com[] = new int[3]; // ��ǻ�� ����
		int user[] = new int[3]; // ����� ����
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int count = 0; // ���� Ƚ��
		
		while(com[0]==0) {
			com[0] = random.nextInt(10);
 		}
		while(com[0]==com[1] || com[1]==0) {
			com[1] = random.nextInt(10);
		}
		while(com[1]==com[2] || com[2]==0) {
			com[2] = random.nextInt(10);
		}
		
		while(true) {
			
			int strike = 0;
			int ball = 0;
			for(int i=0; i<user.length; i++) {
				System.out.print((i+1)+"��° ��: ");
				user[i] = scanner.nextInt();
				if(user[i] > 9 || user[i] <= 0) {
					System.out.println("���� ������ 1~9 �Դϴ�.");
				}
			}
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i] == user[j] && i==j) { // ���ڿ� ��ġ�� ��ġ
						strike++;
					} else if(com[i] ==user[j] && i!=j) { // ��ġ�� �ٸ��� ���ڴ� ��ġ
						ball++;
					}
				}
			}
			System.out.println(strike+" ��Ʈ����ũ "+ball+" �� ");
			count++;
			if(strike == 3) {
				System.out.println("���� ��\n" + count + "��° �õ� ����");
				break;
			}
		}
		scanner.close();
	}
}
