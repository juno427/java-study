package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {
		// ���׸� Ÿ�� Ŭ������ ��ü�� ���� �� Ÿ���� �����Ѵ�.
		Wrapper<Cat> wrapper = new Wrapper<>(); // ���� Ŭ������ ��ü�� ����
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		
		Cat cat = new Cat("��ƿ��"); // ����� ��ƿ�� ��ü�� ����
		Creature creature = new Creature("����");
		
		wrapper.set(cat); // ���� ��ü�� set�޼ҵ忡 ��ƿ�� �Է�
		wrapper2.set(creature);
		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.feed();
		r2.feed();

	}

}
