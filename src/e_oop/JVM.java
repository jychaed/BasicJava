package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM (Java Virtual Machine)
		 * - 자바로 만들어진 프로그ㄹ램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * - 운영체제 -> JVM -> 자바 프로그램
		 * - 장점 : 운명체제외 상관없이 실행할 수 있다.
		 * - 단점 : 속도가 비교적 느리다.
		 * 
		 * JVM 메모리 구조
		 * - Method Area (메서드 영역) : 클래스 멤버가 저장된다.
		 * - Call Stack (호출 스택) : 현재 호출되어있는 메서드가 저장된다.
		 * - Heap (힙) : 객체가 저장된다.
		 * 
		 * */
		
		// 1. 프로그램이 실행시 main(), classVar(), classMethod()가
		// MethodArea에 저장됨
		   //static붙으면 시작하자마자 메모리에 올라감
		// 2. main()이 호출되어 CallStack에 저장됨
		
		System.out.println(classVar);
		// 3. System클래스의 out이 MethodArea에 저장됨
		// 4. println()이 호출되어 CallStack에 저장됨
		// 5. println()이 classVar를 출력 후 CallStack에서 제거됨
		
		
		classMethod();
		// 6. classMethod()가 호출되어 CallStack에 저장됨
		// 7. instanceVar는 메모리에 존재하지 않기 때문에 사용할 수 없음
		// 8. println()이 호출되어 CallStack에 저장됨
		// 9. println()이 classVar를 출력 후 CallStack에서 제거됨
		//10. classMethod()의 실행이 종료되어 CallStack에서 제거됨
		  // CallStack Call호출, Stack나중에 넣은 것이 먼저 끝나서 제거
		  // 후입선출에 따라서 호출된다!
				
		
		JVM jvm = new JVM(); //JVM(); < 생성자  ()파라미터없으면 기본생성자
		 					 // 기본생성자는 자바가 알아서 생성해준다
		
		// 11. JVM객체가 Heap에 저장됨
		// 12. jvm변수가 CallStack에 생성되고, JVM객체의 주소가 저장됨
		
		System.out.println(jvm.instanceVar);
		// 13. println()이 호출되어 CallStack에 저장됨
		// 14. println()이 instanceVar를 출력 후 CallStack에서 제거됨
		
		jvm.instanceMethod();
		// 15. instanceMethod()가 호출되어 CallStack에 저장됨
		// 16. println()이 호출되어 CallStack에 저장됨
		// 17. println()이 instanceVar를 출력 후 CallStack에서 제거됨
		// 18. println()이 호출되어 CallStack에 저장됨
		// 19. println()이 classVar를 출력 후 CallStack에서 제거됨
		// 20. instanceMethod()의 실행이 종료되어 CallStack에서 제거됨
		
		jvm = null;
		// 21. jvm 변수에 null이 저장됨
		// 22. 어디에서도 주소를 참조하지 않는 JVM객체는 
		//     GarbageCollector에 의해 삭제됨
		       // GarbageCollector 안쓰는거 자동 메모리 반환
			   // C는 내가 정리하며 돌려줘야함(리무브반환)/ 자바는 자동
		       // 싱글톤 개념이 있어요 한두번쓰는거 강제적으로 만들어서
		       // 메모리 누수를 막는
		// 23. main() 의 실행이 종료되어 CallStack에서 삭제됨
		// 24. 프로그램이 종료되고 MethodArea의 데이터가 삭제됨
		
	}
	
	int instanceVar; //JVM의 객체를 만들지않아서 아직 생성 아님
	static int classVar;
	
	public void instanceMethod() {
		System.out.println(instanceVar);
		System.out.println(classVar);
		
	}
	
	public static void classMethod() { //static 메소드에서는 
									   //static 변수만 사용 가능
//		System.out.println(instanceVar);
		System.out.println(classVar);
		
	}

}
