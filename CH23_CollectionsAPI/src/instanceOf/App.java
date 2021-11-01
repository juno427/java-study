package instanceOf;

import java.io.Serializable;

//ũ��ó Ŭ������ �ø����������̽��� �����Ͽ� ����Ʈ id�� �������
class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
}

//Cat Ŭ������ ũ��óŬ���� ����ؼ� ����Ʈ id ��������
class Cat extends Creature {
	private static final long serialVersionUID = 1L;

}

public class App {
	public static void main(String[] args) {
		// ��ü�� Ÿ���� �Ǻ��Ѵ�.
		Creature c1 = new Creature();
		Object c2 = c1; // Object�� �ֻ��� Ŭ���� Ÿ������ ��� Ŭ���� Ÿ�Կ��� ���𰡴�(��ĳ����)

		Cat c3 = new Cat();

		Serializable c4 = (Serializable) c3;

		System.out.println(c4 instanceof Object); // Ojbect�� �ֻ��� Ŭ�����̹Ƿ� true

		System.out.println(c4 instanceof Serializable); // Serializable �������̽� �����߱� ������ true

		System.out.println(c4 instanceof Creature); // ũ��ó Ŭ������ ��ü��

		System.out.println(c4 instanceof Cat); // c1�� Ĺ Ŭ������ �ƴϹǷ� false

	}

}