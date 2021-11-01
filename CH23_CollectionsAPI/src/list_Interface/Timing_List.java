package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		// ��̿� ��ũ�� ����Ʈ�� ����ð� ��
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		// Ŭ���� �����ö� ����Ű Ctrl+Space, ������ �Ѳ����� Ctrl+ Shift + o

		long duration = timeOperation(linkedList);

		System.out.println("���� �ð� : " + duration);
		// �׳� ������� �߰��Ҷ� ��̸���Ʈ�� ��ũ�� ���� 5���̻� ������.
		// Ư�� ��ġ�� �߰� �Ǵ� �����Ҷ� ��ũ�� ����Ʈ�� 10��� ������.
	}

	private static long timeOperation(List<Integer> list) {
		// �Է¹��� ����Ʈ�� ����ð��� �����ؼ� ����
		long start = System.currentTimeMillis(); // ���� �ð��� 1/1000�� ������ ����

		for (int i = 0; i < 100000; i++) {
			list.add(0, i); // �ʸ��� �Է�
		}

		return System.currentTimeMillis() - start; // �۾��� ���������� �����ð�-�����ð�
	}

}