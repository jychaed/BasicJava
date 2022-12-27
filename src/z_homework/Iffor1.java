package z_homework;

import java.util.Scanner;

public class Iffor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 변의 길이를 입력하세요");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 변의 길이를 입력하세요");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("세번째 변의 길이를 입력하세요");
		int c = Integer.parseInt(sc.nextLine());
		
		int max = a;
		
		if (max < b) {
			max = b;
		}
		
		if (max < c) {
			max = c;
		}
		
		System.out.println("긴변:"+max);
		
		if (a == max) {
			if(a < b+c) {
				System.out.println("삼각형을 만들 수 있습니다.");
			}else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
			return;
		}
		if (b == max) {
			if(b < a+c) {
				System.out.println("삼각형을 만들 수 있습니다.");
			}else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
			return;
			
		}
		if (c == max) {
			if(c < a+b) {
				System.out.println("삼각형을 만들 수 있습니다.");
			}else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
			return;
			
		}
		/*
		 * 
		if (b < a+c || a < b+c || c < a+b) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
		*/
		
		
		
	}	

}
