package z_homework.time;

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		System.out.println("기본 생성자 호출 후 시간: " + t1);
		Time t2 = new Time(22, 15, 48);
		System.out.println("두 번째 생성자 호출 후 시간: " + t2);
		Time t3 = new Time(15, 66, 77);
		System.out.println("올바르지 않은 시간 설정 후 시간: " + t3);
	}

}
