package applocation;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// JFrame으로 윈도우 창 만들기
		SwingUtilities.invokeLater(() -> { // 안정적으로 자바swing프로그램을 실행가능하게 함.

			new MainFrame("테스트 스윙"); // 새창 mainFrame을 생성

		});

	}

}
