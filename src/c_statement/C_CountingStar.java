package c_statement;

public class C_CountingStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		System.out.println("===============");
//		for (int i = 1;  i <= 5; i++) {
//			for(int j = 6 - i; j >= 1 ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			
		System.out.println("===============");
		
		
		
		for(int i =0; i < 5 ; i++) {
			for(int j = i; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("===============");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 6 - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("===============");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============");
			for(int i = 5; i >= 1; i--) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		
		// 
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		
		System.out.println("===============");
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.println();
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
			
	
		System.out.println("===============");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 4 ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		System.out.println("===============");
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 4 ; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=5; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("===============");
		
		
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		System.out.println("----------");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("===============");
	}

}
