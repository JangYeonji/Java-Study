package T211008;

class Bag<T>{
	private T thing;
	public Bag(T thing) {
		this.thing = thing;
	}
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());   //getClass()와 getName()은 변수의 타입을 추출하는 메소드
	}
}
class Book{
	
}
class PencilCase{
	
}
class Notebook{
	
}
public class BagTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Book> bag = new Bag<>(new Book());   //<> 안에 Book 써줘도 되는데 생략한 것
		//Bag<Book> bag : 제네릭타입. Book을 포함하는 Bag 객체를 참조하는 변수
		//new Book() : Bag클래스의 인스턴스를 생성하면서 Book을 생성한 후 인자로 전달
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		Book book = bag.getThing();
		PencilCase pc = bag2.getThing();
		Notebook nb = bag3.getThing();
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		
	}

}
