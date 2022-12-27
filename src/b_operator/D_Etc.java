package b_operator;

import java.util.Scanner;

public class D_Etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/* ref: tcpschool.com/java/intro 여기서 공부하기 추가로~
		 * 비트연산자
		 * - | , & , ^ , ~ , << , >> , >>>
		 * - 비트단위로 연산한다.
		 * 
		 * 참조연산자
		 * - . : 특정 범위 내에 속해있는 멤버를 지칭함
		 * (System.out.println();) 안에 있는걸 쓰겠다?
		 * - (type) : 형변환
		 * float f = (float)d;
		 * - ? :     : 삼항연산자, 
		 * 조건식 ? true실행문 : false실행문
		 *  */
		
		/* 참조연산자 
		 * - . : 특정 범위 내에 속해 있는 멤버를 지칭함.
		 * e.g. (System.out.println();)
		 * - (type) : 형변환
		 * e.g. float f = (float)d;
		 * - ? :  :삼항연산자(?:  >>이 두 개가 한 연산자)
		 * e.g. 조건식 ? true실행문         : false실행문
		 * */
		
		// 삼항연산자
		int x = 10;
		int y = 20;
		int result = (x > y) ? x: y; 
		 //           조건식이  ? 참이면 x : 거짓이면y  
		System.out.println(result);
		System.out.println((x > y) ? x: y);// if문으로는 4줄이 나오는데 삼항연산자로는 1줄이면 됨
		// 위랑 아래 둘이 같은 식
		
		// 주민등록번호 뒷자리의 첫 번째 숫자가 1이면 남자 2면 여자
		int regNo = 1;
		String gender = (regNo == 1) ? "남자" : "여자";
		System.out.println(gender);
		
		regNo = 3;
//		gender = (regNo ==1) ? "남자" : "여자";
     	 //System.out.println(gender); //이걸 고치기 위해 여자에 삼항 연산자를 추가해줘요
		gender = (regNo == 1) ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println(gender);
		
		// Scanner sc = new Scanner(System.in);
		// 한번(여러개도)에 임포트하기 , 아무대나 커서두고 Ctrl + Shift + o
		
		
		
		// 2개의 숫자를 입력 받고, 둘중 더 큰 숫자를 출력해주세요
		 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 1 >>");
//		int i1 = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자 입력 2 >>");
//		int i2 = Integer.parseInt(sc.nextLine());
//		int i3 = (i1 > i2) ? i1 : i2 ;  
//		System.out.println(i3);
		// 이게 방법 1
		
//		boolean b1 = (i1 > i2);
//		System.out.println( b1 ? i1 : i2);
//		System.out.println(b1);
		// 이게 방법 2
		
		// line 복사 : ctrl + alt + 화살표 위 또는 아래로
		// line 삭제 : ctrl + d
		// line 이동 : alt + 화살표 위 또는 아래
		// 화면 확대/축소 : ctrl + +/- 
		// 페이지 단위로 스크롤 : ctrl + 휠 위아래
	
		
		// 숫자를 입력 받고, 그 숫자가 1이나 3이면 남자를 
		// 2 나 4면 여자를 출력해주세요
		// 그외의 숫자를 입력하면 확인불가를 출력해 주세요
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		String input = sc.nextLine();
		String ib = input.equals("1") || input.equals("3" ) ? "남자" :
			(input.equals("2")|| input.equals("4") ? "여자" : "확인불가");
		System.out.println(ib);
	
		
		
		
	    //	boolean gM = input.equals("1") || input.
		
		//		System.out.println(gender);
		//String gender = (regNo == 1) ? "남자 " : (regNo == ) ? "여자" : "확인불가");
		
		boolean gM = input.equals("1") || input.equals("3") ? true : false;
		boolean gW = input.equals("2") || input.equals("4") ? true : false;
		
		
	}

}
