package z_homework;

import java.util.Scanner;

public class Iffor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						
		int x = 9;
		String y= "";
		switch(x) {
		case 3:
		case 4:
		case 5:
			y = "봄";
			break;
		case 6:
		case 7:
		case 8:
			y = "여름";
			break;
		case 9:
		case 10:
		case 11:
			y = "가을";
			break;
		case 12:
		case 1:
		case 2:
			y = "겨울";
			break;
			
		}
		System.out.println(x + "월은" + y +"입니다.");
		
		
	}

}
