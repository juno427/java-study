package application;

public class Break {

	public static void main(String[] args) {
		// �ݺ��� �ȿ��� ���������� ���ɾ� break;
		int count = 0;

		while (true) {
			System.out.println("��ο�~ " + count);

			if (count == 5) {
				break;
			}

			System.out.println("�Ͽ���?");

			count++;
		}

		System.out.println("���α׷� ����");

	}

}