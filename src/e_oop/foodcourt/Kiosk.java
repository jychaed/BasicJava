package e_oop.foodcourt;

import e_oop.ScanUtil;

public class Kiosk {
	// 키오스크 얘안에서 모든게 일어난다
	// 주문의 모든 행위기 이뤄짐
	
	Restaurant[] restaurantList;// = null;(현재) //식당목록// 레스토랑 배열이에요 참조형은 널이죠
	int input; // 각메서드에서 선언하기 귀찮아서 전역변수로 선언
	
	public void insertRestaurant() { // k.insertRestaurant(); 이거 만들었더니 여기에 생김
		// 키오스크에 식당을 추가함
		System.out.println("-----식당추가-----");
		System.out.println("식당 종류 >>");
		String type = ScanUtil.nextLine();
		System.out.println("식당 이름 >>");
		String name = ScanUtil.nextLine();
		//식당추가를 위한 정보를 다 받았어요
		if(restaurantList == null) {// 배열 참조형 변수가 0이면
			restaurantList = new Restaurant[1]; //나는 배열을 해야하니까 1개짜리 배열을 만듦
			restaurantList[0] = new Restaurant(name, type); // 1개짜리를 만들었으니 0이죠 (이름 종류 넣고)
		  //public Restaurant(String name2, String type2) { < 레스토랑 클래스에 이거 만들엇
		}else {// 임시배열에 우선 넣어요 
			Restaurant[] temp = new Restaurant[this.restaurantList.length +1];//1늘려서 템프에 넣음
			for(int i= 0 ; i < this.restaurantList.length; i++) {
				temp[i] = this.restaurantList[i];
			}
			temp[temp.length -1] = new Restaurant(name, type);// 배열의 마지막 자리에 넣어! 배열 맨끝에!
			this.restaurantList =temp; // 그럼ㄴ 난 이걸 써먹어 
			
			// if안돌리면 null의 길이를 구할수 없느니가 꼭 넣어줘야해
		
		}
		System.out.printf("[%s] %s 식당이 추가되었습니다.", type, name);
		System.out.println();
	}
	
	public Restaurant showRestaurantList(){ //식당의 주체를 키오스크가 보여줘야하니 여기 만든다
		if(this.restaurantList == null || this.restaurantList.length <= 0) { 
			// 앞이 트루면 뒤를 하지않아요 그래서 순서바꾸면 오류나요 , 뒤를 실행하지 않아요 뒤는 못구해!  
			//|| this.restaurantList.length <= 0 안써도 되긴함 허나 배열을 0개짜리 만든사람은 만들어야함
			System.out.println("등록된 식당이 없습니다.");
			return null;// 메소드가 그자리에서 중단//이조건을 통과했다는 거는 else 안해도됨
		}
		list:
		while(true) { // 올바른 선택할때까지 못나가
			System.out.println("--------식당목록--------");
			System.out.println("999: 나가기" );
			// 선택지 생성 
			// 매뉴번호 or 0번 
			
		
				
				for(int i = 0; i < this.restaurantList.length; i++) {
					System.out.printf("%2d. %s", i+1, this.restaurantList[i]);
					System.out.println();
				}
				System.out.println("-------------------------");
				System.out.println("선택 >>");
				input = ScanUtil.nextInt();
					if(input > restaurantList.length || input < 1) {
						System.out.println("잘못 입력하였습니다.");
					}else {
						System.out.println(restaurantList[input - 1].name + "을 선택하였습니다.");
						break list;
			
					}	
			
		}
		return restaurantList[input - 1]; //선택된 식당을 반환해라
		
	}

	public void insertMenu() {
		//키오스크에 메뉴를 추가함 //여기서 데려옴 >>case 2:// 관리자가 추가 k.insertMenu();
		Restaurant r = showRestaurantList();
		System.out.println("-----------메뉴 추가------------");
		System.out.println("메뉴 이름 >>");
		String name = ScanUtil.nextLine();
		System.out.println("메뉴 가격 >>");
		int price = ScanUtil.nextInt();
		//메뉴 추가 할게요
		if(r.menuList == null) {
			r.menuList = new Menu[1];
			r.menuList[0] = new Menu(name, price);
			
		}else {
			Menu[] temp = new Menu[r.menuList.length + 1];
			for(int i = 0; i < r.menuList.length; i++) {
				temp[i] = r.menuList[i];
			}
			temp[temp.length - 1] = new Menu(name, price);
			r.menuList = temp;
			
		}
		System.out.println(name + "메뉴가 추가되었습니다.");
		
	}

	public Menu showMenuList(Restaurant r) {//Menu m = k.showMenuList(); // 메뉴 보여줘 메소드! 여기로 뿅
		if(r.menuList == null || r.menuList.length < 1){
			System.out.println(r.name +"에 등록된 메뉴가 없습니다..");
			return null;
			
		}
		list:
		while(true) {
			System.out.println("-----"+r.name+"차림표 -----");
			for(int i = 0; i < r.menuList.length; i++) {
				System.out.printf("%2d. %s", i+1, r.menuList[i]);
				System.out.println();
			}
			System.out.println("---------------------------");
			System.out.println("선택 >>");
			input = ScanUtil.nextInt();
			if(input > r.menuList.length || input < 0) {
				System.out.println("잘못 입력하였습니다.");
			}else {
				System.out.println(r.menuList[input - 1].name + "을(를) 선택하였습니다.");
				System.out.println("가격은" + r.menuList[input-1].price + "원 입니다.");
				break list;
				
			}
			
		}
		
		return r.menuList[input-1]; // 이거 리턴 널이면... 계속 메뉴만 고름 요리를 안함
	}
	
	
}









