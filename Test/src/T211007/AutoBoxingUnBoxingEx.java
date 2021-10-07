package T211007;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Integer intObject = n;   //auto boxing. 기본형 -> Wrapper
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10;   //auto unboxing. Wrapper -> 기본형
		System.out.println("m = "+ m);
	}

}
