package z_homework.interface_test.a01;

public class Triangle extends Shape {
		private double side;

		public Triangle(double side) {
			super();
			this.side = side; // 초기화했다...! 생성자를 통해 초기화했따!!!
		}
		
		@Override
		public double area() { // 지금 재정의했다.....
			return (Math.sqrt(3) * Math.pow(this.side, 2)) / 4; //Math.sqrt(3)제곱근/Math.pow(this.side, 2) 몇
			
		}
		
		@Override
		public double perimeter() {
			return this.side * 3;
			
		}

		@Override
		public String toString() {
			return "도형의 종류: 정삼각형, 둘레 : " + this.perimeter() + "㎝, 넓이 : " + this.area()+ "㎠";
		}
		
		
}
