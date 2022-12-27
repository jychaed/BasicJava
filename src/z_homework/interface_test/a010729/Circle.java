package z_homework.interface_test.a010729;

public class Circle extends Shape {
	
	private double radius; // 필드를 가지고
	
	
	public Circle (double radius) {
		this.radius = radius; // 생성자를 통해 초기화한다.
	}
	
	@Override
	public double area() {
		return Math.pow(this.radius, 2)*Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius ;
	}

	@Override
	public String toString() {
		return "도형의 종류 : 원, 둘레 : " + this.perimeter() + "㎝, 넓이 : " + this.area() + "㎠";
	}
	

	
}
