package application;

public class ForEachArray {

	public static void main(String[] args) {
		// for each �ݺ���
		int[] numbers = { 2, 4, 6 };
		String[] fruits = { "�ٳ���", "���", "����" };

		for (int number : numbers) {
			System.out.println(number);
		}

		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
