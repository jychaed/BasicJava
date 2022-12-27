package f_exception;

import java.io.IOException;

public class ThrowException {

	/*
	 * 예외 발생시키기
	 * - throw new Exception();
	 * - throw 예약어와 예외 클래스 객체로 예외를 고의적으로 발생시킬 수 있다.
	 * 
	 * */ 
	
	public static void main(String[] args) throws IOException, UserException {
		IOException ioe = new IOException();
		
		try {
			throw ioe;
			
		}catch(IOException e) {
			e.printStackTrace(); // 왜인지 모르지만 발생함! 위치는 알아!
		}
		
		UserException ue = new UserException();
		try {
			throw ue;
		}catch(UserException e) {
			e.printStackTrace(); // 내가 예상한 그걸 시도  UserException()꺼 데려온거?
		}
		
		try {
			if(1 == 1) { // condition // 이건 다른애가하고
				throw new UserException(); // 이거도 다른애가 할때 사용함?
			}
		}catch(UserException e) {
			e.printStackTrace(); // 내가 예상한 그걸 시도  UserException()꺼 데려온거?
		}
		
	}

}
