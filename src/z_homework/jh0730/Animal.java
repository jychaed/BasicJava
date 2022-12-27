package z_homework.jh0730;

public class Animal {
	String name;
	int age;
	
	public Animal() {
		this.name = "동물";
		this.age = 0;
	}
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void walk() {
		System.out.println("동물이 걷는다");
	}
	
	public void sound() {
		System.out.println("동물이 운다");
	}
	
	public int Ageupgrade(int a ) {
		
		 this.age = a;
		return this.age;
		
	}
}
