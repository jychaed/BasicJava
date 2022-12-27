package goldfish_simulation;

import java.util.Scanner;

public class View {

	
	User user; //유저클래스를 이용해 유저 인스턴스 객체를 선언(초기화안함)
	Market m = new Market(); // 마켓클래스를 이용 m  유저 인스턴스 객체를 선언
    Item [] Item; //아이템 클래스를 이용해 배열을 선언했고 아이템에 뭐가 들어있는지 모름 //그래서 아이템클래스 만들어서 넣어주자
    Item i;
    Scanner sc = new Scanner(System.in);
	
	
	{	
	
		
		
		System.out.println("");

		System.out.println("──────────────────────────────────────────"); 
		System.out.println("            귀요미 오리키우기.•♥          ");
		System.out.println("");
		System.out.println("       게임 목표 : 오리의 무병장수 ;D     ");
		System.out.println("──────────────────────────────────────────");
		System.out.println("");
		
		System.out.println("     오늘은 오리를 입양하러 가는 날.•♥    ");
		System.out.println("");
		System.out.println("농장에 도착해서 함께할 오리를 찾아봅니다!!");
		System.out.println("");
		System.out.println("   당신의 눈에 딱 들어온 꼬질꼬질 오리!   ");
		System.out.println("");
		System.out.println("당신과 함께 하길 딱 봐도 원하는 눈빛이네요");
		System.out.println("");
		System.out.println("        데려가는게 좋을듯 싶은데요..      ");
		System.out.println("");	
		System.out.println("        오리에게 이름을 지어주세요        ");
		String name = sc.nextLine();
		user = new User(name);
        System.out.println("──────────────────────────────────────────");
		System.out.println("오리의 이름이 입력되었습니다.");
		System.out.println("우리와 함께하는 오리친구의 이름은 " + user.name+ "(이)네요~");
		System.out.println("");
		System.out.println("자, 오리친구와 함께하기 위한 설명을 위해 시작 버튼?");
		sc.nextLine();
		System.out.println("====================게임 설명======================");
		System.out.println("	오리친구를 건강하게 키워주세요");
		System.out.println("오리가 건강을 잃으면 입양을 보내야 합니다");
		System.out.println("멋진 오리가 성장하는 결말을 꼭 봐주세요!!");
		System.out.println("");
		System.out.println("■ Tip ■");
		System.out.println("시간이 지날수록 오리의 건강이 악화됩니다.\n 건강이 20이 되기전에 다양한 활동을 통해 건강을 끌어올려주세요.");
		System.out.println("애정도가 100%가 되면 레벨이 업 됩니다.\n 레벨 업 혜택 : 건강 15 증가, 100머니 획득\n");
		System.out.println("==============================================");
		System.out.println("");
		System.out.println("  ☞게임을 시작하려면 아무키나 눌러주세요     ");
		sc.nextLine();
	
		
		
		 //(String name, int num,  int strong, int love, int money)
		Item = new Item[11];
		Item[0] = new Item("오리모이주기",2,5,15,5);
		Item[1] = new Item("영양제주기",2,5,15,10);
		Item[2] = new Item("톱밥세트",0,20,20,30);
		Item[3] = new Item("배변청소세트",0,10,20,15);
		Item[4] = new Item("케이지청소세트",0,5,10,5);
		Item[5] = new Item("산책하기",0,15,30,0);
		Item[6] = new Item("낮잠자기",0,15,40,30);
		Item[7] = new Item("운동기구",0,10,50,50);
		Item[8] = new Item("전구",0,20,50,150);
		Item[9] = new Item("온열기",0,20,50,120);
		Item[10] = new Item("그릇바꿔주기",0,10,100,200);
	
		System.out.println("===================내 정보입니다===================");
		user.Userinfo(Item);
		System.out.println("==============================================");
		
		
	}
	

	public static void main(String[] args) {	
	
		new View().start();
	      

	}
	

	
	void start () {
			while(true) {
				
				System.out.println("");
			
				System.out.println("\n\n원하는 메뉴의 번호를 입력해주세요 >\t\n" + 
				"1. 밥주기 2. 집청소 3. 놀기 4.집꾸미기  5.상점  6.내 정보보기 ");
			int input = sc.nextInt(); 
			
			switch (input) {	
			 case 1 : 

					System.out.println("──────────────────────────────────────────"); 
					System.out.println("밥 주기를 선택하셨습니다.  ");
					System.out.println("1번 오리모이주기\t 2번 영양제주기");
					input = sc.nextInt(); 
					user.choice(Item,m,input,user);
			 		break;
			 		
			 case 2 : 
				 	System.out.println("──────────────────────────────────────────"); 
				 	System.out.println("집 청소를 선택하셨습니다.");
					System.out.println("1번 톱밥갈아주기\t 2번 배변 치워주기\t 3번 케이지 청소");
					input = sc.nextInt()+2;
					 user.choice(Item,m,input,user);
				 	break;
				 	
			 case 3 : 
				    System.out.println("──────────────────────────────────────────────────");
					System.out.println("놀기를 선택하셨습니다.");
					System.out.println("1번𓆟𓆞𓆝𓆜𓆛 산책하기\t 2번 낮잠자기\t 3번 운동하기");
					input=sc.nextInt()+5;
					 user.choice(Item,m,input,user);
				 	break;
				 	
			 case 4 : 
				    System.out.println("──────────────────────────────────────────────────");
					System.out.println("집꾸미기를 선택하셨습니다.");
					System.out.println("1번 전구달아주기\t 2번 온열기달아주기\t 3번 그릇바꿔주기");
					input=sc.nextInt()+8;
					 user.choice(Item,m,input,user);
				 	break;
				 	
			 case 5 : 
				
				 
				 System.out.println("──────────────────────────────────────────────────");
					System.out.println("아이템 목록입니다.\n");			 	
				 	for(int i =0; i <Item.length; i++) {
				 		System.out.print("▶");
				 		System.out.println((i+1) + "  번     " + Item[i].name +"  (" + Item[i].money + "머니)");}
					
				 	System.out.println("구매를 원하는 아이템의 번호를 입력해주세요.");
				 	input = sc.nextInt();
				 	user.market(m,Item,input,user);
				 	
				 	break;
				 	
				 	
				 	
			 case 6 :
				 	user.Userinfo(Item);
				 	break;
			 }
			}
	}		
}
