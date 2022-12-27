package z_homework;

import java.util.Random;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 
		// 주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 
		// 난수 발생기(Random 객체)가 대신한다. 
		// 난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 
		// 확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
		// 아래 그림과 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.
		// 면   빈도
		// 1  1700
		// 2  1658
		// 3  1600
		// 4  1704
		// 5  1673
		// 6  1665
		

		System.out.println("<주사위 확률 이론>");

		int rndi = 0; 
		int[] rdice = new int[6];
		
		Random rnd = new Random();

		for(int i=0; i<10000;i++) {
			rndi=rnd.nextInt(6)+1;
			rdice[rndi-1]++;
		}
		System.out.println("-----------------");
		System.out.println("면                 빈도");
		System.out.println("-----------------");
		for (int i = 0; i < rdice.length;i++) {
			System.out.println((i+1)+"\t"+rdice[i]);
		}
		
		

	}

}
