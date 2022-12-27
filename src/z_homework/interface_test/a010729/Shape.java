package z_homework.interface_test.a010729;

public abstract class Shape implements Comparable {

	public Shape(){}
	
	public abstract double area() ;		
	
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
	}
}
