package z_homework.extends_test.a020729;

public class ShapeTest {

	public static void main(String[] args) {
			Shape[] shapes = new Shape[3]; //Shape 부모로 선언된 변수에는 shapes자식들을 []에 넣을수있다
			shapes[0] = new Circle(1.0);
			shapes[1] = new Triangle(2.0);
			shapes[2] = new Rectangle(2.0, 3.0);
			for (Shape shape : shapes) { //shapes에서 하나씩 뺄거고 그거는 Shape의 shape라고 이름붙인다
				System.out.println(shape);
			}

	}

}
