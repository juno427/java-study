package timer_ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert extends TimerTask {

	@Override
	public void run() {
		System.out.println("???? ???? ??");
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "???? ???? ?Ϸ?");

	}

}

public class App {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 5000, 5000);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(new Task(), 30, 30, TimeUnit.SECONDS);

	}

}
