package getterSetter;

public class Person {
	// Ŭ���� �ȿ� ���� ������ �ν��Ͻ� ������ �ϰ� => ��ü ���� �� ��밡��
	private String name;
	private int age;
	//get, set �޼ҵ�� ������ ���� => set�� �Է�, get�� �����´�
	void setName(String name) {
		this.name = name;	//this�� �ν��Ͻ�
	}
	String getName() {
		return name;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	
	
}
