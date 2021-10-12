package T211011;

public class GenericEx1 {
	T[] v;
	public void set(T[] n) {
		v = n;
	}
	public void print() {
		for (T s : v)
			System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GenericEx1();
	}

}
