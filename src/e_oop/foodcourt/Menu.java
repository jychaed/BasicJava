package e_oop.foodcourt;

public class Menu {
	//식당에서 파는 메뉴
	String name;// 음식명
	int price;//가격
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String toString() {
		return String.format("[%6d원]%s", this.price, this.name); //%6d 칸 짜리
		
	}
	
}
