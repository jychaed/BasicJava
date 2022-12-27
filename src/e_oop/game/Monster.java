package e_oop.game;

import java.util.Arrays;
import java.util.Random;

public class Monster extends Status {
	
//	int hp, mp, exp; //exp 캐릭터한테 넘겨줄 경험치 /// 나머지를 extends Status클래스 뒤에 적어서 사용
	Item[] inventory;//몬스터가 떨굴수 있는 아이템들
	
	private Monster() {	}
	


//	list(서영, 진영, 종은)
//	1. toString 안하고 syso(list) = 출력 : @sjdfiowsjef, @sdjfioewjf, @dsjfiowef
//	2. toSTring 한다(재정의 안하고 그대로 씀) : syso(list.toString()) = 출력 : [서영, 진영, 종은]
//	3. toString을 재정의 한다 
//	(@Override
//	public String toString() {
//		return "학생 이름" + Arrays.toString(instance);
//	for(int i = 0 ; i <list.sizee() ; i++)
//		syso(list.get(i).toString()); = > 학생이름 : 진영
//		학생이름 : 서영
//		학생이름 :~~~~

	public Monster(String name, int maxHp, int maxMp, int att, int def
			, int exp, Item[] inventory) {
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.hp = maxHp;
		this.mp = maxMp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.inventory = inventory;
	}
	//아이템을 떨어트려야해요 //반환타입이 아이템이죠 //랜덤 떨구기
	public Item itemDrop() {
		Random rnd = new Random();
		Item item;
		item = this.inventory[rnd.nextInt(this.inventory.length)];
		return item;
//		return this.inventory[new Random().nextInt(this.inventory.length)];
	}
	
	
	public void attack(Character c) { //파라미터에 누구랑 싸우는지 적기
		// 몬스터가 가하는 데미지
		int damage = this.att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp -= damage; //데미지 만큼 빠져요
		c.hp = c.hp < 0 ? 0 : c.hp; // 왜 0으로 두지?
		System.out.println(this.name + "(이)가 공격으로" + c.name + "에게" + damage 
						   + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP : " + c.hp);
		
	}
}
