package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Korea extends Country {
		public Korea() {
			super();
			start();
			
			System.out.println("동아시아의 한반도 남단에 자리한 민주공화국이다.\n서쪽으로 중화인민공화국과 황해를 사이에 두고, 동쪽으로 일본과 동해를 사이에 두고, 북쪽으로 조선민주주의인민공화국과 한반도 군사 분계선을 사이에 두고 맞닿아 있다.\n대한민국의 국기는 대한민국 국기법에 따라 태극기, 국가는 관습상 무궁화이다. 공용어는 한국어와 한국 수어이다.\n수도는 서울이다. 인구는 약 5,100만 100명으로 전체 인구 중 절반 정도가 수도권에 살고 있다.");
			
		}
		private void start() {
			new BufferedReader(new InputStreamReader(System.in));
		}
		
}
