package z_homework.interface_test.a01;

	public class Circle extends Shape {
		private double radius;

		public Circle(double radius) {
			super();
			this.radius = radius; // 초기화했다...! 생성자를 통해 초기화했따!!!
			
			
		}
		public double area() {
			return Math.pow(this.radius, 2)*Math.PI;
			
		}
		
		@Override
		public double perimeter() {
			return 2 * Math.PI * this.radius ; //2파이r
			
		}

		@Override
		public String toString() {
			return "도형의 종류: 원, 둘레 : " + this.perimeter() + "㎝, 넓이 : " + this.area()+ "㎠";
		}
		
		
	}


