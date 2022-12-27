package z_homework.extends_test.a01;

public class Human {
	private String name; //필드에 선언했고
	private int age;
	
	public Human() {}
	
	public Human(String name, int age) { // 생성자
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age ;
	}
	
	
}
