package HonGong.sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		System.out.println("===========");
		sa.flayMode = SupersonicAirplane.SUPERSONIC;
//		sa.fly();
//		System.out.println("===========");
//		sa.flayMode = SupersonicAirplane.NORMAL;
//		sa.fly();
//		sa.land();
		
	}
}
