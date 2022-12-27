package e_oop;

public class Static {
					
  		/*
		 * - static을 붙이면 프로그램을 실행시 메모리에 올라간다.
		 * - 객체생성을 하지 않아도 사용할 수 있다.
		 * - ststic을 붙인 변수는 객체간에 변수의 값을 공유한다.
		 * - ststic이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
		 * - ststic이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
		 * 
		 */
		
		/*
		 *  시작하자마자 올라간다? 메모리가 이미 변수가 올라가져 있어요
		 *  보통 우리가 객체를 생성하면 힙영역에 형성되는데 
		 *  그게 스택영역에 쌓였다가 빠지고 
		 *  실제로 그 객체는 힙의 영혁
		 *  실행은 메서드 영역
		 */		
		
		// 값을 공유하기 위해 static 을 붙인다.
	
		static int var;
		
		 public static void main(String[] args) {
			 Human 철수 = new Human();
			 Human 영희 = new Human();
			 
			 철수.saveMoney(100000);
			 영희.saveMoney(200000);
			 
			 철수.saveCouleMoney(50000);
			 System.out.println(영희.coupleAccount);
			 영희.saveCouleMoney(60000);
			 System.out.println(철수.coupleAccount);
			 
			 Human 아이유 = new Human();
			 아이유.saveCouleMoney(10);
	}

}
class Human{
	int account;//잔고. 전역변수
	public void saveMoney(int money) {
		this.account += money;
		System.out.println("통장잔고 : " + this.account);
	}
	
	static int coupleAccount; 
	//static의 사용 = 메소드 간에 데이터가 공유가 필요할때.
	//static은 정말 필요할때만 어쩔 수 없이사용한다.
	public void saveCouleMoney(int money) {
		this.coupleAccount += money;
		System.out.println("커플통장 잔고 : " + coupleAccount);
	}
	
}

//클래스 만들어서 성적표 만들어보기.