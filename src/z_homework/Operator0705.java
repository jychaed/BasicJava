package z_homework;

import java.util.Scanner;

public class Operator0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();
		System.out.println((num % 2 == 0 ? "짝수" : "홀수"));
		

	}

}
