package application;

public class Boolean {

	public static void main(String[] args) {
		// 불린 타입은 참, 거짓(true, false)
		boolean bool1 = false;

		System.out.println("조건1: " + bool1);

		// 비교 결과가 참 or 거짓
		boolean bool2 = 4 < 5;
		System.out.println("조건2: " + bool2);
		
		// 비교 결과가 참 or 거짓
		boolean bool3 = 2 > 8;
		System.out.println("조건3: " + bool3);
		
		// 비교 == 같다, != 같지않다, >=, <=
		boolean bool4 = 9 != 10;
		System.out.println("조건4: " + bool4);
		System.out.printf("조건4: %b \n" + bool4);
		
		

	}

}
