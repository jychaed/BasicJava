package z_homework.jh;

public class Student {
	 /*
	    *  1. 필드에 맴버 변수 선언     클래스 안에서는 선언만 가능 !  메서드 제외 
	    */
	   String name; // 학생 이름
	   String gender; // 학생 성별
	   int grade; // 학생 몇학년인지 확인 
	   double height; // 학생 키 
	   int age; // 학생 나이 
	   
	   /*
	    * 4. 외부클래스에서 가져온 인스턴스 
	    */
	   Subject s = new Subject();  // 외부클래스에서  가져온 과목클래스 인스턴스 학생클래스에서 생성 
	                               // 이럴 경우  인스턴스 s의 맴벼변수 값을 직접적으로 바꿀 수는 없고
	                               // 클래스 메서드에서는 맴버변수값을 가져오거나 바꿀 수 있다
	   
	    //s.name = 10;   사용불가 
	   
	   public void show() {  // 위의 인스턴스 s를 이용한 경우
	      s.name = "홍길동";  //  Student 가 가지고있는 과목 인스턴스 s의 값 변경 
	      System.out.println(this.s.name);  // 출력도 가능 
	   }
	   
	   
	   /*
	    *  2. 생성자 만들기 
	    */
	   
	   public Student() {   //  디폴트 생성자 (기본 생성자)
	      
	   }
	   

	   Student(String name, String gender, int grade){ // 매개변수를 받는 생성자 
	      this.name = name;                           // 만약에 기본 디폴트 생성자 즉, 
	      this.gender = gender;                       //  매개변수를 받지 않는 생성자를 만들지 않고 만들면 
	      this.grade = grade;                         //  이걸로만 인스턴스 생성이 가능하다 
	   }
	   
	   
	   /*
	    * 3. 클래스 메서드 만들기  
	    *    클래스 안에서 메서드를 만들게 되면 
	    *    1. main에서 인스턴스를 생성 후  사용할 수 있다.
	    *    2. 반환형을 사용하게 되면 return 을 해야된다 
	    *      ex1>
	    *        pubic int show() {
	    *           return ( 정수 )
	    *      }
	    *        반환형이 int 라 return을 int형인 자료를 반환해야함 
	    *        
	    *       ex2> 
	    *        public Student(Student a){    // 매게변수를 int 형 a를 받고 반환형은 Student
	    *            
	    *             return (Student 인스턴스)
	    *        }
	    *        
	    */
	   
	    public int  getAge() {
	       
	       return this.age;
	    }

	    public Student changeAge(Student a) {
	      a.age = 10;
	      return a;
	       
	    }
	    
	   @Override
	   public String toString() {
	      return "Student [name=" + name + ", gender=" + gender + ", grade=" + grade + ", height=" + height + ", age="
	            + age + "]";
	   }

}
