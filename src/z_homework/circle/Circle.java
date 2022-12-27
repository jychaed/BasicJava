package z_homework.circle;

public class Circle {
	/* 필드 : 클래스 블럭 안에서 다른 블럭에 포함되지 않는 곳*/
	private double radius, x, y;

	Circle(){ } // 대문자로 시작하는 단어에 괄호()있으면 생성자다
	// 기본생성자 앞에 우선은 public을 넣어주세요
	// 기본생성자를 선언하지 않는다고 해서 받는 패널티는 없으나 쓰세요!
	// 보통은 재정의 필요할때 쓰는 편!

	public double getArea() { //get메소드는 파라미터가 없고요 반환값은 있다
		// return 3.14 * raidus * raidus;
		   return Math.PI * Math.pow(radius, 2); // 파우는 제곱!

	}
	
	// alt + shift + s -> generate getters and setters
	// 이걸 만드는 이유는 필드에 직접 접근하는 것을 막기 위해서 사용
	// 보안상의 이유로 접근을 막음
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius < 0 ? 0 : radius; //삼항연산자
//		if(radius < 0) this.radius = 0;
		
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
	

	
}
