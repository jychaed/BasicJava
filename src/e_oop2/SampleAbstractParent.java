package e_oop2;

public abstract class SampleAbstractParent {
	// 클래스는 클래스인데 추상적이다
	void method() {
		
	}
	
	//추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod(); // 반드시 이런 기능은 있어야해 예를들면 타이어는 굴러가야지? 
	//{}이게 없어요! 이 메서드가 있다라고만 알려줘요	
	
}

class SampleAbstractChild extends SampleAbstractParent{
	
	// 추상클래스를 상속받으면 추상클래스 안에 있는 추상 메서드를
	// 반드시 오버라이드 해야한다.
	@Override
	void abstractMethod() {
		
	}
}
