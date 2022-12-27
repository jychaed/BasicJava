package z_homework.jh0730;

public class ClassTest {
	/*
	 *  class 의 종류 
	 *  
	 *  1. 일반클래스  
	 *   - 맴버변수 , 생성자 , 메서드 만든다 
	 *   
	 *  
	 *  2. 추상클레스 ( 미완성클래스)
	 *    - 멤보변수, 생성자 , 메서드, 추상메서드(abstract)
	 *    
	 *    
	 *    차이 :   1. 일반클래스로는 인스턴스를 만들수 있었다 -- 완성형 
	 *                추상클래스  미완성 클래스라 -- 인스턴스를 만들수 없다.
	 *  
	 *             2.  추상클래스 (abstract class)는 미완성 메서드 abstract method() 만들수 있다 
	 *             
	 */ 
	
	 public static void main(String[] args) {
		// TestA의 인스턴스화를 한다
		TestA a = new TestA();
		 a.methodA(); // a에 있는 methodA를 데려온다
		 System.out.println("----------");
		TestB b = new TestB();
		 System.out.println("----------");
		TestB b1 = new TestB(50,100);
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.bb);
		 System.out.println("----------");
		b.methodA();
		 b.methodB();
		 System.out.println("----------");
	}
}
