package T210930;

import java.util.Scanner;

public class RectangleArrayDefinition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열의 선언 방법 1
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		//2. 방법 2
		int array3[][] = new int[3][4];
		int array4[][];
		array4 = new int[3][4];
		
		//3. 방법 3
		int[] array5[] = new int[3][4];
		int[] array6[];
		array6 = new int[3][4];
		
		//4. 다양한 배열 선언 (기본자료형 배열, 참조자료형 배열)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int [2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6];   //참조자료형 배열
		
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap=0,i;
		
		for(i=0;i<=3;i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
			aa[i] = s.nextInt();
			hap += aa[i];
		}
		System.out.printf("합계==> %d \n", hap);
	}

}
