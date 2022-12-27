package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	
	/*
	 * finally
	 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
	 * - fanally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
	 * 
	 * 자동 자원 반환(JDK 1.7)
	 * - try(변수 선언; 변수선언) {} chach(Exception e) {}
	 * - 사용후 반환이 필요한 객체를 try의 ()안에 선언하면 try 블럭 종료시 자동으로 반환
	 * 
	 * */
	
	public static void main(String[] args) {
		FileInputStream fis =null; 
		// 파일을 입출력? 파일을 다루고 인풋할거다 Stream은 빨대// 파일 읽기
		
		try {
			fis = new FileInputStream("d:/file.txt");
		}catch (FileNotFoundException e) {
			System.out.println("파일없음");
			e.printStackTrace();
		}finally { //< 이게 중요한거 위에서 우선 try 시도하고 결과 어떻던! ㄱㄱ
			System.out.println("finally");
			try {
				fis.close();
			} catch (IOException e) { //IOException 인풋아웃풋 인셉션 io
				e.printStackTrace();
			} //Stream 받겠다
		}
		// 예외 발생 : try -> catch -> finally
		// 예외 미발생 : try -> finally
		
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "아무 내용이나 써보자!";
			byte[] bytes = str.getBytes();
			
			for(int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
