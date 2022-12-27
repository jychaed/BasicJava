package z_homework;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	static int numberOfPlanes;
		
	Plane(){ numberOfPlanes++; };
	
	
	Plane(String manufacture, String model, int maxNumberOfPassengers){	
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
	}
	
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
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
		if(maxNumberOfPassengers < 0) {
			maxNumberOfPassengers = 0;
		}
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	public static void setNumberOfPlanes(int numberOfPlanes) {
		Plane.numberOfPlanes = numberOfPlanes;
	}
	
	
	
	
}
