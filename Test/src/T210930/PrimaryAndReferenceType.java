package T210930;

public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 기본자료형의 대입연산 (stack 값 복사). call by value
		int value1= 3;
		int value2= value1;
		value2=7;
		System.out.println(value1);
		System.out.println(value2);
		
		//2. 참조자료형의 대입연산 (stack 값 복사). call by reference
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array2[0]=7;
		System.out.println(array1[0]);
		System.out.println(array2[0]);
	}

}
