package z_homework.plane;

public class Plane {
	private String manufactue; // 제작사
	private String model; //  비행기 모델명
	private int maxNumberOfPassengers; // 최대 승객수
	private static int numberOfPlanes; // 지금까지 생성된 비행기의 객체수,
							// 객체가 생성될때마다 생성자에서 증가시켜줌
							// numberOfPlanes++;이거를 추가해야함을 알게됫!
							// 마름모 때문에 Static
	
	Plane(){
		numberOfPlanes++;
		this.manufactue = "";
		this.model = "";
		this.maxNumberOfPassengers = 0;
	}
	Plane(String manufactue, String model, int maxNumberOfPassengers){
		numberOfPlanes++;
		/**/
		this.manufactue = manufactue;
		this.model = model;
		//this.maxNumberOfPassengers = maxNumberOfPassengers <0 ? 0 : maxNumberOfPassengers ;
		setMaxNumberOfPassengers(maxNumberOfPassengers);
	}
	
	
	
	public String getManufactue() {
		return manufactue;
	}
	public void setManufactue(String manufactue) {
		this.manufactue = manufactue;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers < 0? 0 :maxNumberOfPassengers;
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
//	public static void setNumberOfPlanes(int numberOfPlanes) {
//		Plane.numberOfPlanes = numberOfPlanes;
//	} // 이거는 추가하지 않아야함 왜냐면 내가 입력해주지 않기 때문에
	
	public String toString() {
		return ""; // 문제에 있으니까.. 씀...?
	}
	
}