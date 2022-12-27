package z_homework.circle;

import z_homework.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(3.6);
		c1.setX(0.0);
		c1.setY(1.5);
		
		System.out.println("반지름 :" + c1.getRadius());
		System.out.println("중심 좌표 :" + "(" + c1.getX()+"," 
							+ c1.getY()+")");
		System.out.printf("넓이 : %.2f\n", c1.getArea()); //.2f 소숫점 둘째자리
		
		Circle c2 = new Circle();
		c2.setRadius(-5.0);
		c2.setX(1.0);
		c2.setY(2.2);
		
		System.out.println("반지름 :" + c2.getRadius());
		System.out.println("중심 좌표 :" + "(" + c2.getX()+"," 
				+ c2.getY()+")");
		System.out.printf("넓이 : %.2f\n", c2.getArea());
		
	}

}
