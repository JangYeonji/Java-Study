package T211004;

public class EffectOfPrimaryDataArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
	}

	private static int twice(int i) {
		// TODO Auto-generated method stub
		i=i*2;
		return i;
	}

}
