package gui;

import java.awt.*;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();

	public MainFrame() {
		super("Game Of Life");// Ÿ��Ʋ��

		setLayout(new BorderLayout()); // ���̾ƿ� ��������
		add(gamePanel, BorderLayout.CENTER); // ���� �г��� ���

		setSize(800, 600); // â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ ���α׷� ����
		setVisible(true); // ���̰� �ϱ�
	}

}
