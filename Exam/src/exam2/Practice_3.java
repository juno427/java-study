package exam2;

public class Practice_3 {

	public static void main(String[] args) {
		// �Է� ���ڿ��� �Ǽ��� ����ȯ
		double f = Double.parseDouble(args[0]);
		// ȭ���µ��� ���� ������ ���
		double c = (f-32.0)/1.8;
		// printf() �޼ҵ带 ���� ���ڿ� ���
		System.out.printf("%.1f�� => %.1f�� �Դϴ�.", f, c);

	}

}
