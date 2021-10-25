package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorListener implements ActionListener {
	private ColorChangeListener colorChanger;
	private Color color;

	public ColorListener(ColorChangeListener colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		colorChanger.changeColor(color);

	}

}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");

		redButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.RED); // ���콺 Ŭ���� ����
			}
		});
		
		// ���ٽ�
		blueButton.addActionListener(e->colorChanger.changeColor(Color.BLUE));
			
		add(redButton);
		add(blueButton);

	}

}
