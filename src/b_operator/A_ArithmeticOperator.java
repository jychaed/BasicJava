package b_operator;

import java.util.Random;

public class A_ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 산술 연산자
		 *  - 사칙연산 : +, -, *, /, %(나머지)
		 *  - 복합 연산자 : +=, -=, *=, /=, %=
		 *  - 증감 연산자 : ++, --
		 *  */
		
		int result = 10 + 20 - ((30 * 40) / 50) % 60;
		// 곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		
		// 나머지 연산
		result = 10 / 3 ; // 3.33333....
		System.out.println(result);
		result = 10 % 4;
		System.out.println(result);
		
		// 5개의 산술 연산자를 사용해서 5개의 연상을 수행해보자
		result = 10 + 20;
		System.out.println(result);
		result = 10 - 5;
		System.out.println(result);
		result = 2 * 3;
		System.out.println(result);
		result = 9 / 4;
		System.out.println(result);
		result = 7 % 2;
		System.out.println(result);
	
		
		// 복합 연산자
		// 변수에 저장되어있는 값에 연산을 수행할 때
		// 수행할 연산자와 대입 연산자를 결합해 사용할 수 있다.
		result = result + 10;
		result += 10;
		System.out.println(result);
		
		result -= 10;
		result *= 2;
		result /= 2;
		result = result -2 * 5;
		result -= 2 * 5;
		result %= 10;
		
		// 증감연산자
		// 증가연산자(++) : 변수의 값을 1 증가시킨다.
		// 감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		++i; // 전위형 : 변수의 값을 읽어오기 전에 1증가
		i++; // 후위형 : 변수의 값을 읽어오고 1증가
		
		--i;
		i--;
		i = 0;
		System.out.println("++i = " + (++i)); //1
		
		i = 0;
		System.out.println("i++ = " + (i++)); //0
		System.out.println("i = " + i); //1
		
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double;
		// 표현범위가 더 큰 타입으로 형변환 된다.
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short;
		// int보다 작은 타입은 int로 형변환 된다.
		
		char _char1 = 'a';
		char _char2 = 'b';
		_int = _char1 + _char2;
		System.out.println(_int);
		
		
		// 오버플로우, 언더플로우
		// 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		
		byte b =127;
		b++;
		System.out.println(b); //-128
		b--;
		System.out.println(b); //127
		// 타입을 선택할 때 연산의 범위를 고려해야한다.
		
		
		
		
		// 다음을 한줄 씩 계산해서 최종 결과값을 출력해주세요
		// 1. 123456 + 654321
		// 2. 1번의 결과 값 * 123456
		// 3. 2번의 결과 값 / 123456
		// 4. 3번의 결과 값 - 654321
		// 5. 4번의 결과 값 % 123456
		
		int s1 = 123456 + 654321;
		System.out.println(s1);
		long s2 = s1 * 123456;
		System.out.println(s2);
		long s3 = s2 / 123456;
		System.out.println(s3);
		long s4 = s3 - 654321;
		System.out.println(s4);
		long s5 = s4 % 123456;
		System.out.println(s5);
		
		/*
		 * double _d = 0.0001; double _d3 = 0.0001; for(int j = 0 ; j < 10000 j ++) _d
		 * += _d2s
		 */
	
		int r = 123456;
		r += 654321; //1
		r *= 123456;
		r /= 123456;
		r -= 654321;
		r %= 123456;
		
		/// 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구하세요.
//		int vA = 0, vB = 1, vC = 2;
//		+ vB + vC;
	    int num1 = 15;
	    int num2 = 34;
	    int num3 = 49;
	    int sum = num1 + num2 + num3;
	    System.out.println("합계 :" + sum);
//	    float avg = sum / 3.0f;
	    double avg = sum / 3.0;
	    System.out.println("평균 :" + avg);
	    		
		// 반올림, 올림, 버림
	    // 반올림 : Math.round(실수);
	    // 올림 : Math.ceil(실수);
	    // 버림 : Math.flood(실수);
	    avg = Math.ceil(avg);
	    System.out.println(avg);
	    
	    //랜덤
	    // Math.random() : 0.0~1.0미만 (0.99999....)
	    // Random rnd = new Random();
	    // rnd.nextInt(); => int 범위내의 int가 랜덤으로 출력
	    // rnd.nextInt(45); => 범위내의 int가 랜덤으로 출력
	    Random rnd = new Random(); // rnd 앞에 놓고 ctrl+space
	    System.out.println(rnd.nextInt(45));
	    
	    
	    
	    
	    
	    
	  
		
	}

}
