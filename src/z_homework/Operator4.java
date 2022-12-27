package z_homework;

import java.util.Scanner;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년인지 확인할 연도를 입력하세요");
		int duseh = Integer.parseInt(sc.nextLine());
			
		String year = (duseh % 4 == 0) && (duseh % 100 != 0)||
				      (duseh % 400 == 0) ? 
					   duseh +"년은 윤년이 맞습니다." : duseh + "년은 윤년이 아닙니다.";
				
				
		
		
		
	}

}
