package T211008;

class Box2{
	private Object data;
	public void set(Object data) {
		this.data = data;
	}
	public Object get() {
		return data;
	}
}

public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2 b = new Box2();
		b.set("Hello World");
		String s = (String)b.get();
		b.set(new Integer(10));
		Integer i = (Integer)b.get();
		System.out.println(b.get());
	}

}
