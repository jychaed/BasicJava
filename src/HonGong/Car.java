package HonGong;

public class Car {

//	String company = "현대자동차";
//	String model ="그랜져";
//	String color = "검정";
//	int maxSpeed = 350;
//	int spped;
//	
//	Car(String color, int cc){
//		
//	}
	
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int spped;
	
	Car(){		
	}
	
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
		
}
