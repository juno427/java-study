package practice;

public class MemberService {
	// 필드
	String id;
	String password;

	// 메소드
	boolean login(String id, String password) {
		if (id == "hong" && password == "1234") {
			return true;
		} else {
			return false;
		}

	}

	void logout(String id) {

		System.out.println("로그아웃 되었습니다.");

	}

}