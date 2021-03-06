package gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); // JFrame에 타이틀을 생성하도록
		
		MainPanel mainPanel = new MainPanel();

		setLayout(new BorderLayout()); //메인프레임창에 컴포넌트를 붙이기 위함
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);

		setSize(600, 400); // 창 사이즈
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 창을 닫을 때 프로그램 종료
		setVisible(true); // 보이게 하기
	}

}
