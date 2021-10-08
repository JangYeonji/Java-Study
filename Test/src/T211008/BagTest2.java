package T211008;

class Bag2{
	private Object thing;   //Object : 모든 자바 클래스의 최상위 객체로서 어떤 타입의 값도 저장할 수 있음
	public Bag2(Object thing) {
		this.thing = thing;
	}
	public Object getThing() {
		return thing;   //리턴타입이 Object이기 때문에 메소드에서 반환하는 타입이 Object이면 사용하기 전에 원래 타입으로 변경해줘야 함
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}
class Book2{
	
}
class PencilCase2{
	
}
class Notebook2{
	
}

public class BagTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag2 bag = new Bag2(new Book2());
		Bag2 bag2 = new Bag2(new PencilCase2());
		Bag2 bag3 = new Bag2(new Notebook2());
		
		Book2 book = (Book2)bag.getThing();
		PencilCase2 pc = (PencilCase2) bag2.getThing();
		Notebook2 nb = (Notebook2) bag3.getThing();
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		bag = bag2;   //bag은 Book을 가졌고, bag2는 PencilCase를 가지는 Bag 객체를 참조하였으므로 잘못된 코드. 모두 Bag 타입이라서 오류는 안 남
		
	}

}
