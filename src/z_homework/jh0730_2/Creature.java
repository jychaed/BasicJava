package z_homework.jh0730_2;

public abstract class Creature {
	String name;
	int age;
	String color;
	
	
	public Creature() {
	
		this.name = "생물";
		this.age = 0;
		this.color = "검정";
	}



	public abstract void showInfo();
	
	
}
