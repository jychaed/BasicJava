package z_homework.time;

public class Time { // 클래스 프라이빗이면... 암것도 못해요
	//자물쇠 잠겨있으니까 private
	private int hour; // 시를 나타내며 0부터 23까지의 값을 갖는다.
	private int minute; //분을 나타내며 0부터 59까지의 값을 갖는다.
	private int second;  // 초를 나타내며 0부터 59까지의 값을 갖는다.
	
	Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;	
	} //기본생성자이고 현재 파라미터는 없다.
	Time(int hour, int minute, int second){ //int3개 가진 생성자
		this.hour = (hour < 0 || hour > 23) ? 0 : hour;
		this.minute = (minute < 0 || minute > 59) ? 0 : minute;
//		this.second = (second < 0 || second > 59) ? 0 : second;
		this.second = second;
		if(this.second < 0 || this.second > 59) {
			this.second = 0;
		}
	}
	
	public String toString() { // String을 반환하고 public이니 오픈!
		return String.format("%02d:%02d:%02d", hour, minute, second);
		// 02d 정수d인데 앞에 10이하면 0으로 앞을 표기하겠다.
	}
	
}
