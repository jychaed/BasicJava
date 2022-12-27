package c_statement;

import java.util.Scanner;

public class A_ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 조건문 
		 * - if문 
		 * - switch 문
		 * 
		 * 
		 * if 문 
		 * - if (조건식) { 실행문 } : 조건식의 결과가 true면 블럭안의 문장을 수행한다. 
		 * - else if(조건식) { 실행문 } : 다수의 조건이 필요할 때 if뒤에 추가한다. 
		 * - else { 실행문 } : 결과가 true조건이 하나도 없을 때 추가한다.
		 * 
		 */

		int a = 1;
		
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true면 수행된다.");
		}
		if (a == 0) {
			System.out.println("조건식의 연산결과가 flase면 수행된다.");
		}
		

		if (a == 1) {
			System.out.println("a가 1일때 하고싶은 것");
		} else if (a == 2) {
			System.out.println("a가 2일때 하고싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3일때 하고싶은 것");
		} else {
			System.out.println("위 조건이 모두 false일때 하고싶은 것");
		}

		// 조건을 한 묶음으로 사용하기 위해서는 반드시 else if를 사용해야한다.
		// 위의 조건에 걸리면 아래 조건들까지 가지도 않음.(아래 조건에 해당이 되더라도)
		
		if (a > 10) {
			System.out.println("a가 10보다 작다");
		} else if (a < 20) {
			System.out.println("a가 20보다 작다");
		}

		// 시험점수가 60점 이상이면 합격 아니면 불합격
		int score = 60;
		if (score <= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");

		}

		// 성적등급을 부여하는 프로그램을 작성하세요
		// 90~100 : A
		// 80~89 : B
		// 70~79 : C
		// 60~69 : D
		// 이하 : F
		// 0~3 : -, 6~9 : +
		// 출력 예제 : "80점에 해당하는 등급은 B입니다."
		// "문자열" + "문자열"
		// grade += "+"
		// 일의 자리가 중요해졌고 통일 패턴으로 만들어야함
		// 68 % 10 = 8
		// 73 % 10 = 3 

		
		// 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요>> ");
//		int score = Integer.parseInt(sc.nextLine());
//		
//		if(score > 0 && score <= 59) {
//			System.out.println("F");
//		} else if(score >= 60 && score <= 69) {
//			System.out.println("D");
//		}  else if(score >= 70 && score <= 79) {
//			System.out.println("C");
//		}  else if(score >= 80 && score <= 89) {
//			System.out.println("B");
//		}  else {
//			System.out.println("A");
//		}
//		  >> 코드확인
//		  >> 범위가 누적되므로 굳이 이렇게 나눌 필요 없다.
//	  	  >> grade 변수를 지정을 안 해 놔서 출력값이 달라진다. 
		

		// 정답!
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력해 주세요>> ");
//		int score = Integer.parseInt(sc.nextLine());
//		String grade = ""; // String타입을 담을 grade라는 변수를 선언하고 초기화함. 여기에 아무거나 넣을 수 있다는 뜻.
//		if(score >= 90) {
//			grade = "A";
//		} else if(score >= 80) {
//			grade = "B";
//		} else if(score >= 70) {
//			grade = "C";
//		} else if(score >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		
		// 이렇게도 쓸 수 있음.
//		int score = 69;
//		String grade = ""; // String타입을 담을 grade라는 변수를 선언하고 초기화함. 여기에 아무거나 넣을 수 있다는 뜻.
//		if(score >= 90) grade = "A";
//		else if(score >= 80) grade = "B";
//		else if(score >= 70) grade = "C";
//		else if(score >= 60) grade = "D";
//		else grade = "F";
//		System.out.println(score + "점에 해당하는 등급은" + grade + " 입니다.");
		// 이렇게 괄호를 없애고 쓸 순 있는데, 이럴 땐 나중에 수정하기 어렵다는 단점이 있다.
		
		
		
		
		
		// 팁! 정렬 : ctrl + shift + f
		// 성적 등급을 부여하는 프로그램을 작성하세요. (ver.2)
				// 0 ~ 59 : F
				// 60 ~ 69 : D
				// 70 ~ 79 : C
				// 80 ~ 89 : B
				// 90 ~ 100 : A
				// 0 ~ 3 : -    ,     6 ~ 9 : +
				// 출력 예제 : "80점에 해당하는 등급은 B입니다."
				// "문자열" + "문자열"
				// grade += "+"
				// 68 % 10 = 8
				// 73 % 10 = 3
				
				
				// 내 답 (좀 지저분함...)
