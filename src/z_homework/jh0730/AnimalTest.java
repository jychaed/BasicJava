package z_homework.jh0730;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal lion = new Animal();
		Tiger tiger = new Tiger();
		
		
		Animal bakHo = new Tiger(); // 업케스팅 
		System.out.println("-------");
		bakHo.walk();
	
		//1. TMP 클래스를 하나 만들어 Tiger 로
		Tiger tmp = new Tiger();
		tmp = (Tiger)bakHo; // 형변환 이게 다운캐스팅
		tmp.hunt();
		//2.
		Tiger t = (Tiger)bakHo;
		t.hunt();// 백호의 시야가 넓어짐
		
		System.out.println("-------");
		lion.walk();
		lion.sound();
	
		
		tiger.walk();
		tiger.sound();
		tiger.hunt();
		
		tiger.Ageupgrade(29);
		System.out.println(tiger.age);
		
	}
}
