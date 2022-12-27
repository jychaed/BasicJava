package z_homework.jh0730_2;

public class Chae extends Human {

	
	Chae(){
		this.name = "채진영";
		this.color = "살색";
		this.age = 31;
		
	}
	
	@Override
	public void showInfo() {
		 System.out.println(super.name);
		 System.out.println(super.age);
		 System.out.println(super.color);
	}

	@Override
	public void talk() {
		System.out.println("채진영이 말한다");
		
	}

	
	

	
}
