package goldfish_simulation;

import java.util.*;

public class Item {


	//아이템 구성
//		사료[2] - 교체사료, 데친시금치    // food[2] - solidfood, vegetable
//		게임세트[1] - 축구게임세트 	  // game[1] - soccergame
//		어항꾸미기 [5] - 수초, 히터, 산소발생기, 조명 led7 //tank[5] - plant, heater, oxygen, led7



	
	String name ;	 //아이템 이름
	int num; 		 //보유갯수
	int health ;	 //건강
	int love;		 //애정도
	int money;       //차감머니
	int level;
	

	
		 //아이템에 수치들 연결하기 //인덱스 0번~ 10까지 들어가는 배열
		 Item (String name, int num,  int health, int love, int money) {
		 this.name = name;   //아이템 이름 
   		 this.num = num;
		 this.health += health;
		 this.love += love;
		 this.money += money;
		 }
		 
		
}

