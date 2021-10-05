package T211005;

abstract class A {    // 추상 클래스 정의와 특징 219p-->추상메소드, 추상클래스의 선언ㅇ.. 없어도!!!!중요
	int n1 = 1;
	abstract void abc();   // 추상 메소드 -->머리만 있는 것
}
//슈퍼클래스에서 덜 구체적인 클래스
class B extends A {   //상속
	int n2 = 2;
	void abc(){    // 반드시 오버라이딩
		System.out.println("추상 클래스 상속 후 구현");
	}	
}
public class Abstract {
	public static void main(String[] args) {
		//A a = new A();  // 불가능
		A a2;    // 가능
		B b = new B();
		b.abc();
		System.out.println("b.n2, b.n1 : " + b.n2 + ", " +b.n1);
		a2 = b;
		//System.out.println("a2.n2, a2.n1 : " + a2.n2 + ", " +a2.n1);
		
		//221페이지 마지막 개념
	}
}
