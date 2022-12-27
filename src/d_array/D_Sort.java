package d_array;

import java.util.Arrays;
import java.util.Random;

public class D_Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로
		 * 			 밀고 중간에 삽입하는 방식
		 * 
		 * */

		
		int [] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Random().nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// 버블정렬하는데 메소드를 만들고 ㄱㄱ
		// bubleSort(arr); // 버블정렬
		// insertSort(arr); //삽입정렬
		// selectSort(arr); //선택정렬
		// printRank(arr); //석차구하기
		// 정렬중 하나와 석차는 꼭 알아두자
		
		
	}

	private static void printRank(int[] arr) {
		// score = {5,3,4,1} //점수
		// rank = {1,3,2,4} //등수
		int[] rank = new int[arr.length]; // 서로 길이가 같으니까
		// 순위를 나타내기 위한 배열을 선언한
		//배열의 길이는 순위를 구하려는 배열의 길이와 같음
		for(int i = 0; i <arr.length; i++) {
			rank[i] = 1;
			// 순위를 나타내는 배열의 모든 값에 1을 입력함
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			// 순위를 구하려는 배열을 for문 작업함
			for(int j = 0; j <arr.length; j++) {
				// 다른 값들과의 비교를 위해 순위를 구하려는 배열을
				// 중첩 for문 작업함
				if(arr[i] < arr[j]) {
					rank[i]++; // 0번째랑 1번째를 비교해서 0이 높았어요 그럼 ?
					// arr = {50, 100, 80} i를 기준으로 보고 80이랑 비교
					// rank = {1, 1, 1} -> j가 돌면서 {2, 1, 1} ->j가 돌면서 {3, 1, 2}
					// 비교 대상과 다른애들을 비교해서 석차를 배부, 하나씩 생긴다는 개념
					// 나보다 잘하는 높은 놈이 있으면 등수가 계속 밀린다.
				}
			}
//			System.out.println(Arrays.toString(rank));
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i] + ":" + rank[i] + "등" ); //예쁘게 출력
		}
	}
	
	
	
	

	private static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;//0 아니고 i 를 준 이유는 이번에 교체할 자리수인데 특정자리수와 교환
			            //자리수 자체가 min이라는 의미
			//비교한 대상이 가장 작은 수라는 가정으로 매회전 시작
			for(int j = i + 1; j < arr.length; j++) { //변경대상은 뒤에있으니 뒤랑 비교해 // 2회차부터 이미 앞은 가장 작다고 가정
				//비교대상 다음 순서부터 끝 순서까지 비교대상과 크기를 비교함
				if(arr[j] < arr[min]) {//[min]은 숫자 아니고 자리를 의미합니다.
					// 만약 비교대상보다 특정위치의 값이 더 작다면
					min = j; // 가장 작은 값의 위치는 j위치다 (자리수를 비교해주고 값을 넣어주는것) 
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

	
	
	
	
	private static void insertSort(int[] arr) {////insertSort(arr); //삽입정렬
		// 반복 횟수만을 위한 for문
		// 반복 횟수는 배열의 길이 -1만큼으로 버블 정렬과 동일하나
		// 시작의 위치가 첫 번째(0) 위치가 아닌 두번째 (1)부터다.
		for(int i = 1; i < arr.length ; i++) { //i=0이면 -1// i=1이면 그냥0
			int tmp = arr[i];
			//비교 대상의 값을 임시저장한다.
			int j = 0; // int j를 for문 밖으로 꺼내서 사용하게 끔 ㄱㄱ
			for(j = i - 1 ; j >= 0; j--) {// 2번째부터 맨뒤부터 시작 그래서 거꾸로
				// 반복은 비교 대상 앞 번호부터 앞으로 하나씩 비교한다.(뒤에서 앞으로)
				if(tmp < arr[j]){ //임시저장한 값보다 현재 비교대상의 값이 크다면
					arr[j+1] = arr[j]; // 현재 비교대상의 값을 뒤로 한칸 밀고 비교를 계속한다.(뒤로 밀었어?)
				}else { //else상황이 발생한다면 (= 값의 교환이 없어지면 ) //없어도 정렬은 됩니다 단지 시간이 걸릴뿐
					break; // 해당 회전을 종료한다.(= 더이상 비교할 필요가 없다)
				}
			}
			arr[j + 1] = tmp; // j+1증가하고 비교대상이죠 비교대상이 바껴요
			// 값을 변경한 마지막 위치(값을 변경하지 않았다면 j의 마지막 번호)
			// 뒤에 복사한 값을 덮어씌운다.	
			System.out.println(Arrays.toString(arr));
		}
		
	}

	
	
	
	
	
	private static void bubleSort(int[] arr) {//// bubleSort(arr); // 버블정렬
		// method가 만들어졌다! 
		// 반복횟수만을 위한 for문, 반복횟수는 배열의 길이 -1만큼
		for(int i =0; i<arr.length-1; i++) {//arr.length-1 = 배열의 길이 -1만큼
			boolean changed =false;
			//자리를 바꿧는지 체크하기 위한 boolean 선언
			//이걸 왜 하냐면 버블정렬은 처음부터 끝까지하는데 한 회전도 교환을 하면 
			//다 정렬이 되었다
			
			for(int j = 0 ; j < arr.length - i -1 ; j++){
				//마지막자리 바로 앞까지 하겠다 (-1)
				// 맨뒤에 1개를 비교하지마라 (-i) // -i 안해도 -1 만해도 괜찮아요
				
				// 1회전씩 반복 될수록 큰숫자들이 맨뒤로 자리가 옮겨져 있으므로
				//맨 뒤에서 i횟수만큼의 숫자는 비교할 필요가 없음
				
				
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j]; //arr[j]의 값을 임시저장
					arr[j] = arr[j + 1]; // arr[j]에 arr[j=1] 값을 덮어씌움
					arr[j + 1] =tmp; //arr[j+1]dp 임시저장한 값을 덮어씌움
					changed =true;
					System.out.println(Arrays.toString(arr));
				}
			}
			
			System.out.println(Arrays.toString(arr));
			if (!changed){ // 교환이 일어나지 않았다면
				break; //반복을 종료해라
			}
		}
	
	}

}
