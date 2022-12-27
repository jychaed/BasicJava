package z_homework.jh0730_3;

public class Paikcoffee extends CoffeeShop {

	public Paikcoffee() {
		this.name = "빽다방";
		this.americano = 1500;
		this.latte = 3000;
	}
	
	public void getLatte(Customer c) { // 나중에 금액 다시 쓰면 되니..!
		if(c instanceof VipCustomer) { //c가 Customer인데 VipCustomer이면 아래를 실행하고
 			c.money -= (int)(this.latte * 0.9);
			this.numOfCustomer++;
			this.sales += (int)(this.latte * 0.9);
			System.out.println("vip "+c.name + "가 라떼를 구매했다." );
		}
		else { // 그렇지않고 그냥 Customer면 ㄴㄴ
			c.money -= this.latte;         
			this.numOfCustomer++;
			this.sales += this.latte;
			System.out.println(c.name + "가 라떼를 구매했다." );
		}
		

		
	}
	
	public void getAmericano(Customer c) {
		c.money -= this.americano;
		this.numOfCustomer++;
		this.sales += this.americano;
		System.out.println(c.name + "가 아메리카노를 구매했다." );

	}
	@Override
	public void showInfo() {
		System.out.println("매장 이름 : " + this.name);
		System.out.println("받은 고객 수 : " + this.numOfCustomer);
		System.out.println("매출 : " + this.sales);
	}

}
