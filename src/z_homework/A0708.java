package z_homework;

import java.util.Random;
import java.util.Scanner;

public class A0708 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int length1, length2, length3;
//		System.out.println("첫길이>>");
//		length1 = Integer.parseInt(sc.nextLine());
//		System.out.println("둘길이>>");
//		length2 = Integer.parseInt(sc.nextLine());
//		System.out.println("셋길이>>");
//		length3 = Integer.parseInt(sc.nextLine());	
//	
		
		/////
		
		
//		int temp = length1;
//		
//		if(temp < length2) {
//			temp = length2;
//		}
//		if(temp < length3) {
//			temp = length3;
//		}
//		if(length1 + length2 + length3 - temp > temp) {
//			System.out.println("삼각형가능");
//		}else {
//			System.out.println("삼각형불가");
//		}
		
		// 1번째 방법
		
		
		
		
		
//		if((length1 + length2 + length3)
//				&& (length2 + length3 > length1)
//				&& (length1 + length3 > length2)) {				
//			System.out.println("삼각형가능");
//		}else {
//			System.out.println("삼각형불가");
//		}
//		
//		
//		// 2번째 방법
		
		
				

	//if 써야해
		
//		if((length1 + length2 > length3)) {
//			|| (length2 + length3 > length3)
//			|| (length1 + length3 > length2)
//			)
//		}else {
//			
//		}
//		
		
		////////////////////////////////////////////////////////////////
		
		
		////2번문제
//		Scanner sc = new Scanner(System.in);
//		int month = 0; // 월은 실수일수 없으니까
//		// 계절은 1 ~ 12 정해져 있고 , if는 어렵고 switch
//		
//		// while ()조건식이 계속 반복
//		outer://		
//		while(true) {
//			System.out.print("월입력>>");
//			month = Integer.parseInt(sc.nextLine());
//			
//			switch (month) {
//			case 3 : case 4 : case 5 :
//				System.out.println("봄");
//				break;
//			case 6 : case 7 : case 8 :
//				System.out.println("여름");
//				break;
//			case 9 : case 10 : case 11 :
//				System.out.println("가을");
//				break;
//			case 12 : case 1 : case 2 :
//				System.out.println("봄");
//				break;
//				
//			default:
//				System.out.println("잘못입력함");
//				break outer;
//			}
//		}
//		
		// 이제 while 
		// 반복문에는 이름을 지정해줄수 있고 그위치에서 끝낼수있음?
		//안에서 돌다가 케이스 값 외 다른걸 넣으면 default로 넘어가서 while을 묶은 outer 마무리 
		
		
		
		
		
		
		
		
		
		
		
		//정수를 입력받을 준비
		Scanner sc = new Scanner(System.in);
		//누구 점수인지 입력 받을까
		String name;
		int kor, eng, math, java, oracle;
//		
		System.out.print("이름은>>");
		name = sc.nextLine();
//		System.out.print("국어는>>");
//		kor = Integer.parseInt(sc.nextLine());
//		System.out.print("영어는>>");
//		eng = Integer.parseInt(sc.nextLine());
//		System.out.print("수학은>>");
//		math = Integer.parseInt(sc.nextLine());
//		System.out.print("자바는>>");
//		java = Integer.parseInt(sc.nextLine());
//		System.out.print("오라클은>>");
//		oracle = Integer.parseInt(sc.nextLine());
		
		Random rnd = new Random();
		kor = rnd.nextInt(101);
		eng = rnd.nextInt(101);
		math = rnd.nextInt(101);
		java = rnd.nextInt(101);
		oracle = rnd.nextInt(101);
		
		int total = kor + eng + math + java + oracle;
		
		double avg = total / 5.0;
		
		String grade = "";
		
		// int와 double이 만나면 double 더큰거로 변환됨!
		
		// switch 를 넣으면 int랑 String만 사용가능하니 이건 못써
		
		// if를 이용해보자
		
		if(avg >= 90) { 
			grade = "A"; //이거쓰려면 또 스트링 하나 해줘야지	
		}else if(avg >= 80) {
			grade = "B";
		}else if(avg >= 70) {
			grade = "C";
		}else if(avg >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("이름 \t국어 \t수학 \tJava \tOracle"
				           + "\t총점 \t평균 \t등급"); //범위를 띄우고 싶었다 \t
		
		System.out.printf("%s \t%d \t%d \t%d \t%d \t%d"
							+ "\t%d \t%.2f \t%s", name, kor, eng, math
							, java, oracle, total, avg, grade); 
		//ln은 라인을 바꾼다 그냥 프린트는 줄바꿈없고 나옴 f는 내가 원하는 포맷에 끼워넣겠다
		// %s < 이 위치에는 s는 문자열을 넣겠다. /    %d 정수형     // \t공간 범위를 띄워주겠다.
		// %.2f << f는 플로트라서 실수로 표현하기 위한 것이고   .2는 옵션이다
		// .2 소수점 둘째자리까지 표현하겠다는 옵션
		
		
		
		
		
				
		
//		switch((int)(avg / 10)) {//(int)는 형변환 시킨거
//		case 10: case 9:
//			grade = "A";
//			break;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
