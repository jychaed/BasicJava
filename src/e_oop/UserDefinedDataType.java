package e_oop;

public class UserDefinedDataType { 

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (변수 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다. 
		 * */
		//이름 점수 뿐 아니라 행위도 메서드로 저장가능
		
		// 1차형 데이터 관리
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		// 2차형 데이터 관리
		int[]socre; // kor, eng, math
		int sum2;
		double avg2;
		String name2;			
		
		
		Student student;
		student = new Student();
		
		student.name ="홍길동";
		student.kor = 90;
		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student);
	}
	
}

// 3차형 데이터 관리
class Student { // ()넣으면 메서드니 넣지마! 클래스로 해야해!
	int kor, eng, math, sum;
	double avg;
	String name;
	
	@Override
	public String toString() {
		return "학생 [kor=" + kor + ", eng=" + eng 
				+ ", math=" + math + ", sum=" + sum 
				+ ", avg=" + avg + ", name=" + name + "]";
	}
	
//	// @override / toString 재정의한다. =부모클래스의 메소드 재정의
//	public String toString() { //overrides java.lang.Object.toString
//		return "주소값"; 
//		// 모든 클래스 안에서는 toString이라는 메서드가 있다
//	}

	// Art + Stift + s 제너래이트 투 스트링
}








