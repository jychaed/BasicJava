package g_api;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

	/*
	 * Wrapper클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
	 * - boolean	: Boolean
	 * - char		: Character //문자 '@'
	 * - byte 		: Byte
	 * - short 		: Short
	 * - int 		: Integer
	 * - long		: Long
	 * - float		: Float
	 * - double 	: Double
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		int i = 20;
		
		Integer iw = new Integer(20); // 박싱
		Integer iw2 = 20; // 박싱
		Integer iw3 = new Integer("20");
		
		//꺼낼때
		int a = 10;
		
		int sum = a + iw; // 언박싱
		
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		// 상수를 볼 수 있다.
		
		List<String> list = new ArrayList<String>(); 
		// 컬렉션프레임워크에는 객체만 담을 수 있다.
		// 그런 행동을 알아서 해주고 길이가 늘어나고 줄어들고 알아서
		// <> 안에 뭘 담아야하는지 지정 
		// <> < 제네릭 이라고 하고 제너릭안에는 객체 들어가요 형태지정
		// List는 바구니!
		// int 같은 기본자료는 못 넣어요 넣으려면 객체 Integer
		int[] b = new int[1];
		String[] c = new String[1];
		
	}

}
















