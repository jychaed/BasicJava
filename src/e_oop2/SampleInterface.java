package e_oop2;

public interface SampleInterface { //인터페이스는 틀의 개념으로 사용// 그래서 final값으로 하는데// 거의 선언하지않아요(전역변수)
									// 그 변수의 변화시키기 어렵고 해서 잘 안씀????????
	// 인터페이스의 모든 멤버변수(전역변수)는 public static final 제어자를 사용한다.
	public static final int NUM1 = 1;
	
	// 모든 멤버변수(전역변수)의 제어자가 같기때문에 생략이 가능하다.
	int NUM2 = 2; // 어짜피 파이널이여... 생략가넝 일반적인 변수는 기울어있지않아요
	
	// 인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
										// 클래스는 상속받는다고하고 인터페이스는 구현한다고 표현함
	
	// 모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
}

interface SampleInterface2{
	void method3();
	void method4();
	
}

interface SampleInterface3{
	void method5();
}

				//extends Animal 이건 상속이니까 1개만//implements SampleInterface 이건 인터페이스니까 여러개 가능
class SampleImplement extends Animal implements SampleInterface, SampleInterface2, SampleInterface3{// 인터페이스가 요새 기능적 면에서 사용 많음// 모듈화할때 좋음
		// ㄴ이거 밑줄생기면 구현하지 않은 메서드를 구현하겠냐>? 그럼 add 추가해라
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() { //implements SampleInterface로 생김
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {//implements SampleInterface로 생김
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sound() {//extends Animal 추가 상속받아서 생성됨
		// TODO Auto-generated method stub
		
	}
	@Override
		public String toString() { // toString 하고 ctrl+space
			// TODO Auto-generated method stub
			return super.toString();
		}
	
	
}









