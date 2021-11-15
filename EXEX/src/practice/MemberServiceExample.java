package practice;

public class MemberServiceExample {

	public static void main(String[] args) {
		// 객체 생성
		MemberService memberService = new MemberService();

		// 메소드 호출
		boolean result = memberService.login("hong", "1234");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("ID 또는 패스워드가 올바르지 않습니다.");
		}

	}

}
