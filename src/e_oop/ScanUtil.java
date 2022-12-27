package e_oop;

import java.util.Scanner;

public class ScanUtil {
   //스캐너를 손쉽게 사용할 수 있는 static 메서드를 가지고있음
	static Scanner sc = new Scanner(System.in);
	
	public static String nextLine() {
		return sc.nextLine();
		
	}
	
	public static int nextInt() {
		return Integer.parseInt(sc.nextLine());
	}
}
