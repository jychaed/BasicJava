package e_oop.student;

public class StudentAccess {
	private int kor, eng, math, sum;
	private double avg;
	private String name;
	// 국어점수 입력할 때 총점이 알아서 입력이 되고 평균도 알아서 되면 좋겠
	// 그래서 바로 앞에 private 붙어요
	
	public void setKor(int kor) {// 사용자 기준으로 넣어준다? set
		// 로그인 체크 로직
		this.kor = kor; // kor 접근할 수 있는 걸 만들어줌
		this.sum = this.kor + this.eng +this.math;
		// 이런거 웹개발할때 위에 로그인 체크 로직 확인후 열어준 구조
		
	}
	
	public int getKor() { // 특정한 변수의 값을 가져온다.//
		return this.kor;
	}// 게터세터..? 세트로 봐요?

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		calsSum();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		calsSum();////// 이걸 추가함!
	}

	private void calsSum() {/////// 이걸 했고
		this.sum = this.kor + this.eng +this.math;/////
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentAccess [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg
				+ ", name=" + name + "]"; // shitt + alt+  s => 제너레이트 투 스트링...
	}
	
	// 필드에 커서 놓고 shitt + alt+  s -- 제너레이터 게터 앤 세터
	// 아웃라인 없어진거 다시 살릴때 outline
	


}
