package z_homework;

import java.util.Arrays;
import java.util.Random;

public class JavaBisicMiddleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 6명의 이름을 저장할 수 있는 변수 names를 선언 및 생성하고, 주변 친구들의 이름으로 초기화한다. (5점)
		String[] names = {"김범수", "나얼", "박효신", "이수", "신용재", "하현우"};
		
//		2. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언 및 생성하고, 국어, 영어, 수학, 사회, 과학, Java, Oracle로 초기화한다. (5점)
		String[] subjects = {"Oracle", "JavaBasic", "JavaHigh", "WebBasic"
							, "Python", "JSP", "Spring"};
		
//		3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성한다. (5점)
//		(단, names와 subjects의 길이를 이용한다.)
		int[][] score = new int[names.length][subjects.length];
		
//		4. score의 모든 요소에 50~100 사이의 임의의 값(정수)을 저장한다. (5점)
		score[0][0] = new Random().nextInt(51) + 50; // Oracle
		score[0][1] = new Random().nextInt(51) + 50; // JavaBasic
		score[0][2] = new Random().nextInt(51) + 50; // JavaHigh
		score[0][3] = new Random().nextInt(51) + 50; // WebBasic
		score[0][4] = new Random().nextInt(51) + 50; // Python
		score[0][5] = new Random().nextInt(51) + 50; // JSP
		score[0][6] = new Random().nextInt(51) + 50; // Spring
		
		for(int i = 0; i < subjects.length; i++) {
			score[1][i] = new Random().nextInt(51) + 50;
		}
		
		for(int i = 2; i < names.length; i++) {
			for(int j = 0; j < subjects.length; j++) {
				score[i][j] = new Random().nextInt(51) + 50;
			}
		}
		for(int i = 0; i < score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
		System.out.println("4. score의 모든 요소에 50~100 사이의 임의의 값(정수)을 저장한다.");
		
//		5. 학생별 합계를 저장할 수 있는 변수 nameSum을 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		int[] nameSum = new int[names.length];
		
//		6. nameSum의 요소에 훈련생별 합계를 저장한다. (5점)
		nameSum[0] = 0;	
		nameSum[0] += score[0][0];
		nameSum[0] += score[0][1];
		nameSum[0] += score[0][2];
		nameSum[0] += score[0][3];
		nameSum[0] += score[0][4];
		nameSum[0] += score[0][5];
		nameSum[0] += score[0][6];
		
		for(int i = 0; i < subjects.length; i++) {
			nameSum[1] += score[1][i];
		}
		
		
		for(int i = 2; i < names.length; i++) {
			for(int j = 0; j < subjects.length; j++) {
				nameSum[i] += score[i][j];
			}
		}
		System.out.println(Arrays.toString(nameSum));
		System.out.println("6. nameSum의 요소에 훈련생별 합계를 저장한다.");
		
//		7. 학생별 평균(실수)을 저장할 수 있는 변수 nameAvg를 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		double[] nameAvg = new double[names.length];
		
		
//		8. nameAvg의 요소에 학생별 평균(실수)을 저장한다. (5점)
//		(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
		nameAvg[0] = nameSum[0] * 1.0 / subjects.length;
		nameAvg[0] = (double) nameSum[0] / subjects.length;
		// 87.33333333333
		nameAvg[0] *= 100;
		// 8733.333333333
		nameAvg[0] = Math.round(nameAvg[0]);
		// 8733.0
		nameAvg[0] /= 100;
		// 87.33
		
		for(int i = 1; i < names.length; i++) {
			nameAvg[i] = nameSum[i] * 1.0 / subjects.length;
			nameAvg[i] *= 100;
			nameAvg[i] = Math.round(nameAvg[i]);
			nameAvg[i] /= 100;
		}
		System.out.println(Arrays.toString(nameAvg));
		System.out.println("8. nameAvg의 요소에 학생별 평균(실수)을 저장한다.");
		
//		9. 과목별 합계를 저장할 수 있는 변수 subSum을 선언 및 생성한다. (5점)
//		(단, subjects의 길이를 이용한다.)
		int[] subSum = new int[subjects.length];
		
//		10. subSum의 요소에 과목별 합계를 저장한다. (5점)
		subSum[0] = 0;
		subSum[0] += score[0][0];
		subSum[0] += score[1][0];
		subSum[0] += score[2][0];
		subSum[0] += score[3][0];
		subSum[0] += score[4][0];
		subSum[0] += score[5][0];
		
		for(int i = 0; i < names.length; i++) {
			subSum[1] += score[i][1];
		}
		
		for(int i = 2; i < subjects.length; i++) {
			for(int j = 0; j < names.length; j++) {
				subSum[i] += score[j][i];
			}
		}
		System.out.println(Arrays.toString(subSum));
		System.out.println("10. subSum의 요소에 과목별 합계를 저장한다. ");
		
//		11. 과목별 평균(실수)을 저장할 수 있는 변수 subAvg를 선언 및 생성한다. (5점)
//		(단, subjects의 길이를 이용한다.)
		double[] subAvg = new double[subjects.length];
		
//		12. subAvg의 요소에 과목별 평균(실수)을 저장한다. (5점)
//		(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
		subAvg[0] = 0.0;
		subAvg[0] = subSum[0] * 1.0 / names.length;
		// 87.654321
		subAvg[0] *= 100;
		// 8765.4321
//		subAvg[0] = Math.round(subAvg[0]);
		subAvg[0] = subAvg[0] + 0.5;
		// 8765.9321
		subAvg[0] = (int)subAvg[0];
		// 8765.0
		subAvg[0] /= 100;
		// 87.65
		
		for(int i = 1; i < subjects.length; i++) {
			subAvg[i] = subSum[i] * 1.0 / names.length;
//			subAvg[i] *= 100;
			subAvg[i] = Math.round(subAvg[i] * 100) / 100.0;
//			subAvg[i] /= 100;
		}
		System.out.println(Arrays.toString(subAvg));
		System.out.println("12. subAvg의 요소에 과목별 평균(실수)을 저장한다.");
		
//		13. 학생별 석차를 저장할 수 있는 변수 rank를 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		int[] rank = new int[names.length];
		rank[0] = 0;
		rank[0] = 1;
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		
//		14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다. (15점)
		rank[0] = 1;
		if(nameSum[0] < nameSum[1]) {
			rank[0] += 1;
		}
		if(nameSum[0] < nameSum[2]) {
			rank[0] += 1;
		}
		if(nameSum[0] < nameSum[3]) {
			rank[0] += 1;
		}
		if(nameSum[0] < nameSum[4]) {
			rank[0] += 1;
		}
		if(nameSum[0] < nameSum[5]) {
			rank[0] += 1;
		}
		
		rank[1] = 1;
		for(int i = 0; i < names.length; i++) {
			if(nameSum[1] < nameSum[i]) {
				rank[1] += 1;
			}
		}
		
		for(int i = 2; i < names.length; i++) {
			for(int j = 0; j < names.length; j++) {
				if(nameSum[i] < nameSum[j]) {
					rank[i]++; //위에서 0이랑 1이랑 해줬으니까 ㄱㄱ
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		System.out.println("14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다.");
		System.out.println("");
		
		
//		15. 위에서 생성된 변수들을 이용하여 아래와 같이 출력한다.(구분선 제외) (20점)
//		====================================================================================
//				| 국어	영어		수학		사회		과학		Java	Oracle	| 합계	평균		석차
//		--------┼-------------------------------------------------------┼-------------------
//		김범수	| 95	55		73		64		53		68		96		| 504	72.0	4
//		나얼		| 74	81		97		64		59		89		74		| 538	76.86	1
//		박효신	| 80	50		55		51		63		82		85		| 466	66.57	6
//		이수		| 99	59		84		99		55		68		72		| 536	76.57	2
//		신용재	| 51	82		53		76		91		64		93		| 510	72.86	3
//		하현우	| 84	67		73		79		55		61		73		| 492	70.29	5
//		--------┼-------------------------------------------------------┼-------------------
//		합계		| 483	394		435		433		376		432		493		|
//		평균		| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//		====================================================================================
		System.out.println("====================================================================================");
		for(int i = 0; i < subjects.length; i++) {
			System.out.print("\t");
			System.out.print(subjects[i]);
		}
		System.out.print("\t합계\t평균\t석차");
		System.out.println();
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			
			for(int j = 0; j < subjects.length; j++) {
				System.out.print("\t" + score[i][j]);
			}
			System.out.print("\t" + nameSum[i]);
			System.out.print("\t" + nameAvg[i]);
			System.out.print("\t" + rank[i]);
			
			System.out.println();
		}
		System.out.print("합계");
//		for(int i = 0; i < subjects.length; i++) {
//			System.out.print("\t" + subSum[i]);
//		}
		for(int item : subSum) {
			System.out.print("\t" + item);
		}
		System.out.println();
		System.out.print("평균");
//		for(int i = 0; i < subjects.length; i++) {
//			System.out.print("\t" + subAvg[i]);
//		}
		// 향상된 for문
		int idx = 0;
		for(double item : subAvg) {
			System.out.print("\t" + item);
			idx++;
		}
		for(String item : names) {
			
		}
		System.out.println();
		
		System.out.println("====================================================================================");
		
		
		
		
//		(optional. 15번까지 완성했다면, 도전해보세요.)
//		16. 15번을 출력한 뒤 사용자에게 학생을 추가할 것인지 물어보고 (y/n)
//		사용자가 학생 추가를 원한다면 학생의 이름을 입력받아 학생의 일곱 과목 점수를 랜덤으로 부여합니다.
//		학생을 계속 입력할 것 인지 물어보고(y/n). 계속 입력을 받거나 중단합니다.
//		새로 추가된 학생의 점수를 포함하여 계산된 총 출력을 다시 보여줍니다.
		
//		17. 위 16번 이후 사용자에게 과목을 추가할 것인지 물어보고 (y/n)
//		사용자가 과목 추가를 원한다면 과목의 이름을 입력받아 과목을 추가하고 학생들의 점수는 랜덤 부여합니다.
//		새로 추가된 과목의 점수를 포함하여 계산된 총 출력을 다시 보여줍니다.
		
//		본 내용을 모두 선택하여 복사하여 붙여넣고 각 문제 아래에 코드를 작성합니다.
//		문제 풀이 완료 후 소스코드 전체를 복사하여 tablet7823@gmail.com 으로 메일 본문에 붙여넣어 보내주세요.
//		메일 제목은 '[초급자바 레벨테스트] 202207 이름'으로 합니다.
//		본문 아래에 건의사항이나 요청사항, 도움사항 등 내용을 작성하셔도 좋습니다.
//		7월 첫 달 고생하셨습니다.

	}

}
