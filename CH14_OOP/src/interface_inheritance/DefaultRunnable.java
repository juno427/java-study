package interface_inheritance;

// �������̽��� �������̽��� ���
public interface DefaultRunnable extends Runnable {
	default void displayDetails() { // ����Ʈ �޼ҵ�� �޼ҵ� �ڵ带 �����.
		System.out.println("ǥ���� ������ ����.");
	};

}
