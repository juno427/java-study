package timer_example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert extends TimerTask {
	@Override
	public void run() {
		System.out.println("����!");
	}

}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("��ο�!");
	}
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0L, 1000L);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);
	}
}
