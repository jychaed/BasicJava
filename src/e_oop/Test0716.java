package e_oop; //<< 이건 패키지고

import java.lang.reflect.Method;

public class Test0716 { //접근제한자 클래스 클래스명 <<클래스고
	
	public static void main(String[] args) {  //<< 메서드고
		//접근제한자        리턴타입 매서드명(파라미터)      {}
		// public    static   void    main   (String[] args) {}
		// 메서드는 변수를 가지고 하는 작업
		// 파리미터=매개변수 : 실행에 필요한 정보
		// 리턴타입=반환타입 : 실행 후 돌려줘야하는 결과물

		 int a = 10; // 이건 지역변수
		 System.out.println(a);
		 
		 	
//		 System.out.println(classNumber); // << 1) 메서드 안에서 실행되는중
		 
		 new Test0716().methodtest1();
		 new Test0716().methodtest2();
		 
		 
		 
	}

	// 여기가 클래스 안쪽에 있는 field! // 메서드 안에 있는 거 아님
	
	boolean field;
	String classNumber = "null"; //<< 여기에 쓴게  1)
	
	public void methodtest1() { //< 현재 클래스 안에 이쏙 메서드 밖에 있음
		System.out.println("나는 현재 메서드 밖에 있는 객체이고 1번도출");
		methodtest3();
		System.out.println(" 메서드 3돌고나서 나오는건가");
	}
	
	public void methodtest2() { 
		System.out.println("methodtest2 시작 이고 ");	
		methodtest1();
	}
	
	public void methodtest3() { 
		System.out.println("methodtest3 시작 이고 ");		
	}
	
}
