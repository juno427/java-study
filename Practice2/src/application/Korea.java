package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Korea extends Country {
		public Korea() {
			super();
			start();
			
			System.out.println("���ƽþ��� �ѹݵ� ���ܿ� �ڸ��� ���ְ�ȭ���̴�.\n�������� ��ȭ�ιΰ�ȭ���� Ȳ�ظ� ���̿� �ΰ�, �������� �Ϻ��� ���ظ� ���̿� �ΰ�, �������� �������������ιΰ�ȭ���� �ѹݵ� ���� �а輱�� ���̿� �ΰ� �´�� �ִ�.\n���ѹα��� ����� ���ѹα� ������� ���� �±ر�, ������ ������ ����ȭ�̴�. ������ �ѱ���� �ѱ� �����̴�.\n������ �����̴�. �α��� �� 5,100�� 100������ ��ü �α� �� ���� ������ �����ǿ� ��� �ִ�.");
			
		}
		private void start() {
			new BufferedReader(new InputStreamReader(System.in));
		}
		
}
