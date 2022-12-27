package z_homework;

import java.util.Arrays;
import java.util.Random;

public class Homework0713 {

	public static void main(String[] args) {
		/*
		 홍길동 및 이순신, 김유신, 유관순, 사임당, 아이유 총 여섯 명의 
		 국어/수학/영어/과학/코딩 점수를 각각 70~100까지의 랜덤 값으로 
		 입력하고,학생별 평균, 과목별 평균, 전체 평균을 구하고 출력합니다.


		=================== 원점수 ===================
		학생명	국어	    수학	    영어	    과학	   코딩
		홍길동	74	  91	  86	  97	  72	
		이순신	82	  77	  72	  97	  89	
		김유신	92	  81	  85	  97	  100	
		유관순	87	  76	  100	  90	  81	
		사임당	99	  88	  88	  99	  94	
		아이유	79	  92	  98	  77	  77	
		==============================================
		
		====================== 평균점수 ======================
		학생명	국어		수학		영어		과학		코딩		평균
		홍길동	74		91		86		97		72		84.0	
		이순신	82		77		72		97		89		83.4	
		김유신	92		81		85		97		100		91.0	
		유관순	87		76		100		90		81		86.8	
		사임당	99		88		88		99		94		93.6	
		아이유	79		92		98		77		77		84.6	
		평균		85.5	84.2    88.2	92.8	85.5	87.2	
		======================================================

		 * */

		// 이름과 과목의 배열을 만듦
		String [] name = {"홍길동","이순신","김유신","유관순","사임당","아이유"};
		String [] subject = {"국어", "수학", "영어", "과학", "코딩"};
//		System.out.println(Arrays.toString(name));
		
		// 각각의 랜덤값을 뽑아냄
//		Random rnd = new Random();
//		int r = rnd.nextInt(30)+51; //70~100까지의 랜덤 값
//		int kor = new Random().nextInt(30)+51; 
//		int math = new Random().nextInt(30)+51; 
//		int eng = new Random().nextInt(30)+51; 
//		int sci = new Random().nextInt(30)+51; 
//		int co = new Random().nextInt(30)+51; 
//		System.out.println(sci);
		
		int [][] score = new int[6][5]; //6명에 5과목
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j <score[i].length; j++) {
				score[i][j] = new Random().nextInt(30)+1+69; //31+70
			}
			System.out.print(name[i]);
//			System.out.println(Arrays.toString(score[i]));	
			System.out.println(Arrays.toString(score[i]) + "\t\t");
		}// 랜덤점수를 배열에 넣음
		
//		for(int j = 0; j< score.length; j++) {
//			for(int i = 0; i < score[j].length; i++) {
//				sum[j] += score[j][i];
//			
//			}
//		}
		
//		int [] sum = new int [score.length];
//		double[] avg = new double[score.length];
//		
//		for(int i= 0; i< score.length; i++ ) {
//			for(int j =0; j <score[i].length; j++) {
//				System.out.print(name[i]);
//				System.out.println(score[i][j]);
//				sum[i] += score[i][j];
//			}
//		} // 사람별 과목5개의 합
		
		
//		int [] sumsub = new int [5];
//		double[] avgsub = new double[5];
//		
//		for(int j = 0; j <score.length; j++) {
//			for(int i = 0; i <score[i].length; i++) {
//				System.out.print(name[i]);
//				System.out.print("\t" + score[j][i] + "\t" );
//				sumsub[i] += score[j][i];
//				avgsub[i] += sumsub[i]/score[i].length;
//			}
//		}
		
		int [] sum = new int [score.length];
		double[] avg = new double[score.length];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
				avg[i] = sum[i]/score[i].length;
		    }
		} //System.out.println("학생별 합계 : "+ Arrays.toString(sum));// 사람별 합계 
		  System.out.println("학생별 평균 : "+ Arrays.toString(avg)); // 사람별 합계의 평균
		
