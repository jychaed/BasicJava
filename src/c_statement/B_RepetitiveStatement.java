package c_statement;

import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class B_RepetitiveStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 반복문 
		 * - for문
		 * - while 문
		 * - do-while 문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){실행문} //초기화 내가 사용할 for안에 변수를 초기화한다.
		 * - 실행문을 정해진 횟수만큼 반복하게 해주는 문장
		 * 
		 * 횟수를 정확히 알때
		 * 
		 * */
		
			// 초기화 : 조건식과 증감식에 사용할 변수를 초기화함
			// 조건식 : 연산결과가 true면 블럭({~}을 뜻함)안의 내용을 수행한다.
			// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.			
			// - 실행문을 정해진 횟수만큼 반복하게 해 주는 문장
			//   - i = for문 안에서 계속 도는? 숫자
			// 초기화한 변수는 블럭안에서만 사용할수 있다.
//		for(int i = 1; i <= 10; i++) { //i가 1인데 10과 같거나 작을때 까지 i증가시킴
//			System.out.println(i + "번째 반복");
//		}	
//		
//		
//		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용함.
		
		// 1부터 10까지의 합을 구하시오.
//		int sum = 0 ;  // 1부터 10까지의 합
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;	
//		System.out.println(sum);
//		
		
		
		
//		sum = 0;
//		for(int i = 1; i <=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
		
		
		
//		// 1~ 100까지의 합을 구하자
//		sum = 0;
//		for(int i = 100; i >= 1 ; i--) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
		
		
		
//		// 1부터 100까지 짝수의 합을 구해주세요
//		sum = 0;
//		for(int i = 100; i >=1 ; i--) {
//			if(i % 2 == 0) sum += i;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		for(int i = 100; i >=1 ; i-=2) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		
//		
		
		
		
		
		
		
		/* 구구단 출력 
		 * 
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 4 = 6
		 * ...
		 * */
		
		// 1번
		int mul = 1;
		for(int i = 1; i <= 9; i++) {
			mul = 2 * i;
			System.out.println("2 * " + i + " = " + mul);
		}
		
		
		//선생님
		for(int i = 1; i <= 9; i++) {
			System.out.println("2*" + i + " = " + (i * 2));
		}
		
		
		for(int i = 2; i <= 9; i++) {
		for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	    //중첩본문은 이중정도 사용하세요 삼중은 너무 반복됩니다 ㅠ
		
		
		
		// 구구단 전체를 가로로 출력해 주세요
		/* \t : 탭
		 * 2 * 1 = 2 	3 * 1 = 3	4 * 1 = 4 ...
		 * 2 * 2 = 4 	3 * 2 = 6	4 * 2 = 8 ...
		 * 2 * 3 = 6 	3 * 3 = 9	4 * 3 = 12 ...
		 * */
		
//		for(int i = 1; i <= 9; i++) {
//		for(int j = 2; j <= 9; j++) {
//			System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//		}
//		System.out.println();   // (바깥 for문 모든 단의 *1이 끝났으므로) 줄을 바꿔줌.
		
		// 안과 밖이 도는 과정을 잘 파악해야...
		
		
		
		
		
		/* while문 
		 * -while(조건식){실행문}
		 * -실행문을 조건식이 만족하는 동안 '계속' 반복하는 문장
		 * - 반복횟수가 정확하지 않은 때 사용함
		 * 
		 * 결과를 정확히 알때
		 * 
		 * */
		
//		int a = 1;
//		// a에 2씩 몇번을 곱해야 1000이상이 되는지 알고싶다.
//		
//		int count = 0;
//		while(a < 1000) {// 조건식이 true이면 계속함
//			a *= 2;
//			count++;
//			System.out.println(count + " : " + a);
//		}
//		
		
		
		
		
		
		/* do-while문 
		 * - do{실행문}while(조건식)
		 * - 최소 한번의 실행이 보장된다.
		 * */
		
		
		
		
		
		
		
		
		// 숫자맞추기 게임
//		Random rnd = new Random();
//		int qNum = rnd.nextInt(100); //0~99까지의 정수
//		int input = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.print("0부터 99까지의 정수를 입력해 주세요.");
//			input = Integer.parseInt(sc.nextLine());
//			
//			if(input > qNum) {
//				System.out.println(input + "보다 작습니다.");
//			}else if(input < qNum) {
//				System.out.println(input + "보다 큽니다.");
//			}else {
//				System.out.println("정답입니다.");
//			}
//			
//		}while(input != qNum); 
	
		
		
		
		
		
		
		
		
		
		
		
//		outer: //주고싶은대로
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 10; j++) {
//				// 이부분
//				System.out.println(i + ":" + j);
//				break outer; //이렇게 하면 바깥for문도 끝낼수 있다.
//				// break; : 가장 가까운 반반목 하나를 빠져나간다.
//				// break outer; : outer라는 이름의 반복문을 빠져나간다.
//			}
		
		
		
//				outer:
//				for(int i = 1; i <= 10; i++) {
//					for(int j = 1; j <= 10; j++) {
//						// 이부분
//						if (j == 5) {
//							continue outer;//이번에는 넘겨라? 아래를 프린트를 하지않고 넘어감
//						}
//						System.out.println(i + ":" + j);
//						
//						// break; : 가장 가까운 반반목 하나를 빠져나간다.
//						// break outer; : outer라는 이름의 반복문을 빠져나간다.
//						// continue : 가장 가까운 반복문의 반복회차를 빠져나간다.
//						// continue outer : outer라는 이름의 현재 반복회차를 빠져나간다.
//					}
//					
//		}
//	
		
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("----------------");
//		for(int i = 1; i <=5 ; i++) {
//			System.out.println("*");
//		}
//		
//		for(int j = 1; j <= 3 ; j++)  다시 받아적기
		
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//		System.out.println("*****");
//		System.out.println("------------");
//		
//		for(int i = 1; i <=5; i++) {
//			for(int j =1; j <= i ; j++) {
//				System.out.print();
//			}
//		}
//		
//		System.out.print("*");
//		System.out.println("*");
//		System.out.println("------------");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("*");
//		System.out.println("------------");
//		
//		
		
//		System.out.println("*****");
//		System.out.println("****");
//		System.out.println("***");
//		System.out.println("**");
//		System.out.println("*");
//		
//		for(int i = 5; i >=1; i--) {
//			for(int j = 5; j >= i ; j--) {
//		}
		
//		for(int i = 6; i >= 1; i--) {
//
//			 for(int j = 1; j <= i - 1 ; j++) {
//
//				System.out.print(" ");
//
//			 }for(int k = 11; k >= i*2-1 ; k --) {
//
//				System.out.print("*"); 
//
//			 }
//
//			 	System.out.println();
//
//		 	 }
//		
	}

}
