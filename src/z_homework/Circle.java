package z_homework;

public class Circle {
	/* 필드 : 클래스 블럭 안에서 다른 블럭에 포함되지 않는 곳*/
	
	private double radius;
	private double x;
	private double y;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius < 0) {
			this.radius = 0;
		}else {
			this.radius = radius;
		}
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	
	
}
