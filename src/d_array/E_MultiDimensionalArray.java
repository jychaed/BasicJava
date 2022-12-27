package d_array;

import java.util.Arrays;
import java.util.Random;

public class E_MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어있는 형태이다. 
		 * 
		 * */ 
		// 2차원배열
		int[][] array2; //배열안에 배열이 있다 int배열을 가짐 차원이2개
		// 3차원배열 //존재는 한다... 근데 거의 사용 안함
		int [][][] array3;
		int [][][][] array4;
		
		int [][] arr = new int [2][3]; // 이렇게만 쓰자!!
		// 2칸짜리 배열 각 칸마다 3칸짜리 배열이 생성된다.
		int arr2[][] = new int [][] {{1,2},{3,4}}; // 허용하나 쓰지마...되긴하는데 ㄴㄴ
		int[] arr3[] = {{1,2}
						,{3,4}
						,{5,6}}; // 허용하나 쓰지마..
		
		int [][] arr4 = new int [3][]; //가변배열이다 
		// 배열은 참조형 변수이다.
		// 참조형 변수의 특징은 null을 넣을 수 있다.
		// 배열을 선연을 미리해놓으면 기본값으로 초기화된다.
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[5];
		// 배열만 선언하고 그 길이는 나중에 선언해준다.
		
		//2차원 인덱스까지 접근해서 사용할 수 있다.
		System.out.println(arr4[0][0]); // arr4는 배열이 3개가 있어요 //몇돈 몇호 느낌으로
		System.out.println(arr4[2][3]); 
		
//		arr4[0] = 10; //값을 저장할 수 없다(이렇게 넣을 수가 없어요)
		arr4[0] = new int[10]; // 배열을 저장해야한다. (배열을 10개 만들었다 호실이 10개다)
		arr4[1][1] = 10;
		
		//길이 구해야지
		System.out.println(arr4.length); //2차원 배열에서 첫번째(1차원) 배열의 길이
		System.out.println(arr4[0].length); // 2차원 배열에서 두번째(2차원) 배열의 길이

		// 이걸 어떻게 돌리냐~
		for (int i =0; i <arr.length; i++) {
			for(int j =0; j < arr.length; j++) {
				System.out.println(arr[i][j]); //동도 한바퀴 호도 한바퀴 돌려 그래야 안다!
			}
		}
		
		int[][] score = new int [3][5]; //int[학생수][과목수]
		int [] sum = new int [score.length]; //학생들 개개인의 점수의 합계/ int [3] 길이
		// sum은 학생별로 총점이 필요하므로 학생수로 배열을 만들어줌
		double[] avg = new double[score.length]; //평균
		// = score[0][0] 0번째 학생의 0번째 점수는? 규칙성을 발견!
		
		score [0][0] = new Random().nextInt(101);
		score [0][1] = new Random().nextInt(101);
		score [0][2] = new Random().nextInt(101);
		score [0][3] = new Random().nextInt(101);
		score [0][4] = new Random().nextInt(101);
		
		score [1][0] = new Random().nextInt(101);
		score [1][1] = new Random().nextInt(101);
		score [1][2] = new Random().nextInt(101);
		score [1][3] = new Random().nextInt(101);
		score [1][4] = new Random().nextInt(101);
		
		
		for(int i = 0; i <score.length; i++) {
			for(int j = 0; j < score[i].length; j++) { //학생수? 길이?
				score[i][j] = new Random().nextInt(101);
			}
			System.out.println(Arrays.toString(score[i]));
		}
		
		// 문제
		// 각 학생의 점수 합계와 평균을 구하시오
		
//		sum[0] = score [0][0] + score [0][1] 
//				+ score [0][2] + score [0][3] + score [0][4] ;		
//		avg[0] = sum [0] / 5.0;
//		
//		sum[1] = score [1][0] + score [1][1] 
//				+ score [1][2] + score [1][3] + score [1][4] ;		
//		avg[1] = sum [1] / 5.0;
//		
//		sum[2] = score [2][0] + score [2][1] 
//				+ score [2][2] + score [2][3] + score [2][4] ;		
//		avg[2] = sum [2] / 5.0;
//		
//		sum[3] = score [3][0] + score [3][1] 
//				+ score [3][2] + score [3][3] + score [3][4] ;		
//		avg[3] = sum [3] / 5.0;
//		
//		sum[4] = score [4][0] + score [4][1] 
//				+ score [4][2] + score [4][3] + score [4][4] ;		
//		avg[4] = sum [4] / 5.0;
//		
//		
//		for(int i= 0; i < score[0].length; i++) {
//			sum[0] += score [0][i];
//		}
//		for(int i= 0; i < score[1].length; i++) {
//			sum[1] += score [1][i];
//		}
//		for(int i= 0; i < score[2].length; i++) {
//			sum[2] += score [2][i];
//		}
//		for(int i= 0; i < score[3].length; i++) {
//			sum[3] += score [3][i];
//		}
//		for(int i= 0; i < score[4].length; i++) {
//			sum[4] += score [4][i];
//		}
//		for(int i = 0; i < score[0].length; i++) {
//			sum[0] += score[0][i];
//		}
		
		
		for(int j = 0; j < score.length; j++) {
			for(int i = 0; i < score[j].length; i++) {
				sum[j] += score[j][i];
			}
			System.out.println("총점 : " + sum[j] 
					+ ", 평균 : " + (sum[j] / 5.0));
			
				
			
		}
		
		
		
		
	}

}
