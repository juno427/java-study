package application;

import collections.Pair;
import heirarchy.Cat;

public class App2 {

	public static void main(String[] args) {
		// ���׸� Ÿ�� Ŭ������ ��ü�� ���� �� Ÿ���� �����Ѵ�.
		// Integer�� ���� int�� Ŭ�������̴�
		Pair<Integer, Cat> pair = new Pair<>(5, new Cat("��ƿ��"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());

	}

}
