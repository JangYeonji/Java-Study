package T211008;

class SimplePair<T>{
	private T a;
	private T b;
	public SimplePair(T a, T b) {
		this.a = a;
		this.b = b;
	}
	public T getFirst() {
		return a;
	}
	public T getSecond() {
		return b;
	}
	public void setFirst(T a) {
		this.a = a;
	}
	public void setSecond(T b) {
		this.b = b;
	}
}

public class SimplePairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePair<String> pair = new SimplePair<String>("apple","tomato");
		SimplePair<Integer> count = new SimplePair<Integer>(10,12);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		System.out.println(count.getFirst());
		System.out.println(count.getSecond());

	}

}

