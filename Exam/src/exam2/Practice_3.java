package exam2;

public class Practice_3 {

	public static void main(String[] args) {
		// 입력 문자열을 실수로 형변환
		double f = Double.parseDouble(args[0]);
		// 화씨온도를 통해 섭씨를 계산
		double c = (f-32.0)/1.8;
		// printf() 메소드를 통한 문자열 출력
		System.out.printf("%.1f도 => %.1f도 입니다.", f, c);

	}

}
