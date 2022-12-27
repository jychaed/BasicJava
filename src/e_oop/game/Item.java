package e_oop.game;

public class Item extends Status{

//	String name;
//	int maxHp, maxMp, att, def; //extends Status 처리
	
	private Item() {}

	public Item(String name, int maxHp, int maxMp, int att, int def) {
		// super(); 무시
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.att = att;
		this.def = def;
	}

	@Override
	public String toString() {
		
		// Item( "나무검" , 10 ,0 ,5, 0)
		String info = name + " : ";
		if(maxHp > 0) {
			info += " 체력+" + maxHp;
		}
		info += (maxMp > 0) ? (" 마나+" + maxMp) : "";
		info += (att > 0) ? (" 공격+" + att) : "";
		info += (def > 0) ? (" 방어+" + def) : "";
		return info; // 여기 "" 이거면 아이템 먹은거 안뜸! 꼭 info!!!
		
	}
	
	
	
}
