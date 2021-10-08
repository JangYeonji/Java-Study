package T211008;

class Bag4<T extends Solid>{   //Bag4 클래스를 고체 매개변수만 상속받을 수 있도록 제한. 
	private T thing;
	private String owner;
	public Bag4(T thing) {
		this.thing = thing;
	}
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isSameOwner(Bag4<?> obj) {   //어떤 타입의 매개변수도 지정할 수 있는 와일드카드 사용
		if(this.owner.equals(obj.getOwner())){
			return true;
		}
		return false;
	}
}
class Solid{}
class Liquid{}
class Book4 extends Solid{}
class PencilCase4 extends Solid{}
class Notebook4 extends Solid{}
class Water{}

public class BagTest4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag4<Book4> bag = new Bag4<>(new Book4());
		Bag4<PencilCase4> bag2 = new Bag4<>(new PencilCase4());
		Bag4<Notebook4> bag3 = new Bag4<>(new Notebook4());
		//Bag4<Water> bag4 = new Bag4<>(new Water());   //Solid 객체가 아니라서 오류
		
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		
		boolean result = bag.isSameOwner(bag2);   //소유자가 동일
		
		if (result)
			System.out.println("소유자가 동일합니다.");
		else
			System.out.println("소유자가 다릅니다.");
	}

}
