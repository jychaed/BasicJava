package h_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListScoreBook {//0802

	public static void main(String[] args) {

		/*
		 홍길동 및 이순신, 김유신, 유관순, 사임당, 아이유 총 여섯 명의 
		 국어/수학/영어/과학/코딩 점수를 각각 70~100까지의 랜덤 값으로 
		 입력하고,학생별 평균, 과목별 평균, 전체 평균을 구하고 출력합니다.


		=================== 원점수 ===================
		학생명	국어 수학	 영어	 과학	 코딩
		홍길동	74	  91	  86	  97	  72	
		이순신	82	  77	  72	  97	  89	
		김유신	92	  81	  85	  97	 100	
		유관순	87	  76	 100	  90	  81	
		사임당	99	  88	  88	  99	  94	
		아이유	79	  92	  98	  77	  77	
		==============================================
		
		====================== 평균점수 =================================
		학생명  국어   수학	   영어	   과학    코딩	  합계   평균 	석차
		홍길동	 74		91		86		97		72					
		이순신	 82		77		72		97		89					
		김유신	 92		81		85		97		100					
		유관순	 87		76	   100		90		81					
		사임당	 99		88		88		99		94					
		아이유	 79		92		98		77		77					
		과목합계
		과목평균	
		=================================================================

		 * */
		
		List<List<Object>> scoreBook = new ArrayList<>(); // 이름과 점수가 섞여이쓰니까 
		// 안에는 한줄의 행을
		// 밖은 한줄한줄 한줄을 합한거
		//scoreBook 에는 List<Object> 이형태가 들어가죠
		List<Object> unitScore = new ArrayList<>(); 
		// 스트링과 인티저가 공통인게 오브젝트
		// 한줄을 만들자
		
		unitScore.add("홍길동"); //이름
		unitScore.add(new Random().nextInt(31) + 70); // 국어
		unitScore.add(new Random().nextInt(31) + 70); // 수학
		unitScore.add(new Random().nextInt(31) + 70); // 영어
		unitScore.add(new Random().nextInt(31) + 70); // 과학
		unitScore.add(new Random().nextInt(31) + 70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore); // + @123
		
//		unitScore.clear();// 이거하면 홍길동 지워지고 김유신 2개됨 //@123 을 클리어!
		unitScore = new ArrayList<Object>();
		unitScore.add("김유신"); //이름
		unitScore.add(new Random().nextInt(31) + 70); // 국어
		unitScore.add(new Random().nextInt(31) + 70); // 수학
		unitScore.add(new Random().nextInt(31) + 70); // 영어
		unitScore.add(new Random().nextInt(31) + 70); // 과학
		unitScore.add(new Random().nextInt(31) + 70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore); //+ @123 X -> @456
		//scoreBook =[ @123, @123] X (=clear) -> [ @123, @456]
//		System.out.println(scoreBook);
		
		unitScore = new ArrayList<Object>();
		unitScore.add("이순신"); //이름
		unitScore.add(new Random().nextInt(31) + 70); // 국어
		unitScore.add(new Random().nextInt(31) + 70); // 수학
		unitScore.add(new Random().nextInt(31) + 70); // 영어
		unitScore.add(new Random().nextInt(31) + 70); // 과학
		unitScore.add(new Random().nextInt(31) + 70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore); 
		
		unitScore = new ArrayList<Object>();
		unitScore.add("유관순"); //이름
		unitScore.add(new Random().nextInt(31) + 70); // 국어
		unitScore.add(new Random().nextInt(31) + 70); // 수학
		unitScore.add(new Random().nextInt(31) + 70); // 영어
		unitScore.add(new Random().nextInt(31) + 70); // 과학
		unitScore.add(new Random().nextInt(31) + 70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore); 
		
		unitScore = new ArrayList<Object>();
		unitScore.add("사임당"); //이름
		unitScore.add(new Random().nextInt(31) + 70); // 국어
		unitScore.add(new Random().nextInt(31) + 70); // 수학
		unitScore.add(new Random().nextInt(31) + 70); // 영어
		unitScore.add(new Random().nextInt(31) + 70); // 과학
		unitScore.add(new Random().nextInt(31) + 70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore); 
		
		unitScore = new ArrayList<Object>();
		unitScore.add("아이유"); //이름
		unitScore.add(new Random().nextInt(31) + 70); // 국어
		unitScore.add(new Random().nextInt(31) + 70); // 수학
		unitScore.add(new Random().nextInt(31) + 70); // 영어
		unitScore.add(new Random().nextInt(31) + 70); // 과학
		unitScore.add(new Random().nextInt(31) + 70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore); 
		
		System.out.println(scoreBook);
		
		for(List<Object> item :  scoreBook) {
			int sum = 0;
			double avg = 0;
			for(int i = 1; i < item.size(); i++ ) {
				sum += Integer.parseInt(item.get(i).toString());
			}
			avg =(int)(sum * 100.0) / (item.size() * 100.0);
			item.add(sum);
			item.add(avg);
		}
		System.out.println(scoreBook);
		
		
		
		
		
		
//		System.out.println("=================== 원점수 ===================");
//		System.out.print("학생명\t국어\t수학\t영어\t과학\t코딩\t합계\t평균\n");
//		
//		List<List<Integer>> subject = new ArrayList<>();
//		subject.add(new Random().nextInt(31) + 70);
//		for(int i = 0; i < 5; i++) {
//			subject.add(i, new Random().nextInt(31) + 70); // add를 잘 사용하는지 확인
//		}
//		System.out.println(subject);
		
		
		
		
		
		
		
	}

}