//				Scanner sc = new Scanner(System.in);
//				System.out.print("점수를 입력해 주세요>> ");
//				int score = Integer.parseInt(sc.nextLine());
//				String grade = "";
//				if(score >= 90) {
//					grade = (score < 93) ? "A-" : (score < 95 ? "A" : "A+");
//				} else if(score >= 80) {
//					grade = (score < 83) ? "B-" : (score < 85 ? "B" : "B+");
//				} else if(score >= 70) {
//					grade = (score < 73) ? "C-" : (score < 75 ? "C" : "C+");
//				} else if(score >= 60) {
//					grade = (score < 63) ? "D-" : (score < 65 ? "D" : "D+");
//				} else {
//					grade = "F";
//				}
//				System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		score = 97;
		String grade = "";
		// 90 <= score && score <= 100

		if (score >= 90) {
			grade = "A";
					
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else
			grade = "F";
		if (!grade.equals("F")) {  //혹시 f가 아닐때 1의자리 스코어를 10으로 나눈 나머지가 3이하면
			if(score % 10 <= 3) {
				grade += "-";
			}else if (score % 10 >= 6) {
				grade += "+";
			}else {
				grade += "0";
			}
			
		}

		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		// else if (score >= 70) grade = "c"; 이것도 가능, 근데 잘 안씀 수정어려움

		// 정렬 Ctrl + Shift + f
		
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * System.out.print("점수를 입력하세요 :"); 
		 * int num = sc.nextInt();
		 * 
		 * if ( num >= 90 ) {System.out.println("A"); 
		 * }else if (num >= 80 ) {
		 * System.out.println("B"); 
		 * }else if (num >= 70 ) { 
		 * System.out.println("C");
		 * }else if (num >= 60 ) {
		 * System.out.println("D"); 
		 * }else if (num <= 59 ) {
		 * System.out.println("F"); 
		 * }else {
		 * 
		 * System.out.println("");
		 */
		
		// 정렬 : ctrl + shift + f
		
		
		
		
		
		
		
		// 이렇게도 쓸 수 있음.
//		int score = 69;
//		String grade = ""; // String타입을 담을 grade라는 변수를 선언하고 초기화함. 여기에 아무거나 넣을 수 있다는 뜻.
//		if(score >= 90) grade = "A";
//		else if(score >= 80) grade = "B";
//		else if(score >= 70) grade = "C";
//		else if(score >= 60) grade = "D";
//		else grade = "F";
//		System.out.println(score + "점에 해당하는 등급은" + grade + " 입니다.");
		// 이렇게 괄호를 없애고 쓸 순 있는데, 이럴 땐 나중에 수정하기 어렵다는 단점이 있다.
		
		
		
		
		
		
		
		
		
		
		
		
		/* switch 문 
		 * - switch (int / String) {
		 * case 1:
		 * break; 
		 * }
		 * 
		 * - 조건식의 결과는 정수와 문자열(jdk 1.7 ~)만 허용된다.
		 * - 조건식과 일치하는 case 문 이후의 문장을 수행한다.
		 * - 넘어올 값이 완벽하게 예상이 될 때 사용함. 주로 if문을 많이 사용.
		 * 
		 * */
		
		a = 4;
		switch(a) {
		case 1:
			System.out.println("a가 1인 경우에 하고싶은것");
			break; //그리고 스위치가 끝난다
		case 2:
		case 3:
			System.out.println("a가 2 혹은 3인 경우에 하고싶은것");
			break; // 계속 실행하다가 이제 브레이크
		case 4:
			System.out.println("a = 4");
		case 5:
			System.out.println("a = 5");
			break;
				
		}
		
		// 주어진 월에 해당하는 계정을 출력해 봅시다.(switch사용)
		int month =7;
		String season = "";
	//	String =season = null;
		switch(month) {
		case 12:
		case 1:
		case 2:
		    season ="겨울";
			break;
		case 3: case 4: case 5: //이런식으로 써도 됨
			 season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			 season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			 season = "가을";
	    default:            // else if('그게 아니면')이라는 의미, 
	    					// 웬만해선 잘 안 씀. 목적을 갖고 쓰는 게 아니라 예외를 위해 쓰는 것 뿐.
	//		season = "월 이상함"
			break;
			
	   		
		}
 		System.out.println(month + "월은" + season + "입니다.");

 	    // 위에서 작성한 점수별 등급표를 switch로 작성해주세요.
		// 위에서 작성한 점수별 등급표를 switch로 작성해 주세요.
		// 성적 등급을 부여하는 프로그램을 작성하세요. (ver.2)
		// 0 ~ 59 : F
		// 60 ~ 69 : D
		// 70 ~ 79 : C
		// 80 ~ 89 : B
		// 90 ~ 100 : A
		// 출력 예제 : "80점에 해당하는 등급은 B입니다."
//		int score = 33;
//		String grade = "";
//		switch(score / 10) {        // int 혹은 String만 가능
//		case 10: case 9:
//			grade = "A";
//			break;
//		case 8:
//			grade = "B";
//			break;
//		case 7:
//			grade = "C";
//			break;
//		case 6:
//			grade = "D";
//			break;
//		case 0: case 1: case 2: case 3: case 4: case 5:
//			grade = "F";
//			break;
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		
		
			
		
		// 숫자 3개를 입력받아 내림차순으로 출력해주세요.
		// 입력 예 : 85 97 14
		// 출력 예: " 97 > 85 > 14" // 교환이 안되고 서로 맡기고 줘야해...?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 숫자");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("둘 숫자");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("셋 숫자");
		int num3 = Integer.parseInt(sc.nextLine());
		// 97 85 14
		if (num1 < num2) { // 85 < 97 = true
			int temp = num1;  // temp라는 임시저장소를 만들어서 보관해 놓음
			num1 = num2;
			num2 = temp;
		}
		
		if (num2 < num3) { // 97 < 14 = false
			int temp = num1;
			num2 = num3;
			num3 = temp;
		}
		
		if (num2 < num3) { // 85 < 14 = false
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}	
		System.out.println( num1 + " > " + num2 + " > " + num3);	
		
		// 값들의 자리를 바꾸기 위해 어딘가에 자료를 넣어 놨다가 다시 빼서 쓰는 부분이 포인트!
		}
		

	
	
   }

	
	
	





	
	
	
	