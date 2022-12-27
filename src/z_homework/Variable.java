package z_homework;

import java.util.Scanner; //// ctrl + space 이거봐야함

public class Variable {

	public static void main(String[] args) {
		

        
        
		// TODO Auto-generated method stub

		// 실수 자료형을 이용하여 직사각형의 둘레와 면적을 구하는 프로그램을 만들어보자. 
		// 실수형 변수 width(가로), height(세로), area(넓이), perimeter(둘레)를 선언하고, 
		// Scanner 클래스를 이용하여 사용자로부터 직사각형의 가로, 세로 길이를 입력받아 다음과 같이 넓이와 둘레를 출력한다.
		// 3.7
		
		double width, height, area, perimeter;
		Scanner sc = new Scanner(System.in);
        
		System.out.print("직사각형의 가로를 입력해 주세요>>");
		width = Double.parseDouble(sc.nextLine());
        
		System.out.print("직사각형의 세로를 입력해 주세요>>");
		height = Double.parseDouble(sc.nextLine());
        
  		area = width * height ;
		System.out.println("직사각형의 넓이 :" + area);
        
		perimeter = (width + height) * 2;
		System.out.println("직사각형의 둘레 :" + perimeter);
		
		
        
        
        
        
        
        
        
        
        
        
        
        
//		Scanner sc =new Scanner(System.in);
//		System.out.print("가로의 길이는?(단위 : m):>>");
//		double width = sc.nextDouble();
//		System.out.print("세로의 길이는?(단위 : m):>>");
//		double heifht = sc.nextDouble();
//
	
		
		
		
		
		
//		Scanner sc = new Scanner(System.in); 
//		 
//       System.out.print("가로의 길이는?(단위: m)"); 
//       double width = sc.nextDouble(); 
//
//       System.out.print("세로의 길이는?(단위: m)"); 
//       double height = sc.nextDouble(); 
//
//       double result = width * height; 
//       System.out.println("직사각형의 넓이: " + result); 
//
//       result = (width+height) * 2; 
//       System.out.println("직사각형의 둘레: " + result); 
		
//		
		
 
    
		
		
	}	
		
}
