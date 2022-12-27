package z_homework.extends_test.a02;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	// shift+alt+s => 제너레이터 컨스트레이트 필드..........
	public Rectangle(double width, double height) { // 생성자를 통해 초기화한다. 
		super();
		this.width = width;
		this.height = height; // 초기화했다...! 생성자를 통해 초기화했따!!!
	}
	
	@Override // 쉐이프 있는거 재정의! 내가 써먹을꺼야... 다시 재정의
	public double area() {
		return this.width*this.height;
		
	}
	
	@Override
	public double perimeter() {
		return (this.width+this.height)*2;
		
	}

	@Override
	public String toString() {
		return "도형의 종류: 직사각형, 둘레 : " + this.perimeter() + "㎝, 넓이 : " + this.area()+ "㎠";
	}
	
	
}
