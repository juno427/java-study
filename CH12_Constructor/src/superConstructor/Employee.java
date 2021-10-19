package superConstructor;

public class Employee extends Person {
	public Employee() {
		super("익명"); //생략됨 (Person의 생성자를 가리킴)
		System.out.println("Emp 생성자");
	}

}
