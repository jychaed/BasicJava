package e_oop.student;

import java.util.Random;

public class StudentTest2 {

	public static void main(String[] args) {
		StudentScore2[] score = new StudentScore2[5];
		Random rnd = new Random();
		
		score[0] = new StudentScore2 (rnd.nextInt(51)+50, rnd.nextInt(51)+50
				   , rnd.nextInt(51)+50, "가나다");
		score[1] = new StudentScore2 (rnd.nextInt(51)+50, rnd.nextInt(51)+50
			       , rnd.nextInt(51)+50, "라마바");
		score[2] = new StudentScore2 (rnd.nextInt(51)+50, rnd.nextInt(51)+50
				   , rnd.nextInt(51)+50, "사아자");
		score[3] = new StudentScore2 (rnd.nextInt(51)+50, rnd.nextInt(51)+50
				   , rnd.nextInt(51)+50, "차카타");
		score[4] = new StudentScore2 (rnd.nextInt(51)+50, rnd.nextInt(51)+50
				   , rnd.nextInt(51)+50, "파하가");
		
	}

}
