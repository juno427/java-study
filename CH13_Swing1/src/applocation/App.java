package applocation;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// JFrame���� ������ â �����
		SwingUtilities.invokeLater(() -> { // ���������� �ڹ�swing���α׷��� ���డ���ϰ� ��.

			new MainFrame("�׽�Ʈ ����"); // ��â mainFrame�� ����

		});

	}

}
