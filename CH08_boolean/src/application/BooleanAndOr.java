package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// AND OR ���ÿ� ���

		boolean isRaining = false; // �� ���°�?
		boolean mightRain = true; // �� �� ���� �ִ°�?
		boolean haveUmbrella = true; // ����� �ִ°�?

		if ((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����.");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}

		boolean rainCheck = isRaining || mightRain; // �� ���ų� �� ���� �ְų��϶� ��
		
		if ((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����.");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}

	}

}
