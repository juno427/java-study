package example;

public class Split_String {

	public static void main(String[] args) {
		// ���ڿ�.Split(" ") => ���ڿ��� ����(space)���� �ɰ��� �迭�� ����
		String text1 = "Code readability is a big thing. Developers spend a lot of our time reading code: other peoples code, our own code, code we have never seen before, etc. Writing code in a way that is as readable as possible can help save everyone on your team a lot of time. Readability can sometimes be a bit of a trade off with performance, but I try to stay on the readable side as often as possible.";
		String text2 = "��� ���� �ܿ� �ܼ��� ������ ������ �������� ���� ���� ���Ǵ� �κ��ӿ��� �ǽ��� ������ �����ϴ�. Ư�� ������� �ڵ忡 'console.log()'�� �־� ������ϴ� ���� �����Ͽ� ���� ���� �Ͼ�� �ִ��� �˾ƺ��ϴ�. ���⿡�� �� ���� ������ ������ ��ũ��Ʈ�� ������ϴ� �� ���� ����� ������ �̰��� ������� �ϴ� ���̹Ƿ� �ش� ������ �� ���� ����� ����� ���� �̾߱��� ���ڽ��ϴ�. ù ��° ������ ��ǰ�� �ܼ��� ������ �� �� ���ŵ��� �ʴ� �α� �޽����Դϴ�. ����� ã�� �ִ� ������ ã�� ���� ���� ���̸� �װ��� �ٷ�� ���� ���� ����� ��� ������ �ܼ� ���͸� �ɼ� �� ���� ���� �� �Դϴ�. �̸� ����Ͽ� �ܼ��� ���� ���� �ִ� �׸����� ���͸��ϰ� ���� ������ ������ �� �ֽ��ϴ�.";
		
		String[] words = text1.split("[^a-zA-Z]+"); // ����ǥ����[] ^���۹���

		for (String w : words) {
			if (w.length() < 2)
				continue; // �� ö�� ���ϴ� ����

			System.out.println(w.toLowerCase()); // ���� �ҹ��ڷ� ���
		}

	}

}
