package z_homework;

import java.util.Arrays;
import java.util.Random;

public class JavaBasicMiddleTest {

	public static void main(String[] args) {
//		1. 6명의 이름을 저장할 수 있는 변수 names를 선언 및 생성하고, 주변 친구들의 이름으로 초기화한다. (5점)
		String[] names = {"김진호", "송서영", "고재일", "허나훔", "김보미", "한단비"};

		
//		2. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언 및 생성하고, 국어, 영어, 수학, 사회, 과학, Java, Oracle로 초기화한다. (5점)
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Java", "Oracle"};
		
		
//		3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성한다. (5점)
//		(단, names와 subjects의 길이를 이용한다.)
//		int [][] score = new int[6][7];	
		int [][] score = new int[names.length][subjects.length];
		
		
		
//		4. score의 모든 요소에 50~100 사이의 임의의 값(정수)을 저장한다. (5점)
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j <score[i].length; j++) {
				score[i][j] = new Random().nextInt(50)+1+50;
			}
			System.out.println(Arrays.toString(score[i]));
		}
        
		
		
		
//		5. 학생별 합계를 저장할 수 있는 변수 nameSum을 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)		
		int [] nameSum = new int [score.length];
		
				
//		6. nameSum의 요소에 훈련생별 합계를 저장한다. (5점)	
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
		} System.out.println("학생별 합계 : "+ Arrays.toString(nameSum));
		
		
		
//		7. 학생별 평균(실수)을 저장할 수 있는 변수 nameAvg를 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		int [] nameAvg = new int [score.length];
		
		
//		8. nameAvg의 요소에 학생별 평균(실수)을 저장한다. (5점)
//		(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 표현한다.)
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				nameAvg[i] = nameSum[i]/(score[i].length);				
			}
		} System.out.println("학생별 평균 : "+ Arrays.toString(nameAvg));
		
		
		
//		9. 과목별 합계를 저장할 수 있는 변수 subSum을 선언 및 생성한다. (5점)
//		(단, subjects의 길이를 이용한다.)
		int [] subSum = new int [score.length];
		
//		10. subSum의 요소에 과목별 합계를 저장한다. (5점)
		for(int i = 0; i < score.length-1; i++) {
			for(int j = 0; j < score[i].length-1; j++) {
				subSum[i] += score[j][i];
			}
		} System.out.println("과목별 합계 : "+ Arrays.toString(subSum));
		
		
//		11. 과목별 평균(실수)을 저장할 수 있는 변수 subAvg를 선언 및 생성한다. (5점)
//		(단, subjects의 길이를 이용한다.)
		int [] subAvg = new int [score.length];
		
		
//		12. subAvg의 요소에 과목별 평균(실수)을 저장한다. (5점)
//		(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 표현한다.)
		for(int i = 0; i < score.length-1; i++) {
			for(int j = 0; j < score[i].length-1; j++) {
				subAvg[i] = nameSum[i]/score[i].length;				
			}
		} System.out.println("과목별 평균 : "+ Arrays.toString(subAvg));
		
		
		
//		13. 학생별 석차를 저장할 수 있는 변수 rank를 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		
		
//		14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다. (15점)
		
		
//		15. 위에서 생성된 변수들을 이용하여 아래와 같이 출력한다.(구분선 제외) (20점)
//  ======================================================================
//		| 국어	영어	수학	사회	과학	Java	Oracle	| 합계	평균	석차
//	----------┼------------------------------------------------------------------------┼------------------------------
//	김범수| 95	55	73	64	53	68	96	| 504	72.0	4
//	나얼	| 74	81	97	64	59	89	74	| 538	76.86	1
//	박효신| 80	50	55	51	63	82	85	| 466	66.57	6
//	이수	| 99	59	84	99	55	68	72	| 536	76.57	2
//	신용재| 51	82	53	76	91	64	93	| 510	72.86	3
//	하현우| 84	67	73	79	55	61	73	| 492	70.29	5
//	----------┼------------------------------------------------------------------------┼-------------------------------
//	합계	| 483	394	435	433	376	432	493	|
//	평균	| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//	=======================================================================
		
		System.out.println("=====================================================================================");
		System.out.println("\t국어\t영어\t수학\t사회\t과학\tJava\tOracle\t"+"합계\t평균\t석차");
		System.out.println("-------------------------------------------------------------------------------------");
		for(int i = 0; i< score.length; i++) {
			System.out.print(names[i]+"\t");
			for(int j =0; j <score[1].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(nameSum[i]+"\t");
     	    System.out.println(nameAvg[i]);
		}
		System.out.println("-------------------------------------------------------------------------------------");
		
		System.out.println("=====================================================================================");
		
		
		
	
		
		
		

	}

}
