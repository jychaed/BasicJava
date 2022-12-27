package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B_Array {

	public static void main(String[] args) {
		/* 배열
		 * - 여러개의 값을 하나의 볂수에 저장해서 사용하는 것이다.
		 * - 참조형 타입니다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다. //처음에 선언하면
		 * */

		int[] intArray; // 1)))) 배열의 주소를 저장할 공간이 만들어진다.
		intArray = new int[5]; //배열이 선언되고 그 주소가 저장된다. --선언하고 초기화x
		// []가 int 5개가 저장되는 배열?
		System.out.println(intArray[0]);
		// 배열의 순서는 0부터 시작이다. --이건 1번째 int를 출력해라
		/* 타입별 기본갑
		 * char : '\u0000'
		 * byte, short, int : 0
		 * long : 0L
		 * float : 0f
		 * double : 0.0
		 * boolean : false (0)
		 * 참조형변수(String) : null  ("" x, 공백이 들어가는거 x)
		 * */

		intArray = new int[] {1, 2, 3, 4}; // 2)))) {}값으로 배열의 길이를 알려줌 [4]
		// 배열을 만들때는  new int[] <- 이게 있어야해 //같은줄 아닐때 저렇게
		int a = 0;
		int[] intArray2 = {1, 2, 3}; // 3)))) 같은 줄일때는 선언과 초기화를 동시에
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		intArray2[1] = 4; // 내가 [1]를 4로 바꿨음
		System.out.println(intArray2[1]); // 그래서 이거 4나옴!
		
		//1))
//      int[] array = {10, 20, 30, 40, 50}; //[]이거 안넣으면 {}이거가 밑줄생겨
		
		//2))
		int[] array;
		array = new int[] {10, 20, 30, 40, 50};
		
		//3))
		array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		// 나타내는 방법은 3가지!
		// a1 + a2 + a3 + a4 +a5
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		
		// 예제 1:  10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr;
		arr = new int[10];
		// int[] arr = new int[10]; 같은것
		
		// 예제 2: 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해 주세요.
		Random rnd = new Random();
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = rnd.nextInt(100) + 1 ;
		}//int i는 0번째부터 i의 길이는 하나씩 늘어난다.
		System.out.println(Arrays.toString(arr));
		// for 배열 횟수를 알때
		
		// 예제 3 : 배열에 저장된 모든 값을 합계와 평균을 구해주세요
//		int sum1 = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum1 += arr[i];
//		}
//		System.out.println("모든 값의 합계" + sum1);
//		System.out.println("모든 값의 평균" + sum1/arr.length);
//		// 평균할때 나누기를 갯수를 안다고 숫자로 하지말고 배열변수.length이걸로!
		
		int sum1 = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		avg = (sum1 * 1.0) / arr.length;
		avg = (double) sum / arr.length; //위랑 같은 것  // sum을 형변환
		System.out.println("총점 :" + sum1);
		System.out.println("평균 :" + avg);
		
		
		// 예제 4 : 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i]; 
			if(min > arr[i]) min = arr[i];
		}
			
		System.out.println("최소값" + min);
		System.out.println("최대값" + max);
		
		
		
		
		// 배열의 값을 섞는 방법  // 다시 질문하기 20220711 16:09
		String[] class404 = {
				"홍길동", "이순신", "유관순", "김유신", "아이유"
		}; // []이거 배열표시 안하면 오류!
		System.out.println(Arrays.toString(class404));
		
		for(int i = 0; i < 500; i++) { // 500번 돌리는 문장 만들기
			int rndI = rnd.nextInt(class404.length); //랜덤 숫자뽑느데 그 
			// 숫자는 배열의 갯수만큼 뽑겠어요  5 -> 0~4(class404.length)
			String tmp = class404[0]; // [0]을 임시저장으로 보내
			class404[0] = class404[rndI]; //[rndI]을 처음 빈 자리에 넣어줘
			class404[rndI] = tmp; // 그럼 임시저장 보낸걸 [rndI] 여기에 넣어
			System.out.println(Arrays.toString(class404));
			
		}
		// shuffle
		
		// 1~10 사이의 랜덤값을 500번 생성하고, //횟수아니까 for
		// 각 숫자가 생성된 횟수를 출력해주세요
		int[] counter = new int[10]; //1~10 사이의 랜덤 10가지
		// {0,0,0,0,0,0,0,0,0,0}
		for(int i = 0; i < 500; i++) {
			int r = rnd.nextInt(10) + 1; //rnd.nextInt(10) -> 0~9 ////nextInt(10) + 1; -> 1~10
//			if(r == 1) {
//				counter[0] ++ ; // 한번 나왔으니 ++
//			}
//			if(r == 2) {
//				counter[1] ++ ; // 두번째 자리를 ++
//			}
//			if(r == 3) {
//				counter[2] ++ ; // 세번째 자리를 ++
//			}
			counter[r-1] ++ ;
		}
		System.out.println(Arrays.toString(counter));
		for(int i = 0; i < counter.length; i++ ) {
			System.out.println(i + 1 + ":" + counter[i]); //i번째 자리는 i가 카운트
		}
		
		
		
		
		// 예제 5 : 21~50 사이의 랜덤 값을 650번 생성하고,
		///// 21 ~ 50 => 1~30 => 0~29
		// 각 숫자가 생성 된 횟수를 출력해주세요.
		
		int[] count = new int[30]; //30 종류를 카운팅하겠다.
		// {0,0,0,0,0,0....30개}
		for(int i = 0 ; i < 650; i++) {//첫번째부터 650번 반복
			int r = rnd.nextInt(30) + 1 + 20; //랜덤 숫자를 r로 받는다.// 0~29 => 1~30 => 21~50
//			if(r == 21) {
//				counter[0] ++;
//			}
//			if(r == 22) {
//				counter[1] ++;
//			}
//			if(r == 23) {
//				counter[2] ++;
//			}
			count[r - 21] ++ ;
		}
		sum = 0;
		for(int i = 0; i < count.length; i++) {
			System.out.println(i + 21 + ":" + count[i]);
			sum += count[i];
		}
		
		System.out.println(sum);
		
		// 규칙을 발견해야합니다 틀을 만들어야해
		System.out.println("=============");
		
		
		// 예제 6 : 위 문제에서 최솟값, 최댓값, 반복횟수를
		// 각각 입력받아 각 숫자가 생성된 횟수를 출력해 주세요  //입력받아면 scanner 그리고 integer
		Scanner sc = new Scanner(System.in); // 일단 입력 받아야해
		System.out.println("최솟값을 입력해주세요"); // 입력해주세요
		int mini = Integer.parseInt(sc.nextLine()); //최소 변수 정하고 입력받은거 읽어오기
		System.out.println("최댓값을 입력해주세요");
		int maxi = Integer.parseInt(sc.nextLine());
		System.out.println("반복횟수를 입력해주세요");
		int cnt = Integer.parseInt(sc.nextLine());
		
		counter = new int[(maxi-mini)+1];
		for(int i = 0 ; i < cnt; i++) {
			int r = rnd.nextInt((maxi-mini)+1) + mini;
			counter[r - mini] ++ ;
		}
		sum = 0;
		for(int i = 0; i < counter.length; i++) {
			System.out.println(i + mini + ":" + counter[i]);
			sum += counter[i];
		}
		
		System.out.println(sum);
		
		
		
	}

}



