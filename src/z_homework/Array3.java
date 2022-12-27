package z_homework;

import java.util.Random;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		
		// 가위 바위 보를 입력하세요 : 보
		// 게이머 : 보
		// 인공지능 컴퓨터 : 바위
		// 결과: 게이머 승리 !
		
					
			Scanner sc = new Scanner(System.in);
			Random rnd = new Random();
			System.out.print("가위 바위 보를 입력하세요. :");
			
			String pI = sc.nextLine(); 

			int npI = 0;
			switch(pI) {
			case "가위": 
				npI = 0;
				break;
			case "바위":
				npI = 1;
				break;
			case "보":
				npI =2;
				break;
			}
			String[] rps = {"가위", "바위", "보"};
			int rndI = rnd.nextInt(rps.length);

			System.out.println("게이머 : "+ pI);

			System.out.println("인공지능 : "+ rps[rndI]);

			if( npI == 0&& rndI == 1) System.out.println("인공지능 승리");
			else if(npI == 0 && rndI == 2) System.out.println("게이머 승리");
			else if(npI == 1 && rndI == 0) System.out.println("게이머 승리");
			else if(npI == 1 && rndI == 2) System.out.println("인공지능 승리");
			else if(npI == 2 && rndI == 0) System.out.println("인공지능 승리");
			else if(npI == 2 && rndI == 1) System.out.println("게이머 승리");
			else System.out.println("비겼습니다.");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int com=2;
//	    int gamer=0;
//	    String result="";            //게임결과를 저장할 변수
//	   
//	    if(com == gamer) {
//	    result="비김";
//	    } else {
//	    if(com == 0) {            // 컴퓨터가 가위일경우
//	    if(gamer == 1) result="사람 승";
//	    else result="컴퓨터 승";
//	    }
//	    else if(com == 1) {      // 컴퓨터가 바위일경우
//	    if(gamer==0) result="컴퓨터 승";
//	    else result="사람 승";
//	    }
//	    else{          // 컴퓨터가 보자기 일경우
//	    if(gamer==0) result="사람 승";
//	    else result="컴퓨터 승";
//	    }
//	 } 
//	     
//	    System.out.println("사람="+rsp[gamer]);
//	    System.out.println("컴퓨터="+rsp[com]);
//	    System.out.println(result);
//		
		
		
		
		
	}

}
