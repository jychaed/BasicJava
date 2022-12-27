package e_oop.foodcourt;

import java.util.concurrent.TimeUnit;

public class Restaurant {
	// 푸드코트 입점 식당
	
	Menu[] menuList;
	String name, type; // 상호명 , 판매하는 음식 종류 
	
	public Restaurant(String name, String type) {
		this.name = name;
		this.type = type;
		
	}
	
	public String toString() {
		return String.format("[%s] %s", this.type, this.name); // 이제 상점 이름 볼수있음
//		return"["+this.type+"]" +this.name; // 둘다 쓸수 있음
		
		
	}

	public void order(Menu m, int orderNumber) {
		System.out.println(m.name+"을(를) 요리합니다...");
		for(int i = 0; i < 3; i++) {//어떻게 조리하냐면
			try {
				TimeUnit.SECONDS.sleep(1); // 이거 밑줄 나오면 써라운드! 해야해 ㅎㅎ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 프로그램이 저 시간만큼 정지합니다. 초단위
			System.out.println(i + 1);
		}
		System.out.printf("[%03d]번 고객님, 주문하신 %s이(가) 완성되었습니다.\n",orderNumber, m.name);
		//%03d < d정수 입력할껀데 0으로 3칸 만들고 우측정렬할꺼야//%s 문자열
		System.out.printf("%s에서 받아가세요 ;D", this.name);
		System.out.println();

	}
	
	
}








