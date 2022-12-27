package HonGong;

public class CarExample {

	public static void main(String[] args) {
//		Car myCar = new Car();
//		//객체를 생성함 Car클래스에서 받아오는(new) Car
//		
//		System.out.println("제작회사 :" + myCar.company);
//		System.out.println("모델명 :" + myCar.model);
//		System.out.println("색깔 :" + myCar.color);
//		System.out.println("최고속도" + myCar.maxSpeed) ;
//		System.out.println("현재속도" + myCar.spped);
//		// Car의 필드값을 읽어옵니다
//		
//		myCar.spped = 100;
//		System.out.println("수정된 현재속도:" + myCar.spped);
		
		
//		Car myCar = new Car("검정", 3000);
		 Car car1 = new Car();
		 System.out.println("car1.company : " + car1.company);
		 System.out.println();
		 
		 Car car2 = new Car ("자가용");
		 System.out.println("car1.company : " + car1.company);
		 System.out.println("car2.model : " + car2.model);
		 System.out.println();
		 
		 Car car3 = new Car ("자가용", "빨강");
		 System.out.println("car1.company : " + car1.company);
		 System.out.println("car2.model : " + car2.model);
		 System.out.println("car3.color : " + car3.color);
		 System.out.println();
		
		
	}


}
