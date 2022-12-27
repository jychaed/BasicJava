package z_homework;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	Time(){ };
	
	Time(int hour, int minute, int second){
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		this.hour = hour;
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		return;		
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		return;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		return;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
	
	
}
