package z_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A0712 {

	public static void main(String[] args) {
		// 문제1
		// 다음 배열에서 최댓값과 최솟값을 구하시오.
		// {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		
		int[] arr1 = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = arr1[0], min = arr1[0]; //임의로 넣음 [0] 아무자리수나
		// 전부봐야ㅕ 큰걸 찾을 수있겠다
		for(int i = 0; i < arr1.length; i++) {//i 인덱스가 0~9까지 진행
			if(arr1[i] > max){
				max = arr1[i]; 
			}
			if(arr1[i] < min) {
				min = arr1[i];
			}
//			System.out.println("최댓값:" + max + ",최솟값:" + min);
			// 첫바퀴[0] ~ 마지막바퀴[9] 돌아야한다. 
//			최댓값:38,최솟값:38 [0]
//			최댓값:94,최솟값:38 [1]
//			최댓값:94,최솟값:16 [2]
//			최댓값:94,최솟값:3 [3]
//			최댓값:94,최솟값:3 [4]
//			최댓값:94,최솟값:3 [5]
//			최댓값:94,최솟값:3 [6]
//			최댓값:94,최솟값:3 [7]
//			최댓값:94,최솟값:3 [8]
//			최댓값:94,최솟값:3 [9]
		}
		
		
		
		
		
		
		
		
		
		
		// 문제2
		// 로또번호를 생성하는 프로그램을 작성하시오.
		// (로또 번호는 1 ~ 45번까지 있으며 
		// 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
	    // 배열을 만들고 중복 제거하고 출력
		int[] lottoPool = new int[45]; // 0~44까지 배열이 만들어짐
		
		for (int i = 0; i < lottoPool.length; i++) {
			lottoPool[i] = i+1;
		}
		// lottoPool index : 0 ~ 44 -> 1 ~ 44
	    for(int i = 0; i < 1000; i++) {
	    	int r = new Random().nextInt(44) + 1; //nextInt(44) 0~44무작위나옴	    	
	    	int tmp = lottoPool[0];
	    	lottoPool[0] = lottoPool[r];
	    	lottoPool[r] = tmp;
//	    	System.out.println(i + "회차 : " +
//	    			  		   Arrays.toString(lottoPool));
	    }
	    //6개만 보여준다
	    for(int i = 0; i < 6; i++) {
	    	if( i > 0 ) {
//	    		System.out.print(", ");
	    	}
//	    	System.out.print(lottoPool[i]);
	    }
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // 문제3
	    // 인공지능 컴퓨터와 게이머(사람)가 
	    // 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		
	 	// 가위 바위 보를 입력하세요 : 보
	 	// 게이머 : 보
	 	// 인공지능 컴퓨터 : 바위
	 	// 결과: 게이머 승리 !
	    
	    // 게이머가 입력을 해야하죠 입력은 받아야하는 거니 스캐너 ㄱ
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("가위바위보를 입력하세요");
//	    String input = sc.nextLine(); //가위, 바위, 보, etc
	    // 가위바위보를 하려면 상대가 내는게 랜덤이여야해요
	    // 자유롭게 입력해야하니 가위바위보라는 
//	    String[] pool = { "가위", "바위", "보"}; //가위바위보를 배열에 넣을꺼야 [0] [1] [2]
//	    String com = pool[new Random().nextInt(pool.length)];  
	    //여기서 랜덤 배열이 들어갈꺼야 가위[0] 바위[1] 보[2] 중에서
	    // 랜덤한 배열을 뽑았을때 가운데로 넣는 거지
	    
//	    if(intpot.eauals("가위")) {
//	    	
//	    }else if(intpot.eauals("바위")) {
//	    	
//	    }else if(intpot.eauals("보"){
//	    	
//	    }else {
//	    	System.out.println("잘못입력하였습니다.");
//	    }
		//우선 이렇게 씀
//	    System.out.println("게이머 :" + input);
//	    System.out.println("컴퓨터 :" + com);
		
//	    if(input.equals(com)) {
//	    	System.out.println("비겼습니다.");
//	    
//	    	
//	    }else if(input.equals("가위")) { //1
//	    	if(com.equals("바위")) {
//	    		System.out.println("컴퓨터 승리!");
//	    	}else {
//	    		System.out.println("게이머 승리!");
//	    	
//	    }
//		}else if(input.equals("바위")) { //2
//			if(com.equals("보")) {
//				System.out.println("컴퓨터 승리!");
//			}else {
//				System.out.println("게이머 승리!");
//			
//		}
//		}else if(input.equals("보")) { //3
//			if(com.equals("가위")) {
//				System.out.println("컴퓨터 승리!");
//			}else {
//				System.out.println("게이머 승리!");
//			}
//		}else {
//				System.out.println("잘못입력하였습니다.");
//			}
//	    
	    
	    
	    
	    
	    
	    
//	    {
//	    	if(com.equals("바위")) {
//	    		System.out.println("컴퓨터 승리!");
//	    	}else {
//	    		System.out.println("게이머 승리!");
//	    	
//	    }else if(input.equals("바위") {
//	    	System.out.println("컴퓨터 승리!");
//	    }else if(input.equals("보"){
//	    	System.out.println("게이머 승리!");
//	    }else {
//	    	System.out.println("잘못입력하였습니다.");
//	    }
		
	    
	    
	    
	    
	    
	    
	    
	 // 문제 4   
	 // 주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 
	 // 주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 
	 // 난수 발생기(Random 객체)가 대신한다. 
	 // 난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 
	 // 확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
	 // 아래 그림과 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.
	 // 면   빈도
	 // 1  1700
	 // 2  1658
	 // 3  1600
	 // 4  1704
	 // 5  1673
	 // 6  1665
	    
	 // 주사위 나오는 수
	 int[] dice = new int[6]; //배열은 6개다
	 // 난수발생기 10000번 호출
	 for(int i = 1; i<= 10000; i++) {
		 int r = new Random().nextInt(6)+1; //1~6 => 0 ~ 5+1
		 dice[r - 1] ++; // 배열이 0~5니까 r은 1~6 빼줘야지	 
	 }
	 System.out.println("------------------");
	 System.out.println("면\t빈도");
	 System.out.println("------------------");
	 // 1~6까지 for
	 for(int i = 0; i < dice.length; i++) {
		 System.out.println((i + 1) + "\t" + dice[i]);
	 }	 

	 
	    
	    
	    
	    
	    
	    
		
	}

}
