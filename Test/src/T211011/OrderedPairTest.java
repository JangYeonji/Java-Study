package T211011;

class OrderedPair<T, S>{
	private T key;
	private S value;
	public OrderedPair(T key, S value){
		this.key = key;
		this.value = value;
	}
	public T getKey() {
		return key;
	}
	public S getValue() {
		return value;
	}
}
public class OrderedPairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("mykey", 12345678);
		OrderedPair<String, String> p2 = new OrderedPair<String, String>("java","a programming language");
		
		System.out.println(p1.getKey() + " " + p1.getValue());
		System.out.println(p2.getKey() + " " + p2.getValue());
	}

}
