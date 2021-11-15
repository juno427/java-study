package explain;

import java.util.Scanner;

public class EarthMain {
	static Scanner scan = new Scanner(System.in);
	static String userName;

	public static void main(String[] args) {
		System.out.println("����� ���� �Է����ּ���: ");
		userName = scan.nextLine();

		System.out.println("				*���α׷� ����*");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(userName + "�� �ȳ��ϼ���.");
		System.out.println("�������� ������ ������� �����ϰ� �ֽ��ϴ�.");
		System.out.println("�� ���α׷��� ���� ������ ���� ������ �����ϴ� ���α׷��Դϴ�.");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("��� �����Ͻ÷��� ����Ű�� �����ּ���.");
		String start = scan.nextLine();

		System.out.println("����� �����ϼ���.");
		System.out.println("[1.�ƽþ�]");
		System.out.println("[2.����]");
		// System.out.println("[3.�ϾƸ޸�ī]");
		// System.out.println("[4.���Ƹ�Ű��]");
		// System.out.println("[5.�����ƴϾ�]");
		// System.out.println("[6.������ī]");
		System.out.println("��ȣ �Է� : ");

		while (true) {

			int continent = scan.nextInt();
			System.out.println("��ȣ �Է� : ");
			switch (continent) {

			case 1:
				ASIA();
				System.out.println("1.���ѹα�");
				System.out.println("2.�߱�");
				System.out.println("3.�Ϻ�");
				String id1 = scan.next();

				if (id1.equals("1")) {
					System.out.println("-------------------���ѹα��� ���� ������ ����մϴ�.--------------------------");
					System.out.println();
					System.out.println(
							"���ƽþ��� �ѹݵ� ���ܿ� �ڸ��� ���ְ�ȭ���̴�.\n�������� ��ȭ�ιΰ�ȭ���� Ȳ�ظ� ���̿� �ΰ�, �������� �Ϻ��� ���ظ� ���̿� �ΰ�, �������� �������������ιΰ�ȭ���� �ѹݵ� ���� �а輱�� ���̿� �ΰ� �´�� �ִ�.\n���ѹα��� ����� ���ѹα� ������� ���� �±ر�, ������ ������ ����ȭ�̴�. ������ �ѱ���� �ѱ� �����̴�.\n������ �����̴�. �α��� �� 5,100�� 100������ ��ü �α� �� ���� ������ �����ǿ� ��� �ִ�.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				}

				if (id1.equals("2")) {
					System.out.println("-------------------�߱��� ���� ������ ����մϴ�.--------------------------");
					System.out.println();
					System.out.println(
							"������ ��Ī�� �߱��̰� ��ȭ��� �θ��⵵ �Ѵ�. �� �ۿ��� ���ܿ����� �߰�(�߱� ������� ��Ī)�̶�� �θ��⵵ �Ѵ�.\n������ ����¡���̸�, �ִ� ���ô� �����̽��̴�. �̹��� �ֿ� ���÷δ� �������, ��¡��, �þȽ�, Ǫ�����, Ī�ٿ���, ��Ī�� ���� �ִ�.\n�߱��� 56�� ������ ������ ��κ��� �����̴�. ������ �߱� ��ü �α��� 92%�� �����ϰ� ������ �� �� 55���� �Ҽ� �������� 8%�� �����ϰ� �ִ�. �߱� ��ü�� �α��� 2016�⵵ ���� �� 13�� 7437�����̴�.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				}

				if (id1.equals("3")) {
					System.out.println("-------------------�Ϻ��� ���� ������ ����մϴ�.--------------------------");
					System.out.println();
					System.out.println(
							"���ƽþƿ� �ִ� ������ ����翡 �ִ� �Ϻ� ������ �� ���� ū ��(ȥ��, �Խ�, ������, ��ī�̵�)�� �̵� �ֺ��� ������ ���� ����� �����Ǿ� �ִ�.\n�α��� �� 1�� 2,600�� ������ ���迡�� 11��°�� ����.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				} else {
					System.out.println("");
					System.out.println("�߸��� �Է��Դϴ�.");
					System.out.println("�ٽ� ������ �ּ���.");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				}
				
			case 2:
				EUROPE();
				System.out.println("1.����");
				System.out.println("2.����");
				System.out.println("3.������");
				String id2 = scan.next();

				if (id2.equals("1")) {
					System.out.println("-------------------���Ͽ� ���� ������ ����մϴ�.--------------------------");
					System.out.println();
					System.out.println(
							"���� �ߺο� �ִ� �����, ���� ���� �������� 1871�� �����̼�-������������ ���� ������������ �����Ǿ���.\n��2�� ������� ���� 1949�� ���Ͽ����ȭ��(����)�� ���Ϲ��ְ�ȭ��(����)���� �������ٰ� 1990�� ���ϵǾ���.\n�α��� 2020�� ���� �� 8378�� ������ ���� ��ü���� ���þƿ� ��Ű�� �̾� �� ��°�� �α��뱹�̴�.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				}

				if (id2.equals("2")) {
					System.out.println("-------------------������ ���� ������ ����մϴ�.--------------------------");
					System.out.println();
					System.out.println(
							"���� ��� �����ʿ� �ִ� �������, �׷���Ʈ�긮ư��(�ױ۷���, ����Ʋ����, ���Ͻ�)�� ���Ϸ��弶 ������ �Ͼ��Ϸ���� �̷������.\n1922�� ���Ϸ��� �������� ������ �� �Ͼ��Ϸ��尡 ������ �Ϻη� �������ν� ������ ���տձ��� �Ǿ���.\n��ġ������ ���屺������ �����ϴ� ��ȸ�������� �����̸�, �� ���迡�� �ǿ��������� ���� ó������ ����� �����̴�.\n�α��� 2020�� ���� �� 6771�� ���̴�.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				}

				if (id2.equals("3")) {
					System.out.println("-------------------�������� ���� ������ ����մϴ�.--------------------------");
					System.out.println();
					System.out.println(
							"���� ����� ����, �����ؿ� �뼭�� ���̿� ��ġ�ϸ�, �������� 3��°�� ū �����̴�.\n987�� ����ũ �ձ��� ����ϰ� ī�� ���� â�÷� ������ ������ �����Ǿ���.\n��������� ����, ��ȭ���� �ݺ��ϴٰ� 1871�� ��ȭ���� ���� ���� ���ÿ� �̸���.\n������ ������ û��, ���, ���� 3���� �̷���� ������̸� ���� ����, ���, �ھָ� ��¡�Ѵ�.\n���������γ� ��ȭ������ ���������� ���� �ֿ��� ������ �� �� ���� �� �ϳ��̴�. ������ ��ǥ���� ��� ���걹�̱⵵ �ϴ�.\n�α��� 2020�� ���� �� 6784�� ���̴�.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				} else {
					System.out.println("");
					System.out.println("�߸��� �Է��Դϴ�.");
					System.out.println("�ٽ� ������ �ּ���.");
					System.out.println("��� ����ȭ������ �̵��մϴ�.");
					System.out.println("[1.�ƽþ�]");
					System.out.println("[2.����]");
					continue;
				}
				
			}
			break;
		}	

	}

	private static void EUROPE() {
		System.out.println("������ ���� �������� ����� ����մϴ�.");

	}

	private static void ASIA() {
		System.out.println("�ƽþƿ� ���� �������� ����� ����մϴ�.");

	}
}
