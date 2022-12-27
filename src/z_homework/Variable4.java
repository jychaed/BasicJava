package z_homework;

import java.util.Scanner;

public class Variable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * double dong1, dong2, dong3, dong4 ;
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("500원짜리 동전의 갯수>>"); dong1 =
		 * Double.parseDouble(sc.nextLine());
		 * 
		 * System.out.print("100원짜리 동전의 갯수>>"); dong2 =
		 * Double.parseDouble(sc.nextLine());
		 * 
		 * System.out.print("50원짜리 동전의 갯수>>"); dong3 =
		 * Double.parseDouble(sc.nextLine());
		 * 
		 * System.out.print("10원짜리 동전의 갯수>>"); dong4 =
		 * Double.parseDouble(sc.nextLine());
		 * 
		 * Double dong5 = (500*dong1) + (100*dong2) +(50*dong3) +(10*dong4);
		 * System.out.println("저금통 안의 동전의 총 액수" + dong5 );
		 */
       
        
        //
       
	   int d500, d100, d50, d10;
       Scanner input = new Scanner(System.in);
       
       System.out.print("500원짜리 동전의 갯수>>");
       d500 = input.nextInt();
       
       System.out.print("100원짜리 동전의 갯수>>");
       d100 = input.nextInt();
       
       System.out.print("50원짜리 동전의 갯수>>");
       d50 = input.nextInt();
       
       System.out.print("10원짜리 동전의 갯수>>");
       d10 = input.nextInt(); 
       
       int sum = (500*d500) + (100*d100) + (50*d50) + (10*d10);
       System.out.println("저금통 안의 동전의 총 액수 :" + sum );
    		   
       
       
//      System.out.print("int 입력>>");
//    	String input = sc.nextLine();
//    	int iInput = Integer.parseInt(input);
        
	}

}
