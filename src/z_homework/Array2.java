package z_homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또번호를 생성하는 프로그램을 작성하시오.
		// (로또 번호는 1 ~ 45번까지 있으며 
		// 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
	
		Random rnd = new Random();
		int [] arr = new int [6];

		// 수학적 기법(가설)
		int nCnt = 0; 
		for(;true;) {    // 중복된 값이 몇번 발생할 지 모르니깡 무한 반복
			
			int ranNum = rnd.nextInt(45) + 1;
			boolean isIn = false;  // 같은  값이 없다고 가정  , 이렇게 사용된 것들은 refactoring 
		
			//실제로 같은게 있는지 찾아보는 거징
			for(int i=0; i<arr.length; i++) {  // arr.length를 nCnt로 바꿔보는 거 생각해 보깅
				if(arr[i] == ranNum) {  // 나중에 else 넣고 생각해 보깅
					isIn = true;
					break;        // 같은 게 있으니까 반복문을 끝내버령
				}
			}
			
			
			//같은 게 있었다면 isIn은 true, 없으면 false
			if(!isIn) {          // 같은게 없으니깡
				arr[nCnt] = ranNum;  // 배열에 집어넣기
				nCnt++;
			}
			
			if(nCnt == 6) {        // 무한 반복을 빠져 나갈 조건이 필요, 6개 다 채웠음.
				break;    //무한 반복 끝내깅    
			}
			
		}
		
		
		/*
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(45) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			 for(int j = i+1; j < arr.length; i++) {
				 
			 }
		}
		*/
		System.out.println(Arrays.toString(arr));
		
		// 현재 중복제거 못함 
		
		
//		do {
//			num3 = rnd.nextInt(9) +1;
//		}while(num3 == num1 || num3 == num2);  //중복검사 끝
//				


	}

}