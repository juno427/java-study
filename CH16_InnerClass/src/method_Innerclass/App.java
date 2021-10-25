package method_Innerclass;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name;

	public App() {
		// �⺻ ������
		name = "�ٸ��ں���";
	}

	public String getName() {
		return name;
	}

	public void run() {
		//System.out.println(name); // �̸��� ���
		class Printer implements Runnable {
			@Override
			public void run() { //�߻�޼ҵ带 �ϼ��Ѵ�.
				System.out.println(name); //Ÿ�̸ӷ� �ݺ��� �ڵ�
				
			}
		}
		
		//new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0, 1, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		// �޼ҵ� ���� Ŭ����
		 App app = new App();
		 app.run();

	}

}
