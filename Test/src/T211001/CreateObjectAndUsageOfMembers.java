package T211001;

class A{
	int m=3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.m=5;
		System.out.println(a.m);
		
		a.print();
	}

}
//객체지향형 프로그래밍 : 객체를 구성하고 객체단위로 프로그래밍(필드/메서드)