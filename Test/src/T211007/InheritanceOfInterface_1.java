package T211007;

public class InheritanceOfInterface_1 {
	interface A1{}
	interface B{}
	
	class C implements A1{
		
	}
	class D implements A1, B{
		
	}
	class E extends C implements A1,B{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
