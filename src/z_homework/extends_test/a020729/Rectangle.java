package z_homework.extends_test.a020729;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height =height;
	}
	@Override
	public double area() {
		return this.width * this.height;
	}
	
	@Override
	public double perimeter() {
		return (this.width + this.height) * 2;
	}

	@Override
	public String toString() {
		return "도형의 종류 : 직사각형, 둘레 : " + this.perimeter() + "㎝, 넓이 : " + this.area() + "㎠";
	}
	
	
}
