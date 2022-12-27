package e_oop2;

public abstract class Animal {
	void run() {
		System.out.println("달린다!");
	}
	
	abstract void sound(); // 동물은 소리를 낼수 있다
	
}

class Dog extends Animal{

	@Override
	void sound() {//추상클래스 하고 // 동물은 소리를 내지
		System.out.println("멍멍"); //재정의를 함! //강아지는 멍멍이라고
		
	}
	

}

class cat extends Animal {

	@Override
	void sound() {
		System.out.println("야옹");
		
	}
	
}
// 인터페이스는 추상??? 그거에요....
