package e_oop.foodcourt;

import e_oop.ScanUtil;

public class Main {
	//실제 키오스크 사용자
	// 관리자 주문하는 사람
	// 즉 메인
	
	
	Kiosk k = new Kiosk(); // 주문을 하려면 키오스크가 필요함
	int input, orderNumber; //주문번호 등
	
	public static void main(String[] args) {
		new Main().start();

	}

	private void start() {
		System.out.println("===========================FOOD COURT KIOSK====================");
		main:
			while(true) {
				System.out.println("------------- 사용자 목록 -------------");
				System.out.println("1. 일반 사용자      2. 관리자");
				System.out.println("---------------------------------------");
				System.out.println("선택 >> ");
				input =ScanUtil.nextInt();
				switch(input){//사용자를 선택하겠다 보여주기만 한 상태
				case 1:
					userInterface(); // 상호작용하는 화면이 인터페이스 
					break;
				case 2:
					adminInterface();
					break;

				}
				
				
			}
	}

	private void adminInterface() {
		//식당 메뉴 등록하기
		System.out.println("==========키오스크 관리=============="); //계속관리자화면
		admin:
		while(true) {
			System.out.println("---------관리자목록-----------");
			System.out.println("1.식당추가  2.메뉴추가 3.종료");
			System.out.println("-----------------------------");
			System.out.println("선택>>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				k.insertRestaurant(); //키오스크에 식당을 추가하겠다! //행위를 하겠다 메소드!
				break;
			case 2:// 관리자가 추가
				k.insertMenu();
				break;
			default:
				break admin;
								
			}
			
			
		}
		
		
	}

	private void userInterface() {
		System.out.println("============ 식사 주문하기 ===========");
		user:
		while(true) {
			Restaurant r = k.showRestaurantList(); //키오스크의 레스토랑 목록을 보여줘
			if(r == null) {
				break user; // 식당이 추가 되지않으면 메인 메뉴로 이동합니다.
			}
			// 너식당 잘골랐다
			System.out.println("메뉴 선택으로 이동합니다..");
			Menu m = k.showMenuList(r); // 메뉴 보여줘 메소드! (r) 선택된 레스토랑 이거라고 키오스크에 알려줌
			if(m == null){
				break user;
			}
			orderNumber++;
			r.order(m, orderNumber);//식당에 그 주문을 넘겨줍니다. 메뉴,번호
			System.out.println("\n\n");
			//break user;
		}
		

	}
	
	

}











