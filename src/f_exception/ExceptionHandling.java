package f_exception;

public class ExceptionHandling {

	
	/*
	 * 에러
	 * - 컴파일 에러 : 컴파일 시에 발생되는 에러 (빨간줄)
	 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것 (버그)
	 * - 런타임 에러 : 실행시에 발생되는 에러
	 * 
	 * 런타임 에러
	 * - 런타임 에러 발생 시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
	 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류 (처리 불가)
	 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리 가능)
	 * 
	 * 예외
	 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
	 * - RuntimeException 클래스의 그 자식들은 예외처리가 강제되지 않는다.
	 *   (예 : Thread.sleep(millisecond)) 
	 * - [RuntimeException 클래스와 그 자식들을 제외한]  
	 *   Exception 클래스의 자식들은 예외처리가 강제된다.
	 *   
	 * 예외처리 (try-catch)
	 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
	 * - try {} chtch(Exception){} 
	 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
	 * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
	 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
	 * - 발생한 예외와 일치하는 catch블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
	 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.  
	 *   
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { // 우선 시도
			Thread.sleep(1); // 이거를 시도함
		} catch (InterruptedException e) { // 이거 InterruptedException 발생하면
			// TODO Auto-generated catch block
			e.printStackTrace(); // 에러를 빨간색으로 출력해준다.
		} // 예외처리 필수
		int a = 0;
		
		try {
			int result = 10 / 0;
			System.out.println(result); // 우선 시도하고 이런생황이 생기면 catch!
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) { 
			  // ㄴ 여러개의 예외를 동일하게 처리할 때 |로 처리!
//			e.printStackTrace(); // e를 출력하게 했어요 // 에러메세지를 출력함
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) { 
//			//It is already handled by the catch block for ArrayIndexOutOfBoundsException
//			e.printStackTrace(); // 에러메세지를 출력함
		}catch(NullPointerException e) {
			// 아무 조치도 하지 않지만 프로그램이 종료되지 않는다.
		}catch(Exception e) {
			// 예상하지 못한 모든 예외 처리
			e.printStackTrace(); // 프로그램이 종료되지않고 지나갈 수 있어요!
		}
		
	}
}



















