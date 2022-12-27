package f_exception;

public class UserException extends Exception{
	
	@Override // 내가 재정의 해서 쓰는 거~~~
	public void printStackTrace() {
		System.out.println("예외발생!");
	}
}
