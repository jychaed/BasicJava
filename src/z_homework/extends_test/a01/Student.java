package z_homework.extends_test.a01;

public class Student extends Human { // 학생은 사람이다 // 사람중에는 학생이 있다.
	private String major;
	
	public Student(String name, int age, String major) {
//		super.name = name;
//		super.age = age;
		// Human의 name, age 변수가 private 로 선언되어있으므로 직접 접근 불가
		// 그러니가 게터세터를 사용해서 해야한다.
		super.setName(name);
		super.setAge(age);
		this.major =major;
	}
	
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return super.toString() + ", 전공 : " + major;
	}
	
	
		
}
