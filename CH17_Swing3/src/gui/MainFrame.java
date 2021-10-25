package gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); // JFrame�� Ÿ��Ʋ�� �����ϵ���
		
		MainPanel mainPanel = new MainPanel();

		setLayout(new BorderLayout()); //����������â�� ������Ʈ�� ���̱� ����
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);

		setSize(600, 400); // â ������
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // â�� ���� �� ���α׷� ����
		setVisible(true); // ���̰� �ϱ�
	}

}
