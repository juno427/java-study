package multiThread2;

public class App {

	private int value = 0;

	private synchronized void increment() { // synchronized로 한 쓰레드가 사용중에 다른 쓰레드 사용 못함.
		value++;
	}

	public void run() throws InterruptedException {
		// 멀티 쓰레드

		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		// t1.start() 메소드는 t1의 runnable 람다식 실행
		t1.start(); // 쓰레드 시작
		t2.start();
		t3.start();

		// System.out.println("Value : " + value);

		t1.join(); // 메인 쓰레드가를 마지막에 실행
		t2.join();
		t3.join();

		System.out.println("Value : " + value);
	}

	public static void main(String[] args) throws InterruptedException {
		// 앱 객체 생성해서 메소드 run 실행
		new App().run();
	}

}
