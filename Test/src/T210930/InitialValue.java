package T210930;

import java.util.Arrays;

public class InitialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1;
		int[] value2;
		int value3=0;
		int[] value4 = null;
		//System.out.println(value1);
		//System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		boolean[] array1 = new boolean[3];
		for(int i=0;i<3;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		int[] array2 = new int[3];
		for(int i=0;i<3;i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		double[] array3 = new double[3];
		for(int i=0;i<3;i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		String[] array4 = new String[3];
		for(int i=0;i<3;i++) {
			System.out.print(array4[i]+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}

}
