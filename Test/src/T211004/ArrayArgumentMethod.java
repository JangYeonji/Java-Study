package T211004;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});
	}


	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
	}
}
