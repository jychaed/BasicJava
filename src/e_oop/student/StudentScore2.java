package e_oop.student;

public class StudentScore2 {
	// 사람은 5명// 과목은 3개//  모두의 합계 순위 평균을 고고
	/* 이름   국 영 수 합 평 순
	 * 가나다 65 98 84  
	 * 라마바 52 79 88 
	 * 사아자 74 87 69 
	 * 차카타 84 77 53 
	 * 파하가 84 69 98 
	 * */
	private int kor, eng, math;
	private String name;
	private int sum;
	private double avg;
	private int rank;
	
	private StudentScore2() {} 
	
	public StudentScore2(int kor, int eng, int math, String name) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = sum / 3.0;
		this.rank = 1;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getName() {
		return name;
	}

	public int getSum() {
		return sum;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
	
}
