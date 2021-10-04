package T211004;

public class InternalCallMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);
	}
	private static double sum(int a, double d) {
		// TODO Auto-generated method stub
		return a+d;
	}
	public static void print() {
		System.out.println("안녕");
	}
	public static int twice(int k) {
		return k*2;
	}

}
