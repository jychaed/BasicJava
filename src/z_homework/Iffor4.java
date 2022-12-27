package z_homework;

import java.util.Scanner;

public class Iffor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); //ctrl +space 해야 임포트 생성 스케너 사용가능
		
		String chul = "", young = "" , text = "";
		
		System.out.println("가위 바위 보 게임을 진행");
		
		System.out.println("철수 :");
		 chul = sc.nextLine();
		
		System.out.println("영희 :");
		 young = sc.nextLine();
		
		
		
		if(chul.equals(young)) {
			text = "비겼습니다";
		}else if(chul.equals("가위")) {
			text = young.equals("보")? "철수 승리!" : "영희 승리!"; 
		}else if(chul.equals("바위")) {
			text = young.equals("가위")? "철수 승리!" : "영희 승리!";
		}else if(chul.equals("보")) {
			text = young.equals("바위")? "철수 승리!" :"영희 승리!";
		}System.out.printf("결과: %s", text);
		
			
		
			
		
		
		
		
		/*
		 * if (chul.equals("가위") && young.equals("바위") || chul.equals("바위") &&
		 * young.equals("보")) || chul.equals("보") && young.equals("가위")) { winner =
		 * "영희"; System.out.println("결과:" + winner + "승리!"); } else
		 * System.out.println("결과 : 철수 승리!"); }
		 */
		/*
		 * if (chul.eqals("가위" && young.equals("바위") || chul.eqals("바위" &&
		 * young.equals("보") || chul.eqals("보" && young.equals("가위")) { winner = "영희";
		 * System.out.println("결과:" + winner + "승리!"); } else
		 * System.out.println("결과 : 철수 승리!");
		 */
		
		
	}

}
