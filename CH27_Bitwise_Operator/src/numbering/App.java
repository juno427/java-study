package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10���� : decimal 0-9
		 * 2���� : binary 0-1 //��ǻ�Ͱ� ���
		 * 16���� : hexadecimal 0-F //�������� �������� ǥ��
		 * �� 1234, 010010, 1B2F
		 */
		
		int value = 123;
		
		System.out.println(Integer.toBinaryString(value)); // �������� ��ȯ
		System.out.println(Integer.toHexString(value)); // 16������ ��ȯ
		System.out.println();
		
		int value255 = 0xFF; // 0x�� 16������ �ǹ�, 0b�� ������
		System.out.println(value255);
		System.out.println(Integer.toBinaryString(value255)); // �������� ��ȯ
		System.out.println(Integer.toHexString(value255)); // 16������ ��ȯ
		
		
	}

}
