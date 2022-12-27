package e_oop.game;

import java.util.Arrays;

public class Character extends Status {
//	int hp, mp, level, exp, nextExp;
    
	
	Item[] inventory; // 캐릭터는 아이템착용 가능
	
	
	private Character() {} 
	// alt +shift + s -> generate constructor using fields


	public Character(String name, int maxHp, int maxMp, int att, int def) {
		//super(); 신경쓰지말자
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.hp = maxHp;
		this.mp = maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0 ;
		this.nextExp = this.level * 100;
		this.inventory = new Item[100]; // 장비창
		
		
		
	}
	
	public void showInfo() {//현재상태를 보여주는 곳
		System.out.println("----------- 상태 -------------");
		System.out.println("이름 : " + this.name);
		System.out.println("레벨 : " + this.level);
		System.out.println("체력 : " + this.hp + "/" + this.maxHp);
		System.out.println("마나 : " + this.mp + "/" + this.maxMp);
		System.out.println("공격 : " + this.att);
		System.out.println("방어 : " + this.def);
		System.out.println("경치 : " + this.exp + "/" + this.nextExp);
		System.out.println("------------------------------");
		System.out.println("-----------아이템-------------");
		for(int i = 0 ; i < this.inventory.length; i++) {
			if(inventory[i] != null) {
				//print 메서드에 객체만 들어가면 toString 메서드가 실행됨
				System.out.println(this.inventory[i]); //toString 메서드 실생
			}
		}
		System.out.println("------------------------------");
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Character [name=" + name + ", maxHp=" + maxHp + ", maxMp=" + maxMp + ", hp=" + hp + ", mp=" + mp
				+ ", att=" + att + ", def=" + def + ", level=" + level + ", exp=" + exp + ", nextExp=" + nextExp
				+ ", inventory=" + Arrays.toString(inventory) + "]";
	}


	public void attack(Monster m) { //파라미터에 누구랑 싸우는지 적기
		// 캐릭터가 가하는 데미지
		int damage = this.att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage; //데미지 만큼 빠져요
		m.hp = m.hp < 0 ? 0 : m.hp; // 왜 0으로 두지?
		System.out.println(this.name + "(이)가 공격으로" + m.name + "에게" + damage 
						   + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
		
	}


	public void getItem(Item itemDrop) {
		System.out.println(itemDrop.name + "을(를) 획득하였습니다.");
		for(int i = 0; i < this.inventory.length; i++) {
			if(this.inventory[i] == null) {
				this.inventory[i] = itemDrop;
				break;
			}			
		}
		this.maxHp += itemDrop.maxHp;
		this.maxMp += itemDrop.maxMp;
		this.att += itemDrop.att;
		this.def += itemDrop.def;
		
		
	}
	
	public void getExp(int exp) { //exp를 가져온다 획득!
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp; //this.exp 누적경험치, exp =몬스터경험치
						 //nextExp 레벨업에 필요한 경험치
		while(this.exp >= this.nextExp) { //this.exp >= this.nextExp 이면 레벨업
			this.exp -= nextExp;		  //레벨업에 필요했던 경험치 만큼 this.exp차감
			levelUp(); // 레벨업하면 경험치가 그만큼 빠지는?
		}
		
	}
	
	public void levelUp() {
		this.level++;
		this.maxHp += 10;
		this.maxMp += 5;
		this.att += 2;
		this.def += 2;
		this.hp += this.maxHp;
		this.mp += this.maxMp;
		this.nextExp = this.level * 100;
		System.out.println("LEVEL UP !!");
	}
	
	
}













