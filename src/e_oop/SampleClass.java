package e_oop;

public class SampleClass { //클래스는 항상 대문자가 앞에 있다
	//new SampleClass().flowTest1(); // 필드에서 실행 할 순 없고?
	//String newStr = new SampleClass().flowTest1(); //flowTest1 의 결과물이  없어
	
	public static void main(String[] args) { //소문자() 이건 메서드
		int local = 10;
		//지역변수 : 메서드 안에서만 사용 가능
		
		new SampleClass().flowTest1();	
		//flowTest1();
	}
	/*
	 * field
	 * 
	 * */
//	boolean field = false; //이렇게 쓰지않아도! 아래처럼 가능
	boolean field;
	//전역변수 : 클래스 전체 영역에서 사용가능
	//초기화하지 않아도 기본값으로 초기화
	String classNumber = "404"; // 참조형변수의 기본값 null
	
	/* 
	 * - 메서드(method) : 변수를 가지고 하는 작업(일)
	 * - 선언 방법 : 접근제한자 리턴타입 매서드명(파라미터){}
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	 *  */
	
	public void method1() { // void 리턴을 안한다
		// void : 메서드가 종료 후 반환하는 결과물이 없음 // 보고 끝나는 행위, 보고 남은게 없음
		// 파라미터가 없음 // ()안에 아무 것도 없다, 실행하기 위한 정보가 필요없다
		System.out.println("리턴타입도 파리미터도 없음");
		
	}
	
	public void method2(String parameter) {
		// String 타입의 파라미터가 필요하다
		System.out.println(parameter + "파라미터를 받아 명령을 수행함");
		// 메서드가 알아보다 뭐를? 눈이없으면 볼 수 없다(파라미터)
		
	}	
		
	public String method3() {
		// 메서드가 종료 후 반환하는 결과물이 String 타입
		String str = "";
		return str; //return 메서드를 종료한다
		// 반환값을 지정을 해줘야 오류가 안납니다.
		// 메서드를 끝낸다
		// System.out.println("메서드 종료"); // 위에서 끝나서 도달할 수 없다
										  // 도달할 수 없는 코드
		
	}
	
	// flowTest1() 호출시 출력되는 문장에 번호를 붙여주세요.
	public void flowTest1() {
		System.out.println("flowTset1 시작 : 1");
		flowTest3(); //메서드호출
		System.out.println("flowTset1 종료 : 6");
		
	}
	public void flowTest2() {
		System.out.println("flowTset2 시작 : 3");
		System.out.println("flowTset2 종료 : 4");
		
	}
	public void flowTest3() {
		System.out.println("flowTset3 시작 : 2");
		flowTest2();
		System.out.println("flowTset3 종료 : 5");
		
		
	
		
	}
	
	
}

	







	
	
	
	