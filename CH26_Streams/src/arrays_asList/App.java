package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// �迭�� ����Ʈ��
		List<String> names = Arrays.asList("Eric", "Elena", "Java");

		names.stream()
				.filter(name -> name.contains("a")) // ���ڿ��� a�� ������ �� �ƴϸ� ����
				.map(String::toUpperCase) // �빮��
				.forEach(System.out::println); // ���

		List<Integer> numbers = Arrays.asList(9, 4, 6, 3, 2, 1);

		numbers.stream()
				.filter(n -> n > 3) // 9,4,6�� ���´�
				.sorted() // 4,6,9
				.map(n -> n * 10) // 40, 60, 90
				.forEach(System.out::println);

	}

}