//		sum[0] = score [0][0] + score [0][1] 
//				+ score [0][2] + score [0][3] + score [0][4] ;		
//		avg[0] = sum [0] / 5.0; // 길동이의  5과목 합계와 평균
//		
//		sum[1] = score [1][0] + score [1][1] 
//				+ score [1][2] + score [1][3] + score [1][4] ;		
//		avg[1] = sum [1] / 5.0; // 순신이의  5과목 합계와 평균
//		
//		sum[2] = score [2][0] + score [2][1] 
//				+ score [2][2] + score [2][3] + score [2][4] ;		
//		avg[2] = sum [2] / 5.0; // 유신이의  5과목 합계와 평균
//		
//		sum[3] = score [3][0] + score [3][1] 
//				+ score [3][2] + score [3][3] + score [3][4] ;		
//		avg[3] = sum [3] / 5.0; // 관순이의  5과목 합계와 평균
//		
//		sum[4] = score [4][0] + score [4][1] 
//				+ score [4][2] + score [4][3] + score [4][4] ;		
//		avg[4] = sum [4] / 5.0; // 임당의 5과목 합계와 평균
//		
//		sum[5] = score [5][0] + score [5][1] 
//				+ score [5][2] + score [5][3] + score [5][4] ;		
//		avg[5] = sum [5] / 5.0; // 아이유의 5과목 합계와 평균
		
		
		int [] sumsub = new int [score.length-1];
		double[] avgsub = new double[score.length-1];
		
		for(int i = 0; i < score[i].length; i++) {
			for(int j = 0; j < score.length; j++) {
				sumsub[i] += score[j][i];
				avgsub[i] = sumsub[i]/score.length;
			}
		} System.out.println("과목별 합계 :" + Arrays.toString(sumsub)); //과목별 합계
          System.out.println("과목별 평균 :" + Arrays.toString(avgsub)); // 과목별 합계의 평균
		
//		sumsub[0] = score [0][0] + score [1][0] 
//				+ score [2][0] + score [3][0] + score [4][0] + score [5][0] ;	
          // i+ j고정
//		avgsub[0] = sumsub [0] / 6.0; // 국어의 6명 합계와 평균
//		
//		sumsub[1] = score [0][1] + score [1][1] 
//				+ score [2][1] + score [3][1] + score [4][1] + score [5][1] ;		
//		avgsub[1] = sumsub [1] / 6.0; // 수학의 6명 합계와 평균
//		
//		sumsub[2] = score [0][2] + score [1][2] 
//				+ score [2][2] + score [3][2] + score [4][2] + score [5][2] ;		
//		avgsub[2] = sumsub [2] / 6.0; // 영어의 6명 합계와 평균
//		
//		sumsub[3] = score [0][3] + score [1][3] 
//				+ score [2][3] + score [3][3] + score [4][3] + score [5][3] ;		
//		avgsub[3] = sumsub [3] / 6.0; // 과학의 6명 합계와 평균
//		
//		sumsub[4] = score [0][4] + score [1][4] 
//				+ score [2][4] + score [3][4] + score [4][4] + score [5][4] ;		
//		avgsub[4] = sumsub [4] / 6.0; // 코딩의 6명 합계와 평균
		
       
          System.out.println("=========================평 균 점 수=============================");
          System.out.print("학생명\t국어\t수학\t영어\t과학\t코딩\t합계\t평균\n");
          for(int i = 0; i <score.length; i++) {
        	  System.out.print(name[i]+"\t");
        	  for(int j=0; j < score[1].length; j++) {
        		  System.out.print(score[i][j]+"\t");
        	  }
        	  System.out.print(sum[i]+"\t");
        	  System.out.format("%.1f", avg[i]);
        	  System.out.println("");
          }
          System.out.println("===============================================================");
          System.out.print("합계\t");
          for(int i = 0 ;i < score[1].length; i++) {
        	  System.out.print(sumsub[i]+ "\t");
        	  
          }
          System.out.println("");
        		
          System.out.print("평균\t");
          for(int i = 0; i < score[1].length; i++) {
        	  System.out.print(avgsub[i]+ "\t");
        	  
          }
          
     
          
          
		
		
	}
}
