package f_exception;

public class ThrowsException {

	/*
	 * 메서드에 예외 선언하기
	 * - 메서드 호출 시 발생할 수 있는 예외를 선언해줄 수 있다.
	 * - 반환타입 method() throws Exception {}
	 * - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
	 * - 예외를 선언하면 예외처리를 하지 않고 자식을 호출한 메서드로 예외처리를 넘겨준다.
	 *  
	 * */
	
	public static void main(String[] args) {
		//그걸 메서드 사용하는 애가 해결하게 하는 트라이캐치안에서 말고
		try {
			method(); // 3)메인에서 트라이캐치를 시도함/ 사용자의 편의로 양도받음
				      // 여기서는 던져도 처리 못함 ㅋㅋㅋㅋㅋ 다른 곳으로 양도 못함!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void method() throws InterruptedException { // 2)이렇게 던지면.. 메인에서!(위로)
		Thread.sleep(1);
	}
	
//	private static void method2()  {//1) method() 이라면 여기서 트라이캐치 안하고
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
