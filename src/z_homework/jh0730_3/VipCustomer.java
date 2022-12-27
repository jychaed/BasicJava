package z_homework.jh0730_3;

public  class VipCustomer extends Customer implements Discount{

	int dPrice;
	public VipCustomer(String name, int money) {
		super(name, money);
	}

	@Override
	public void discountP(Paikcoffee p, String cName ) {
		 if(cName.equals("americano")) {
			 p.getAmericano(this);
			 
		 }
		 else p.getLatte(this);
		
	}

	@Override
	public void discountS(Starbucks sb, String name) {
		 dPrice = sb.americano / 10; // 할인되는 가격 
		 if(name.equals("americano")) {
			 sb.getAmericano(this);
			 
		 }
		 else sb.getLatte(this);
		
	}



	

}
