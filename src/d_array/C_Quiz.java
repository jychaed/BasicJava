package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문제1 
		 * 거스름돈(1000~5000원)이 동전의 단위마다 몇 개의 
		 * 동전이 필요한지 출력해주세요
		 * 
		 * 예시)
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 * */
		// 1의 단위가 나오지 않게 하는 것이 관건
//		Random rnd = new Random();
//		// 1000~5000 => 100~500 * 10 =>( 0 ~ 400 + 100) * 10
//		int change = (rnd.nextInt(400)+100)*10; //1의 자리가 안나오게 하려고
//		
//		int[] coin = {500, 100, 50, 10};
// 		예를들어서 4680원
//		int tmp = change / 500;
//		change %= 500; /
//		tmp =change / 100;
//		change %= 100;
//		tmp =change / 50;
//		change %= 50;
//		tmp =change / 10;
//		change %= 10;
		
//		System.out.println("거스름돈 " + change +"원");
//		for(int i = 0; i < coin.length; i++) {
//			int tmp = change / coin[i];
//			change %= coin[i];
//			System.out.println(coin[i] + "원:" + tmp + "개");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] money = new int[4001];
//		
//		for(int i = 1; i<= 1; i++) {
//			 int r = new Random().nextInt((i+1)*1000)+(1*1000); //0~3999 => 1 ~ 4000 => 1000 ~ 5000
//			 money[r - 1] ++;
//			 System.out.println("거스름돈 :" + r + "원");
//		   } 
//		//100 ~ 500=> *10
//		int a500, b100, c50, d10 ;
//		a500 = money/500;
		
		
		
		/* 문제2 
		 * 1~5의 숫자가 발생(10번)된 만큼 *을 사용해 그래프를 그려주세요
		 * 
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2
		 * 4 : *** 5
		 * 5 : * 1
		 * */ // 1~5까지 랜덤 10번 해서
		
		//랜덤한 숫자가 필요하겠다
//		Random rnd = new Random(); 
		
//		rnd.nextInt(5); => 0~4
//		rnd.nextInt(5)+1; => 1~5		
		
//		int[] arr = new int [5];
//		// {0,0,0,0,0} => [0]=1 [1]=2 [2]=3 [3]=4 [4]=5
//		for(int i = 1; i<= 10; i++) { // i=0; i<10
//			int r = rnd.nextInt(5)+1;//카운팅을 해야해요 배열 5개 1~5인 숫자를 랜덤으로 돌린다.r=랜덤숫자
//			arr[r - 1] ++; //카운팅하는거  r==1 > [0] =1번 / r==2 [1]=1번
//			System.out.println(r + ":" + Arrays.toString(arr));
//		}
//			System.out.println(Arrays.toString(arr));
		// 별을 찍어야해
		// 숫자부터
//		System.out.print(1 + " : ");
//		for(int i = 0; i < arr[0]; i++) { //배열에 첫번째에 값이있다
//			System.out.print("*"); // 그만큼 별을 찍어줘라
//		}
//		System.out.println(" " + arr[0]); // 그값은 이거였어
//		
//		
//		System.out.print(2 + " : ");
//		for(int i = 0; i < arr[1]; i++) { 
//			System.out.print("*"); 
//		}
//		System.out.println(" " + arr[1]); 
//		
//
//		System.out.print(3 + " : ");
//		for(int i = 0; i < arr[2]; i++) { 
//			System.out.print("*"); 
//		}
//		System.out.println(" " + arr[2]); 
		
//		for(int j = 0; j < arr.length; j++) {
//		System.out.print((j + 1) + " : ");
//		for(int i = 0; i < arr[j]; i++) { 
//			System.out.print("*"); 
//		}
//		System.out.println(" " + arr[j]); 
//		}
//		
		
		/* 문제3 
		 * 1~10 사이의 랜덤한 값이 10개 저장된 배열에서
		 * 중복된 값이 제거된 배열을 만들어 주세요.
		 * 
		 * [1,3,3,2,1,5,6,6,7,5]
		 * [1,3,2,5,6,7]
		 * */
		
