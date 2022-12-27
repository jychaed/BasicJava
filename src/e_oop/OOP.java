package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍 (Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라
		 * 	  객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * */ 
		
		// 객체 : 클래스를 이용하여 만든 것
		SampleClass sc1 = new SampleClass();  //new SampleClass(); 이게 생성자
		SampleClass sc2 = new SampleClass();  // 클래스 명과 생성자 명이 같아!		
		SampleClass sc3 = new SampleClass();		
		
		System.out.println(sc1.classNumber); //404
		System.out.println(sc2.classNumber); //404
		sc2.classNumber = "405";
		System.out.println(sc2.classNumber); //405
		
		sc3.flowTest1();
		sc3.method2("parameter");
		
		System.out.println("=================================");
		
		
		
		
		// 방금 만든 클래스(ClassMaker)의 객체를 생성하고 변수에 저장해주세요.
		// 객체가 저장된 변수를 통해 메서드를 호출해주세요
		// 파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		// 리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		 
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		int a = cm.method2(); // 리턴받은 결과값을 다음에도 사용하고싶을때
		System.out.println(a); // 다음에 사용한다
		System.out.println(cm.method2()); // 리턴값을 재사용할 필요가 없을때
		// random! 관련 생각하기
		
		cm.method3("abc");
		int b = cm.method4(2, 5); //int e_oop.ClassMaker.method4(int a, int b)
						  //int반환하고,e_oop 패키지, ClassMaker클래스,method4메소드,(int a, int b)
						  // 결과 값은 int가 나오겠구나
		System.out.println(b);
		
		
		// 다음을 한줄씩 계산해서 최종 결과값을 출력해 주세요
		// Calculator 클래스를 만들고 각 번호별 메소드를 만들어주세요
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		
		System.out.println("================");
		Calculator c = new Calculator(); //계산기 클래스의 객체를 만들었습니다.
		
		double result = c.add(123456, 654321); //1	
		System.out.println(c.add(123456, 654321));
		System.out.println(result);
		System.out.println("================");

		result = c.multiply(result, 123456); //2
		System.out.println(c.multiply(result, 123456));
		System.out.println(c.multiply((c.add(123456, 654321)), 123456));
		System.out.println();
		System.out.println("================");
		
		result = c.divide(result, 123456); //3	
		System.out.println(c.divide(result, 123456));
		System.out.println();
		System.out.println("================");
		
		result = c.subract(result, 654321); //4		
		System.out.println(c.subract(result, 654321));
		System.out.println();
		
//		result = c.remainder(result, 123456); //5		
		System.out.println(c.remainder(result, 123456));
		System.out.println();

		
		
		
		
		
		
		
	
	}
	
}
