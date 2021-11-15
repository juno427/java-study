package operators;

public class AND_OR {
	public static void main(String[] args) {
		// ��Ʈ���� AND, OR

		//System.out.println(toBinary(15));

		int value1 = 0b01010011;
		int value2 = 0b11010110;

		int result1 = value1 & value2; // ��Ʈ AND ����

		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1)); // And ������
		System.out.println();
		
		int result2 = value1 & value2; // ��Ʈ OR ����

		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result2)); // OR ������
	}

	private static String toBinary(int n) {
		// 8�ڸ� �������� �����ֱ� ���� �޼ҵ�
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}

}
