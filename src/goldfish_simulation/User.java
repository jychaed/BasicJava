package goldfish_simulation;

import java.util.*;

public class User {
	Market m;
	User user;
	Item [] Item;
	int input;
	Item i;

	Scanner sc = new Scanner(System.in);
	
	String name ;	 
	int health ;	 
	int love;		 
	int money;      
	int level;
	
	
	User(String name) { //게임시작 기본값 설정
	
	this.name = name;	
	this.level=1; 	
	this.health = 100; 		
	this.love =0;       	
	this.money =300; 	   
	}

	

	
	
	public void Userinfo (Item [] Item) { 
	
		System.out.println("");
		System.out.println("오리이름 : " + name  +"\n건강지수 : "+ health +
		"\n애정도 : " + love+ " %"+"\n보유머니 : "+ money+" 머니"+"\n레벨 : "+level+"Lv");
		System.out.println("==========================================");
		System.out.print("  보유 아이템 : \n");
		for(int i=0; i<11; i++) {
		System.out.println( Item[i].name + ": "+Item[i].num+"개");}
	}
	

	
	
	View view;
	
	//선택 
	public void choice (Item [] Item, Market m, int input,User user) {
	if(Item[input-1].num == 0) {
	System.out.println(Item[input-1].name + "  아이템이 없습니다.(X) \n 상점에서 " + Item[input-1].name + "을(를) 구매해주세요.");
	System.out.println("▶1번 상점으로이동하기       2번 초기메뉴로 돌아가기");
	int input2=sc.nextInt();
		switch(input2) {
			case 1: 
				m.enter(m, Item,input,user);
				break;
			case 2: 
				System.out.println("초기메뉴로 돌아갑니다."); //3초뒤
				System.out.println("──────────────────────────────────────────");
				break;
		}
	}else {
		System.out.println("──────────────────────────────────────────");
		System.out.println(Item[input-1].name + "를 줍니다.");
		System.out.println("건강이 "+Item[input-1].health+"상승합니다.");
		System.out.println("애정도가 "+Item[input-1].love + "상승합니다.");
		Item[input-1].num --;
		System.out.println("남은"+Item[input-1].name+" : " + Item[input-1].num + "개");
		health += Item[input-1].health;
		love += Item[input-1].love;}
	 
		levelUp(user);
		user.health -=25;
		if(health <20) {
			System.out.println("");
			System.out.println("");
			System.out.println("------------------------------------------ ");
			System.out.println("  건강 악화로 오리친구를 입양보냈습니다.   ");
			System.out.println("          게임이 종료되었습니다.           ");
			System.out.println("       다음엔 조금 더 신경써주세요         ");
			System.out.println("------------------------------------------ ");
			System.exit(0);
				}
				
	
	}



	
	public void market ( Market m,Item [] Item, int input, User user) {
		m.enter( m, Item , input , user);
		
	}
	
//	public void levelUp() {
//		this.level++;
//		this.maxHp += 10;
//		this.maxMp += 5;
//		this.att += 2;
//		this.def += 2;
//		this.hp += this.maxHp;
//		this.mp += this.maxMp;
//		this.nextExp = this.level * 100;
//		System.out.println("LEVEL UP !!");
//	}
	
		public void levelUp(User user) { // 유저클래스에 유저객체(인스턴스)를 매개변수를 쓸꺼야
		 if(user.love >= 100) {
			 user.level++;
			 user.love -= 100;
			 user.money += 200;
			 user.health += 20;
			 System.out.println("축하합니다! LEVEL UP!"); 
			 System.out.println("레벨 : " + (user.level-1) + "Lv --> " + user.level + "Lv");
			 
		 }
	}
//			this.level++;
//		this.maxHp += 10;
//		this.maxMp += 5;
//		this.att += 2;
//		this.def += 2;
//		this.hp += this.maxHp;
//		this.mp += this.maxMp;
//		this.nextExp = this.level * 100;
//		System.out.println("LEVEL UP !!");
//	}
	
	
//	public void levelUp (User user) {
//		if (user.love >= 100) {
//			user.level++;
//			user.love -= 100;
//			user.money += 200;
//			user.health += 15;
//		System.out.println("축하합니다! LEVEL UP!");
//		System.out.println("레벨 : " + (user.level-1) + "Lv --> " + user.level + "Lv");
//		}		
//	}
}
