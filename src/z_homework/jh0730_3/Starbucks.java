package z_homework.jh0730_3;

public class Starbucks extends CoffeeShop {

	public Starbucks() {
		this.name = "스타벅스";
		this.americano = 3000;
		this.latte = 6000;
	}
	
	public void getLatte(Customer c) { // 나중에 금액 다시 쓰면 되니..!
		c.money -= this.latte;         
		this.numOfCustomer++;
		this.sales += this.latte;
		System.out.println(c.name + "가 라떼를 구매했다." );
	}
	
	public void getAmericano(Customer c) {
		c.money -= this.americano;
		this.numOfCustomer++;
		this.sales += this.americano;
		System.out.println(c.name + "가 아메리카노를 구매했다." );

	}
	
	@Override
	public void showInfo() {
		System.out.println("=================================");

		System.out.println("매장 이름 : " + this.name);
		System.out.println("받은 고객 수 : " + this.numOfCustomer);
		System.out.println("매출 : " + this.sales);
		System.out.println("=================================");
	}

}
