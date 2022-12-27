package z_homework.interface_test.a01;

public abstract class Shape implements Comparable{ //Comparable 비교하는 // Shape 상속받으면 다쓰죠
													// Shape 안에 Comparable // f4 누르면 컴페어투 생김!!!
	public Shape(){}
	
	// 쉐입 클래스는 파라미터 받는 생성자가 없다는 의미 기본생성자는 ㅇㅇ
	
	public abstract double area();	
		
	
	public abstract double perimeter();

	@Override
	public int compareTo(Object o) { //Object o 를 파라미터로 받겠다???
		this.area();
		double oArea = ((Shape)o).area(); // 뭐를 볼건지 정해주고요
		if(this.area() > oArea) {
			return 1; // 자리를 바꾼다
		}else if(this.area() == oArea) {
			return 0; // 자리를 바꾸지않는다
		}else {
			return -1;
			
		}
		
	} // strcmp는 두 char* 포인터를 받아서 앞의 것이 
	  // 작으면 -1, 같으면 0, 크면 1을 돌려준다. 반환형은 int다. 
	  // 자바에서 이런 비교를 해주는 메소드가 compareTo다.
	
	
}
