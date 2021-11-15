package game2;

import java.util.Scanner;

public class Random_number { // 1~100까지 난수 맞추기 게임

	public static void main(String[] args) {
		//Random random = new Random();
		//System.out.println("0 ~ 100 사이의 랜덤 숫자 : " + (int)(Math.random() * 100));
		//System.out.println("0 ~ 100 사이의 랜덤 숫자 : " + random.nextInt(100));
		
		int ori_num = (int)(Math.random() * 100);
		int sub_num = 0;
		boolean run = true;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~100의 랜덤숫자 중 맞춰보세요.");
		while(run) {
			sub_num = scanner.nextInt();
			
			if(sub_num == ori_num) {
				System.out.println("정답입니다." +(i+1)+ "번째 만에 맞히셨습니다.");
				break;
			}
			
			if(sub_num > ori_num) {
				System.out.println("입력하신 값보다 작은수를 입력해보세요.");
			} else {
				System.out.println("입력하신 값보다 큰수를 입력해보세요.");
			}
			i++;
			
		}
		scanner.close();
	}

}
