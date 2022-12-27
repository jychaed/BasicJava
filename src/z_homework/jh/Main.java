package z_homework.jh;

public class Main {
	 public static void main(String[] args) {
		    
	      /*
	       * 5.
	       *  과목 클래스 인스턴스를 가진 Student 클래스의 인스턴스를 main에서 만들었을 경우
	       *  
	       */
	      
	      Student hum = new Student("허나훔","남자", 5);  // Student 인스턴스 생성시 
	                                                      // "허나홈"이라는 인스턴스는 
	                                                     //  Subject 클래스 인스턴스 subject를 하나 
	                                                     // 만들고 나옴 
	      System.out.println(hum.s.name);  // 따라서 hum 이라는 인스턴스 안에 
	                                       // 과목클래스로 만든  s라는 인스턴스를 사용 가능 
	      
	 }

}
