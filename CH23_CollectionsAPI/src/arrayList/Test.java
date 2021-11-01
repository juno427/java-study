package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// ��ĳ�ʸ� ����� ����Ʈ�� �Ǽ��� �Է��� ���
		Scanner scanner = new Scanner(System.in);

		List<Double> numbers = new ArrayList<>();
		
		double total = 0;
		
		while (true) {

			System.out.print("���� �Ǵ� 'q' �Է� > ");

			String input = scanner.nextLine(); // ���� ������ �Է��� ���ڿ��� ����

			input = input.trim(); // ���� ������ �� �ڿ� ������ ����

			if (input.equals("q")) { // equalsIgnoreCase = ��ҹ��ڸ� ���� 'q' 'Q'
				break; // ���� �Ԏ��� ���ڿ��� "q"�� ������ �ݺ��� ����
			}

			try {
				double value = Double.parseDouble(input); // ���ڿ� ���ڸ� => �Ǽ��� ����
				numbers.add(value); // �Է��� �Ǽ��� ����Ʈ�� ����
				total = total + value;
			} catch (Exception e) {
				// ���ܹ߻� �Ǽ��� ��ȯ�� �� ����
				System.out.println("���ڰ� �ƴմϴ�.");
				continue;
			}

		}

		scanner.close();

		System.out.println();

		if (numbers.size() > 0) {
			System.out.println("�Էµ� ���� : ");

			Collections.sort(numbers); // ����Ʈ�� �����Ѵ�.
			for (Double number : numbers) {
				System.out.printf("%.2f\n", number);
			}
			System.out.println();
			System.out.printf("��հ� : %.2f ", total / numbers.size());
		} else {
			System.out.println("�Ǽ��� �Էµ��� �ʾҽ��ϴ�.");
		}

	}

}
