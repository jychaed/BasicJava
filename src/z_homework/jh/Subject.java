package z_homework.jh;

public class Subject {
	int score;
	   String name;
	   
	   
	   public Subject() {
	      this.score = 0;
	      this.name ="수학";
	            
	   }
	   
	   Subject(String name){
	      this.name = name;
	   }

	   @Override
	   public String toString() {
	      return "Subject [Score=" + score + ", name=" + name + "]";
	   }
	   
	   
	   public void showSubject() {
	      
	      System.out.println(this.score + "  " + this.name);
	   }
}
