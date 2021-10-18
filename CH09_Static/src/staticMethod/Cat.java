package staticMethod;

public class Cat {
	private String name; // ����� �̸�
	private int id; // ����� ���̵�
	public static final String FOOD = "����� ���";
	// static ������ ��ü���� ��������
	private static int count = 0; // ������ ������� ����

	public Cat(String name) { // �����ڴ� ���� Ÿ���� ����(�Ϲ� �޼ҵ�� �ٸ�)
		this.name = name;
		// �ڵ��߰�
		count++; // ����� ��ü ������ static count�� +1�� ��.
		id = count;
	}

	@Override
	public String toString() { //toString �޼ҵ� �ڵ�����
		return "����� [���̵�="+ id + ", �̸�=" + name + "]";
	}
	
	public static int getCount() { // static �޼ҵ�
		// String n = name; static �޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		return count;
	}

}
