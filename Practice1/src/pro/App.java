package pro;

import java.util.Scanner;

public class App {

	static String userName;

	public static void main(String[] args) {
		int lotto[] = new int[6];

		// 사용자 이름 설정
		Scanner scan = new Scanner(System.in);
		System.out.println("사용하실 닉네임을 입력해 주세요.");
		userName = scan.nextLine();
		System.out.println(userName + "님 안녕하세요.");

		System.out.println("로또 번호를 랜덤으로 추출합니다.");

		// 로또 번호 생성
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			// 중복 번호 제거
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(userName +"님의 행운의 로또 번호 : ");

		// 번호 출력
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + "");
		}

	}

}
