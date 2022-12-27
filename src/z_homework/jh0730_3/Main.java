package z_homework.jh0730_3;

public class Main {

	public static void main(String[] args) {

	 Customer chae = new Customer("ㅊㅈㅇ" , 100000);
	 
	 VipCustomer park = new VipCustomer("박박이", 50000);

	 Paikcoffee baek = new Paikcoffee();
	 Starbucks starBucks = new Starbucks();
	    
	   // 채진영이 백다방을 가서 라때를 삼 
	  baek.getLatte(chae);

	   //박박이가 스타벅스에가서 아메리카노를 삼  
	  baek.getLatte(park);

	   //스타벅스의 받은 고객 수 , 번돈  출력 
	 starBucks.showInfo();
	 
	   // 백다방의 받은 고객 수 , 번돈 출력 
	 baek.showInfo();
	 
	 System.out.println(chae.name + "의 잔액 :" + chae.money);
	 System.out.println(park.name + "의 잔액 :" + park.money);
	 
	 
	}
    
}
