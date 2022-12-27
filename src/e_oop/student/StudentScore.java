package e_oop.student;

public class StudentScore {
	private int oracle, javaBasic, webBasic, javaHigh, jsp, spring, python;
	private String name;
	private int sum;
	private double avg;
	private int rank;
	
	// 초기값을 정하지 않으면 사용할 수 없다.
	//// 값을 입력하지 않으면 객체를 생성할 수 없게끔
	private StudentScore() {} 
	// 
	public StudentScore(int oracle, int javaBasic, int webBasic, int javaHigh, int jsp, int spring, int python,
			String name) {
		
		this.oracle = oracle;
		this.javaBasic = javaBasic;
		this.webBasic = webBasic;
		this.javaHigh = javaHigh;
		this.jsp = jsp;
		this.spring = spring;
		this.python = python;
		this.name = name;
		this.sum = oracle + javaBasic + webBasic +javaHigh + jsp + spring + python;
		this.avg = sum / 7.0 ; //소숫점 위해 0.0
		this.rank = 1; // 다른사람 점수 모르니가 내가 1등이야
	}
	
	public int[] getSubjectScore() {
		int[] result = new int[7];
		
		result[0] = this.oracle;
		result[1] = this.javaBasic;
		result[2] = this.webBasic;
		result[3] = this.javaHigh;
		result[4] = this.jsp;
		result[5] = this.spring;
		result[6] = this.python;
		
		return result;
	}
	
	public int getOracle() {
		return oracle;
	}
	public int getJavaBasic() {
		return javaBasic;
	}
	public int getWebBasic() {
		return webBasic;
	}
	public int getJavaHigh() {
		return javaHigh;
	}
	public int getJsp() {
		return jsp;
	}
	public int getSpring() {
		return spring;
	}
	public int getPython() {
		return python;
	}
	public String getName() {
		return name;
	}
	// 성적은 한번 입력되면 변경할 수 ㅇ없어서 이렇게만 게터세터로만 가능!
	// 내 사용 범위안에서만 만들기
	// 점수를 알기 위한 get
	public int getSum() { 
		return sum;
	}
	// 랭크를 알기위한 get
	public int getRank() {
		return rank;
	}
	// 랭크값을 입력해줘야해서 set 정의
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
//		String result = "";
//		result += name;
//		result += oracle;
//		
//		System.out.printf("", oracle);
		String result = String.format("%8s%5d%5d%5d%5d%5d%5d%5d%5d\t%.2f\t%2d"
						, name, oracle, javaBasic, webBasic, javaHigh, jsp, spring, python
						, sum, avg, rank);
		return result;
		 	
		
	}
	
	
	
	
}