//		Random rnd = new Random(); 
		
//		rnd.nextInt(9); => 0~9
//		rnd.nextInt(9)+1; => 1~10		

		// 1~10 사이의 랜덤한 값이 10개 저장된 배열
//		int[] pool = new int [10];		
//		for(int i = 0; i < pool.length; i++) {
//			pool[i] = rnd.nextInt(10)+1;			
//		}
//		System.out.println(Arrays.toString(pool));
		
//		int[] pool = new int [10];		
//		for(int i = 0; i < pool.length; i++) {
//			pool[i] = rnd.nextInt(10)+1;			
//		}
//		System.out.println(Arrays.toString(pool));
		
//		// 배열은 길이를 변경할 수 없다.
//		int[] a = new int[] {pool[0]};
//		// pool == {1,2,2,2,2,2,2,2,2,2} 숫자를 넣어줘보니 
//		// a == {1,2}
//		// {0,0,0,0,0} 배열의 길이를 바꾸는 방법은 초기화 시키는 것 뿐
//	
//		for(int i = 1; i <pool.length; i++) {
////			a[0] = pool[i];	
//			int pick = pool[i]; // pick에 임시저장
//			boolean duple =false; //중복검사하는구나
//			
//			for(int j = 0; j < a.length; j++) {
//				if(pick == a[j]) {
//					duple= true; // 같은게 있으면 중복이다.
//				}
//			}
//			if(duple == false) {
//				int[] b = new int[a.length + 1]; //배열을 덢어 써야겠다
//				for(int j = 0; j < a.length; j++) {
//					b[j] = a[j]; // 새로만든 배열에 기존 배열 값을 넣어주고
//				}
//				b[b.length -1] = pick; // 맨 마지막 번째 자리에 지금뽑은 번호를 넣어라
//				a = b;// b배열을 a로 넣어줍니다
//			}
//			
//		}
//		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		/*문제 4 (숙제) 
		 * 1~100까지의 랜덤한 숫자 100개를 갖는 배열을 만들고
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만
		 * 이루어진 배열을 정렬하여 출력해주세요
		 * 
		 * [1, 57,84,38,15,10,57,68,48,13, ...]
		 * target = 5;
		 * [5, 10, 20, 80]
		 * 게시물 특정조건에 뽑아서 하는 배열로....
		 * */
		//1~100까지의 랜덤한 숫자 100개를 갖는 배열을 만들고
		Random rnd = new Random();
		int[] pool = new int [100];		
		for(int i = 0; i < pool.length; i++) {
			pool[i] = rnd.nextInt(100)+1;			
		}
		System.out.println(Arrays.toString(pool));
		
		//2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만
		int[] tmp = new int[100]; // 임시배열 100개를 만들었어 // 그값을 하나하나 넣어보는
		int target = rnd.nextInt(4)+2; // 0,1,2,3 => 2,3,4,5
		System.out.println("target:" + target);
		
		int count = 0; //하나 지정하고
		for(int i = 0; i < pool.length; i++) {
			if(pool[i] % target == 0) {
			// pool 에서 하나식 꺼내 target으로 나눈 나머지가 0인지 확인한다	
				tmp[count++] = pool[i];
				// 나머지가 0이라면(참이라면) 임시저장배열(tmp)에 하나씩 넣고
				// 몇개가 들어가 있는지 count한다.
				
//				System.out.println(Arrays.toString(tmp));//길이가 결국 count
			
			}
		}
		System.out.println(Arrays.toString(tmp));
		// 뒤에 00000 엄청 많이 나옴
		
		int[] result = new int[count];
		//임시저장배열(tmp)의 길이만큼 새로운 배열을 생성한다.
		for(int i= 0; i < count; i++) {
			result[i] = tmp[i];
		}
		System.out.println(Arrays.toString(result));
		// 뒤에 00000 잘라냄
		
		
		//자 이제 정렬을 해야하는데
		//오늘 배운다 20220713
	
		
		
		
		
		
	}

}
