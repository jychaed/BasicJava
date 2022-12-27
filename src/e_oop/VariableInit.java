package e_oop;

public class VariableInit {

	//명시적 초기화
	int var = 10;
	static int staticVar =20;
	
	//초기화 블럭
	{
		var = 20;
	}
	
	//static 초기화 블럭
	static {
		staticVar = 30;
		// var = 30; 스태틱 블럭에서 초기화 할 수 없다.
	}
	
	/* 
	 * 생성자
	 * - 클래스와 같은 이름의 메서드
	 * - 인스턴스 변수를 초기화하기 위해 사용한다.
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	 * - 생성자는 리턴타입이 없다.
	 *  */
	VariableInit(){
		var = 40;
		
		// 생성자 사용이유
		// 초기화에 여러줄의 코드가 필요할 때
		// 초기화에 파라미터가 필요할 때
	}
	
	
	public static void main(String[] args) {
		Init i1 = new Init();
		System.out.println(i1.a);
		
		DditClass c404 = new DditClass();
		System.out.println(c404.컴퓨터);
		System.out.println(c404.담임);
		c404.담임 = "이철희";
		System.out.println(c404.담임); //이철희
		
		DditClass c501 = new DditClass();
		c501.컴퓨터 = 50;
		c501.학생 = 50;
		c501.담임 = "홍길동";
		
		DditClass c502 = new DditClass(50,50,"아이유");
		System.out.println(c502.담임); //아이유

	}

}

class DditClass{
	int 컴퓨터;
	int 학생;
	String 담임;
	
	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	DditClass(int 컴퓨터, int 학생, String 담임){//파라미터 3개 있고 = 생성자
		// this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용
		this.컴퓨터 = 컴퓨터;
		this.학생 = 학생;
		this.담임 = 담임;
	}
	DditClass(int 컴퓨터, int 학생){//파라미터 2개 있고
		
	}
	//파라미터의 형식과 갯수를 비교하여 다르다면 오버로딩이 가능하다.
	DditClass(int 컴퓨터){//파라미터 2개 있고
		
	}
//	DditClass(int 학생){//파라미터 2개 있고
//		
//	}
	
	
	DditClass(){//파라미터 없고 //= 기본생성자
//		컴퓨터 = 25;
//		학생 = 25; 나도 쓸래!
		this(25,25, null); //()괄호가 있으면 메서드
		// this() : 생성자를 의미함
	}
	
	
	
}



class Init{
	int a;
	int b;
	int c;
	// int a,b,c; << 이렇게는 잘 안써요! 구분이 잘 안돼
	
	Init(){
		a = 10;
		b = 20;
		c = 30;
		
	}
	
	
	
}












