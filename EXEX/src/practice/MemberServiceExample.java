package practice;

public class MemberServiceExample {

	public static void main(String[] args) {
		// ��ü ����
		MemberService memberService = new MemberService();

		// �޼ҵ� ȣ��
		boolean result = memberService.login("hong", "1234");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("ID �Ǵ� �н����尡 �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
