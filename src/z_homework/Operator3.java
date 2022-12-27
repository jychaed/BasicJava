package z_homework;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도 입니까?(수도:1, 수도아님:0)");
		int tneh = sc.nextInt();
		
		System.out.print("총 인구는? (단위:만) ");
		int dlsrn = sc.nextInt();
		
		System.out.print("연소득이 1억 이상인 인구는? (단위:만)");
		int dusthemr = sc.nextInt();
		
		System.out.print ((tneh == 1 && dlsrn >= 100) || (dusthemr >= 50) ? 
				"이 도시는 메트로폴리스 입니다" 
				: "이 도시는 메트로폴리스가 아닙니다");
		
		
	}

}
