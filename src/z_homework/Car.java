package z_homework;

public class Car {
	
	private double speed;
	private String color;
	static double MAX_SPEED;
	
	Car(){}
	Car(String color){
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMAX_SPEED() {
		return MAX_SPEED;
	}
	public static void setMAX_SPEED(double mAX_SPEED) {
		MAX_SPEED = mAX_SPEED;
	}
	
	public boolean speedUp(double speed) {
		if(this.speed + this.speed < 0 || this.speed + speed > MAX_SPEED) {
			return false;
		}else {
			this.setSpeed(speed);
			return true;
		}
	}
	
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
	
	
}
