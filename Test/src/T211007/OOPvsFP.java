package T211007;
interface A111 {
	public void abc() ;
}

class B111 implements A111{
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("메서드 내용 1");
	}
}

public class OOPvsFP {
	public static void main(String[] args) {
		A111 a1 = new B111();
		a1.abc();
		
		A111 a2 = new A111() {
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		a2.abc();
		
		A111 a3 = () -> {System.out.println("메서드 내용 3");};   //lambda는 interface 사용해야 함
		a3.abc();
	}
}
