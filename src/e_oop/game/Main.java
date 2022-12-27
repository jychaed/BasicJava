package e_oop.game;

import java.util.Random;
import java.util.Scanner;

public class Main { // 각 클래스는 필요한 구성요소 변수들을 저장하고
					// 메인은 보여줄 값들
	
	Character c; // 선언만 하고 초기화 ㄴㄴ
	Item[] itemPool; //얘도 선언만 // item배열이라 복수니까 s붙여서 사용
	Monster[] monsterPool; //Pool : 같은 계열을 모아둔 목록
	Scanner sc = new Scanner(System.in); // 다른메서드에서도 사용하고 싶어서 필드선언

	Main(){
		c = new Character("채진영", 100, 50, 20, 10); //Character뒤에 ctrl+space
		
		itemPool = new Item[12]; // 아이템총갯수
		
		itemPool[0] = new Item("나무검", 0, 0, 10, 0);
		itemPool[1] = new Item("천갑옷", 0, 0, 0, 10);
		itemPool[2] = new Item("체력구슬", 10, 0, 0, 0);
		itemPool[3] = new Item("마력구슬", 0, 10, 0, 0);
		
		itemPool[4] = new Item("강철검", 0, 0, 30, 0);
		itemPool[5] = new Item("가죽갑옷", 0, 0, 0, 30);
		itemPool[6] = new Item("체력주머니", 50, 0, 0, 0);
		itemPool[7] = new Item("마력주머니", 0, 50, 0, 0);
		
		itemPool[8] = new Item("무한의대검", 0, 0, 100, 0);
		itemPool[9] = new Item("가시갑옷", 0, 0, 0, 100);
		itemPool[10] = new Item("체력의 샘", 200, 0, 0, 0);
		itemPool[11] = new Item("마력의 샘", 0, 200, 0, 0);
		//게임에서 사용되는 아이템을 미리 정한 것
		
		monsterPool = new Monster[3];
		//몬클로 이동합니다! 고고
		
//		Item[] items = new Item[] {itemPool[0],itemPool[1],itemPool[2],itemPool[3]};
		Item[] items = {itemPool[0],itemPool[1],itemPool[2],itemPool[3]};
		monsterPool[0] = new Monster("바위게", 20, 20, 10, 10, 50, items);
		monsterPool[1] = new Monster("협곡의 전령", 100, 20, 50, 50, 100
				, new Item[] {itemPool[4],itemPool[5],itemPool[6],itemPool[7]});
		monsterPool[2] = new Monster("바론", 5000, 2000, 200, 200, 400
				, new Item[] {itemPool[8],itemPool[9],itemPool[10],itemPool[11]});
		
	}
	
	public static void main(String[] args) {
		new Main().start(); //new Main() 객체를 만들어서 start() 메소드 실행
		                    // 생성하면서 초기화!
	}

	public void start() {
//		c.showInfo(); 지워주고
		int input = 0;
		System.out.println("===================게임시작==================");
		c.toString();
		System.out.println(c.toString());
		game:
			while(true) {
				if(c.hp <= 0 ) {
					System.out.println("플레이어의 체력이 없습니다.");
					System.out.println("게임이 종료됩니다.");
					break game;
				}
				System.out.println("-----------메인메뉴----------");
				System.out.println("1.내정보     2.사냥    0.종료");
				System.out.println("-----------------------------");
				System.out.println("메뉴를 입력해 주세요 >>>");
				input = Integer.parseInt(sc.nextLine());
				switch(input){
					case 1:
						clearScreen();
						c.showInfo();
						break;
					case 2:
						clearScreen();
						hunt(); //사냥메소드를 만들어야해
						break;
					case 0:
						System.out.println("게임을 종료합니다.");
						break game;
				}
				
				
			}
	}
	
	public void hunt() {
		Monster targetMonster = monsterPool[new Random().nextInt(monsterPool.length)];
		//targetMonster 참조형 변수 주소
		Monster m = new Monster (targetMonster.name, targetMonster.maxHp
				, targetMonster.maxMp, targetMonster.att, targetMonster.def
				, targetMonster.exp, targetMonster.inventory); //참조형 변수는 주소를 가지고 있는 개념
		// 객체를 하나 만들어서 사용해야한다는 개념? // 다시 확인 이거 중요함
		
		System.out.println("-------------전투화면--------------");
		System.out.println(m.name + "을(를) 만났습니다. 전투를 시작합니다.");
		
		
		int input = 0;
		battle:
		while(true) {
			System.out.println("1.공격    2.도망  >>");
			input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				c.attack(m);
				if(m.hp <= 0) {
					System.out.println(m.name + "을(를) 처치하였습니다.");
					System.out.println("------------전투종료-----------");
					c.getItem(m.itemDrop());
					c.getExp(m.exp);
					System.out.println();
					break battle;
					
				}
				m.attack(c);
				if(c.hp <= 0) {
					System.out.println(c.name + "이(가) 죽었습니다.");
					System.out.println("------------전투종료-----------");
					System.out.println();
					break battle;
					
				}
				break;
			case 2:
				System.out.println(m.name + "(으)로 부터 도망쳤습니다.");
				break battle;
				
			}
			
		}
		
	}
	
	
	public static void clearScreen() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println();
		}
	}	
	
}
