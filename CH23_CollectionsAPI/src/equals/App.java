package equals;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object other) {
		// �������̵�
		String a = "abc";
		String b = "def";
		a.equals(b);

		if (other == null)
			return false; // �ΰ��̸� false
		if (other == this)
			return true; // ���� ��ü�� true
		if (!(other instanceof Person))
			return false; // ���� Ÿ���� �ƴϸ� false
		if (this.name == null)
			return false; // this ��ü�� �̸����� ���̸� false
		Person p = (Person) other; // �ٿ�ĳ���� Ÿ�Ժ�ȯ
		if (p.name == null)
			return false; // other ��ü�� �̸����� ���̸� false

		return this.name.equals(p.name); // ���ڿ��� equals �޼ҵ�(��, ���ڿ� ��ü�� ��)
	}

}

public class App {

	public static void main(String[] args) {
		// equals �޼ҵ�
		Person p1 = new Person("���");
		Person p2 = new Person("���");

		System.out.println(p1 == p2); // ��ü�� �ּҸ� ��
		System.out.println(p1.equals(p2)); // equals �޼ҵ带 �ٽ� �ۼ��Ͽ� �̸������� ��

	}

}
