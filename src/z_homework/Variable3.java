package z_homework;

import java.util.Scanner;

public class Variable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double r, h ;
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("밑변 반지름을 입력하시오>>");
        r = Double.parseDouble(sc.nextLine());
        		
        System.out.print("원기둥의 높이를 입력하시오>>");
        h = Double.parseDouble(sc.nextLine());
        
        double r2 = Math.PI*(r*r);   
        double r3 = Math.PI*(r*r)*h;
        System.out.println("원기둥 밑변의 넓이는 "+ r2 + "cm^2이고, " + "원기둥의 부피는" + r3 + "cm^3이다");
      
//        double r3 = Math.PI*(r*r)*h;
//        System.out.println("원기둥의 부피는 "+ r3 + "이다");
       
//        System.out.print("원기둥의 높이를 입력하시오");
//        double r2 = sc.nextDouble();
        
//        double r3 = Math.PI*(r*r); 
//        System.out.println("원기둥 밑변의 넓이는 "+ r3 + "이고");
        
//        double r4 = r2 * r3;
//        System.out.println("원기둥의 부피는 "+ r4 );
	//	
		
        
//        
//        
//        System.out.println("Enter radius : ");
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextDouble();
//        double CircleArea = Math.PI*(r*r); // Match class 
//        System.out.println("Area is : "+CircleArea);
//        double CircleCircumference = 2*(Math.PI*r);
//        System.out.println("Circumference is : "+CircleCircumference);
        
        
	}

}
