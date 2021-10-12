package T211008;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> b = new Box<String>();
		b.set("Hello World!");
		String s = b.get();
		System.out.println(b.get());
	}

}
