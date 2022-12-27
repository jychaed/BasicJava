package z_homework;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 배열에서 최댓값과 최솟값을 구하시오.
		// {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		int max = array [0];
		int min = array [0];
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) max = array[i];
			if(min > array[i]) min = array[i];
			
		}
		System.out.println("최댓값:" + max);
		System.out.println("최솟값:" + min);
		

	}

}
