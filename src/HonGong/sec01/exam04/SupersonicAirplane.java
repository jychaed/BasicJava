package HonGong.sec01.exam04;

public class SupersonicAirplane extends Airplane {
		public static final int NORMAL= 1;
		public static final int SUPERSONIC = 2;
		
		public int flayMode = NORMAL;

		@Override
		public void fly() {
			if(flayMode == SUPERSONIC) {
				System.out.println("초음속비행합니다.");
			}else {
				super.fly();//부모객체의 메서드를 가져옵니다.
			}
		}
		
}
