package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자(+ - * /)를 입력받아
		// 연산 결과를 알려주는 프로그램을 만들어 주세요.
		// 결과 예: "1 + 1 = 2입니다."
		
		Scanner sc = new Scanner(System.in);//입력을 받아야하니까
		System.out.print("숫자를 입력하세요>>");
	    int x = Integer.parseInt(sc.nextLine()); // int인지 double할지 고민
	    System.out.print("숫자를 입력하세요>>");
	    int y = Integer.parseInt(sc.nextLine());
	    System.out.print("연산자를 입력해 주세요>>");
	    String op = sc.nextLine();
	    
	    int result = op.equals("+") ? x + y 
	    		: op.equals("-") ? x - y 
	    		: op.equals("*") ? x * y 
	    		: x / y;
	    
	    
	    System.out.println(x + " " + op + " " + y + " = " + result + " 입니다.");
	    	
	    				
	
	    
	    		
	   
	
	}

}

