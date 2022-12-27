package z_homework.jh0730;

public class TestA {
	  int a  = 5 ;

	TestA() {
		System.out.println("TestA()");
	} // 기본생성자 // 나중에 public 안써도
	 
	TestA(int a) {
		this.a = a;
		System.out.println("TestA(int a)");
	}
	 
	public void methodA() {
		System.out.println("A");
	}
	 
}
 