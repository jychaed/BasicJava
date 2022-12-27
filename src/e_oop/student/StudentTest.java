package e_oop.student;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// StudentScore 클래스를 이용하여
		// 우리반 (404호) 점수를 저장하는 StudentAccess[] scoreBook을 
		// 만든 뒤 출력해주세요
		// 단, 점수는 50~100점 사이입니다.
		/*
		 * 김범수 65 98 84 81 62 85 55 530 75.71 
		 * 나얼   52 79 88 55 54 76 56 460 65.71
		 * 박효신 74 87 69 70 54 92 62 508 72.57
		 * 이수   84 77 53 78 97 54 64 507 72.43
		 * 신용재 84 69 98 60 88 99 53 551 78.71
		 * 하현우 94 54 89 54 97 54 64 506 72.29
		  ..... 
		  */
		
		
		
//		 Scanner sc = new Scanner(System.in);
//		 StudentAccess name = new StudentAccess();
	
		 
         StudentScore[] score = new StudentScore[25];      
		 Random rnd = new Random();
		 
		 //new Stu 까지 치고 컨트롤 스페이스바하면 쫙
		 score[0] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "조은혁" );
		 score[1] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "허소영" );
		 score[2] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "인승주" );
		 score[3] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "배지영" );
		 score[4] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "남지현" );
		 score[5] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "배영호" );
		 score[6] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "정종은" );
		 score[7] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "최중호" );
		 score[8] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "전재한" );
		 score[9] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "김슬기" );
		 score[10] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "오지형" );
		 score[11] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "박민지" );
		 score[12] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "양지윤" );
		 score[13] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "조현수" );
		 score[14] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "윤영현" );
		 score[15] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "한상훈" );
		 score[16] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "김혜진" );
		 score[17] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "박형기" );
		 score[18] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "한단비" );
		 score[19] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "채진영" );
		 score[20] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "김진호" );
		 score[21] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "송서영" );
		 score[22] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "고재일" );
		 score[23] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "김보미" );
		 score[24] = new StudentScore (rnd.nextInt(51)+50, rnd.nextInt(51)+50,rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, rnd.nextInt(51)+50, rnd.nextInt(51)+50
				 , rnd.nextInt(51)+50, "허나훔" );
		 		 
//		 System.out.println(score[0]);
		
		 // 내점수 < 너의 점수 -> 내 순위는 += 1; 하나씩 더해지죠!
		 // 아래는 1대 1로 비교
		 if(score[0].getSum() < score[1].getSum()) {//score[0] 은혁님  / . 가지고 있는 / getSum 총점을 가져와서 비교하자
			 int r = score[0].getRank();
			 r += 1;
			 score[0].setRank(r);
		 }
		 // 아래는 1대 다로 비교
		 for(int i = 2; i < score.length; i++ ) {
			 if(score[0].getSum() < score[1].getSum()) {
			  int r = score[0].getRank();
			  r += 1;
			  score[0].setRank(r);
			 
		 }
	}	 
		 
		 for(int i = 1; i < score.length; i++ ) {
			 for(int j = 0; j < score.length; j++) {
				 if(score[i].getSum() < score[j].getSum()) {
					 score[i].setRank(score[i].getRank() + 1);
				 }
			 }
		 }
		 
		 int [] subjectSum = new int [7];
		 
		 for(int i=0; i < score.length; i++) {
			 // for문을 작성할 수 있도록 배열을 반환시켜주는 메소드를 이용한다.
			 int[] tmp = score[i].getSubjectScore();
			 for(int j = 0 ; j < tmp.length; j++) {
				 subjectSum[j] += tmp[j];  // 이건 이중for문을 돌릴수 있게 만들어 준 것
			 }
			// 각 전역변수를 가져와 값을 저장해야하므로 코드가 길어진다.		 
//			 subjectSum[0] += score[i].getOracle();
//			 subjectSum[1] += score[i].getJavaBasic();
//			 subjectSum[2] += score[i].getWebBasic();
//			 subjectSum[3] += score[i].getJavaHigh();
//			 subjectSum[4] += score[i].getJsp();
//			 subjectSum[5] += score[i].getSpring();
//			 subjectSum[6] += score[i].getPython();
		 }
		 
		 double[] subjectAvg = new double[7];
		 for(int i = 0; i < subjectSum.length; i++) {
			 subjectAvg[i] = (double) subjectSum[i] / score.length;
		 }
		 
		 for(int i = 0 ; i< score.length; i++) {
			 System.out.println(i + "\t" +score[i]); //.toString() 이걸 무조건!
		 }
		 
		 System.out.println(Arrays.toString(subjectSum));
		 System.out.println(Arrays.toString(subjectAvg));

		 
		 
		 
		 
	}

}
