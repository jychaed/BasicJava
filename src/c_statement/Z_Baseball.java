package c_statement;

import java.util.Random;
import java.util.Scanner;

public class Z_Baseball {

	public static void main(String[] args) {
		
		/*
		 * 세 자리 랜덤한 숫자를 맞추는 게임을 만들어보자.
		 * 세 자리 숫자는 다음과 같은 규칙을 갖는다.
		 * 1. 중복되는 숫자가 없음 (예: 133 X, 333 X, ...)
		 * 2. 0 이 없다. (예: 130 X, 907 X, ...)
		 * 
		 * 랜덤으로 만들어진 숫자를 저장해두고, 
		 * 사용자에게 세 자리 숫자를 입력받아 다음과 같이 표기한다.
		 * 1. 같은 숫자이면서 위치가 같을 경우 S
		 * 2. 같은 숫자는 존재하지만 위치가 다를경우 B
		 * 3. 같은 숫자가 없는 경우 O
		 * 
		 * 맞을때까지 계속한다.
		 * ....
		 * 세 자리 숫자 입력 >> 571
		 * 6차 시도(571) : 2S 0B 1O
		 * --------------------
		 * 세 자리 숫자 입력 >> 671
		 * 7차 시도(671) : 3S 0B 0O
		 * --------------------
		 * 정답입니다 !!
		 * */
		
//		Random rnd = new Random(); //rnd는 변수명 rnd은 새로운 랜덤이다!만들어주는 애
//		int a = rnd.nextInt(9); // 이거는 0~9까지 랜덤한 번호가 나온다
//		rnd.nextInt(45) + 1; // 0~44 + 1 => 1 ~ 45
		
		// 숫자3개를 서로 다르게? 다르면 계속 다시뽑고
		
		
		// 랜덤 필요하지
		Random rnd = new Random();
		// 일단 숫자 3개 필요해
		int num1, num2, num3;
		// num1은 1~9야
		num1 = rnd.nextInt(9) + 1;
		// num2는 1~9이고 num1과 같지않아
		do {
			num2 = rnd.nextInt(9) +1;
		}while(num1 == num2);
		// num3은 1~9이고 num1, num2과 같지않아
		do {
			num3 = rnd.nextInt(9) +1;
		}while(num3 == num1 || num3 == num2);  //중복검사 끝
				
		Scanner sc = new Scanner(System.in);
		int input = 0 ;
		int count = 0 ;// 왜도는지 다시 확인 할 것 이거
		
		while(true) {
			System.out.print("세자리 숫자를 입력>>"); //임으로 그냥 세숫자 받은 것 그걸 쪼개야해
			input = Integer.parseInt(sc.nextLine());
			int i3 = input % 10; //인풋을 10으로 나눈 나머지로 함
			
			// 123 % 10 = 3
//			int i2 = (input % 10) % 10;
			// (123 / 10) % 10 = 12 % 10 = 2
//			int i3 = (input % 100) % 10;
			// (123 / 100) % 10 = 1 % 10 = 1
			//이방식을 사용하면 i를 한자리씩 구할 수 있는데 중첩이 되네요 input이 100다음이 필요하지않아서 패스
			
			input /= 10; // 12   //한번쓰고 버릴 숫자라서 그냥 
			int i2 = input % 10; // 2
			input /= 10; // 1 
			int i1 = input ; //1
			
			int s = 0, b = 0, o = 0; //strike ball out
			
			if(num1 == i1) {
				s ++; //
			}
			if(num2 == i2) {
				s ++;
			}
			if(num3 == i3) {
				s ++;
			}
			// 하나하나 비교해야해서 else if 더 복잡해져서 안함
			// 위에 스트라이크가 3개야 스트라이크와 볼의 횟수는 3회인데 아웃이겠구나? 머지.ㅠ
			
			if(i1 == num2 || i1 == num3) {
				b ++; //i1이 num2와 같다 ||또는  i1이 num3과 같다
			}
			
			if(i2 == num1 || i2 == num3) {
				b ++; 
			}
			
			if(i3 == num1 || i3 == num2) {
				b ++; 
			}
			
			o = 3 - (s + b);
			
			System.out.println(++count + "차 시도(" + 
						i1 + i2 + i3 + ") : "
						+ s + "S"
						+ b + "B"
						+ o + "O");
			System.out.println("-----------------------------------");
			
			
			
			if( s == 3) {
				System.out.println("정답입니다!!");
				break;
			}
			
			
			
				
		}
		
//		 * 1. 같은 숫자이면서 위치가 같을 경우 S
//		 * 2. 같은 숫자는 존재하지만 위치가 다를경우 B
//		 * 3. 같은 숫자가 없는 경우 O
	
		
	}

}
