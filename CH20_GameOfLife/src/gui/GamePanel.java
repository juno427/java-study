package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import model.World;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 50; // ������ ũ�⼳��
	private final static Color backgroundColor = Color.BLACK; // ���� ������
	private final static Color gridColor = Color.GRAY; // ���ڼ��� ȸ��

	private int topBottomMargin; // �� �Ʒ� ����
	private int leftRightMargin; // ���� ������ ����
	private World world; // ���� ����

	public GamePanel() {
		// �����г��� ���� �ÿ� �̺�Ʈ��(���콺 �̺�Ʈ �߰�)
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if (e.getY() < topBottomMargin || e.getX() < leftRightMargin) {
					return; // ��� ���̱� ������ �׳� ����(������)
				}

				int row = (e.getY() - topBottomMargin) / CELLSIZE;
				int col = (e.getX() - leftRightMargin) / CELLSIZE;

				boolean status = world.getCell(row, col);
				world.setCell(row, col, !status); // ���� ������� üũ�ؼ� ����
				repaint(); // ���ΰ�ħ(�����г��� ���ν���)
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		// �� �޼ҵ�� �ڵ����� ���۹� ������ �ڽ��� ����� �׸���.
		Graphics2D g2 = (Graphics2D) g; // 2D�׷����� ����ϱ� ����

		int width = getWidth(); // ���α���
		int height = getHeight(); // ���α���

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

		int rows = (height - 2 * topBottomMargin) / CELLSIZE;
		int cols = (width - 2 * topBottomMargin) / CELLSIZE;

//		System.out.println(rows);
//		System.out.println(cols);

		if (world == null) { // ���� world�� �������� �ʾ����� ���� ����
			world = new World(rows, cols);
		}

		// world.setCell(0, 0, true); // grid ���߹迭�� ��ǥ(��,��) ���� true�� set

		g2.setColor(backgroundColor); // �� ����
		g2.fillRect(0, 0, width, height); // �簢���� ��ǥ�� ���� ĥ��
		drawGrid(g2, width, height); // ���� �ߴ� �޼ҵ�

		// ��ü �׸��� �迭���� ���� ������ ���� �ִ´�.
		for (int col = 0; col < cols; col++) {
			for (int row = 0; row < rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2, row, col, status);
			}
		}
	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status) {
		// �簢���� ���� �ִ� �޼ҵ�( �׷��Ȱ�ü, ������, ������, ����(true���,false����) )
		Color color = status ? Color.GREEN : backgroundColor; // ���׿����� status�� true�� ���
		g2.setColor(color);

		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);

		// x,y��ǥ ���� ���� ���� �Է��ؼ� �簢���� ���� ĥ�Ѵ�.
		g2.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);

	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		// ���� ���� �ߴ� �޼ҵ�
		g2.setColor(gridColor); // �� ����: ȸ��

		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			// ���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			// ���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}

	}

}