package throwing_Exception;

public class Thermostat {

	public void setTemperature(double temperature) throws Exception {

		if (temperature < 0 || temperature > 35) {
			// �µ����� ���������� ���ܼ� ����ó���Ѵ�. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���� �� ó��)
			throw new Exception("�µ��� ������ �Դϴ�."); // ���ܸ� ������
		}

		System.out.println("�µ� ���� : " + temperature); // �µ��� ������ ��� ���
	}

}
