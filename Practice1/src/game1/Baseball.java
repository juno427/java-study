package game1;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		int com[] = new int[3]; // 컴퓨터 숫자
		int user[] = new int[3]; // 사용자 숫자
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int count = 0; // 게임 횟수
		
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
				System.out.print((i+1)+"번째 수: ");
				user[i] = scanner.nextInt();
				if(user[i] > 9 || user[i] <= 0) {
					System.out.println("숫자 범위는 1~9 입니다.");
				}
			}
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i] == user[j] && i==j) { // 숫자와 위치가 일치
						strike++;
					} else if(com[i] ==user[j] && i!=j) { // 위치는 다르나 숫자는 일치
						ball++;
					}
				}
			}
			System.out.println(strike+" 스트라이크 "+ball+" 볼 ");
			count++;
			if(strike == 3) {
				System.out.println("게임 끝\n" + count + "번째 시도 성공");
				break;
			}
		}
		scanner.close();
	}
}
