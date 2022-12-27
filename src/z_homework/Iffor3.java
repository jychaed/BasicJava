package z_homework;

import java.util.Scanner;

public class Iffor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		System.out.println("프로그래밍 기초:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("데이터베이스:");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("화면구현:");
		int c = Integer.parseInt(sc.nextLine());
		System.out.println("애플리케이션 구현:");
		int d = Integer.parseInt(sc.nextLine());
		System.out.println("머신러닝:");
		int e = Integer.parseInt(sc.nextLine());
		
		int chdwja = (a + b + c + d + e);
		double vudrbs = (a+b+c+d+e)/5.0 ;
		String gkrwja = "";
        
		if (vudrbs >= 90) {
			gkrwja = "A";
        
        } else if (vudrbs >= 80 && vudrbs <90){
        	gkrwja = "B";
            
        } else if (vudrbs >= 70 && vudrbs <80) {
        	gkrwja = "C";
        
        } else if (vudrbs >= 60 && vudrbs <70) {
        	gkrwja = "D";
            
        } else {
        	gkrwja = "F";
        }
			
		System.out.println("총점 : " + chdwja );
		System.out.println("평균 : " + vudrbs );
		System.out.println("학점 : " + gkrwja );
			
	}

}
