package goldfish_simulation;

import java.util.*;

public class Market {
	View view ;
	Item [] Item;
	User user;
	int input;
	Market m;
	Scanner sc = new Scanner(System.in);

	
	
	void enter (Market m, Item [] Item, int input, User user) {
		   System.out.println("──────────────────────────────────────────────────");
		   	System.out.println(Item[(input-1)].name + "을/를 구매하시겠습니까?");
			System.out.println("▶ 1번 예      2번 초기메뉴로 돌아가기");
			System.out.println("──────────────────────────────────────────────────");
			int input2 = sc.nextInt();			
			if(input2 == 1) {
				if(user.money<Item[(input-1)].money) {
					System.out.println("머니가 부족합니다.");
					}
				else {
			System.out.println(Item[input-1].name + " 을/를 구입하였습니다."  +"("+ Item[input-1].money+"머니 차감)"  ); 
			user.money -= Item[input-1].money;
			Item[input-1].num ++;
			}
			}
	}		
}
