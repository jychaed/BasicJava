package HonGong.sec01.exam03;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체(재정의한것)의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
