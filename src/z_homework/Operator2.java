package z_homework;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 :");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 숫자를 입력하세요 :");
		int b = Integer.parseInt(sc.nextLine());
		
		int c = ( a > b ) ? a : b ;
		int d = ( a < b ) ? a : b ;
		
		int aa = c / d ;
		int bb = c % d ;
		
		System.out.print("큰 수를 작은 수로 나눈 몫은" + aa + "이고, 나머지는" + bb +"이다.");
		
		
		
		
		
	}

}
