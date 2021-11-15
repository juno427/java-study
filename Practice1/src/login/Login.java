package login;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// 로그인, 회원가입
		Scanner sc = new Scanner(System.in);
		String id1 = null, id2 = null;
		String pwd1 = null, pwd2 = null;
		int num = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println("-----------");
			num = sc.nextInt();
			if(num == 1) {
				if(id1 == null && pwd1 == null) {
					System.out.println("회원가입을 해야합니다.");
					continue;
				}
				System.out.println("아이디: ");
				id2 = sc.next();
				System.out.println("비밀번호: ");
				pwd2 = sc.next();
				if(id1.equals(id2) && pwd1.equals(pwd2)) {
					System.out.println("로그인 되었습니다.");
				} else {
					System.out.println("다시 입력해 주세요.");
				}
			} else if(num == 2) {
				System.out.println("아이디: ");
				id1 = sc.next();
				System.out.println("비밀번호: ");
				pwd1 = sc.next();
				System.out.println("회원가입이 완료되었습니다.");
			} else if(num == 3) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
			
		}

	}

}
