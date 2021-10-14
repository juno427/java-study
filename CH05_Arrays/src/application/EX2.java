package application;

public class EX2 {

	public static void main(String[] args) {
		// 1. 3X3 정수 배열을 만든다. 숫자는 (1,5,7)(9,6,3)(2,4,6)
		// 2. 정수배열을 for문을 사용해 전체 숫자의 합을 구한다.
		// 3. r그 합 total 값을 출력한다.

		int[][] values = { { 1, 5, 7 }, { 9, 6, 3 }, { 2, 4, 6 }, };
		
		int total = 0;
		for (int i = 0; i < values.length; i++) {
			
			for(int j = 0; j < values[i].length; j++) {
				total = total + values[i][j];
			}
		}
		
		System.out.println("총합은 : "+total);

	}

}
