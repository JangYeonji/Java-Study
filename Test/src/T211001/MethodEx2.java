package T211001;

public class MethodEx2 {
	public void print(int a) {
		System.out.println("결과값= "+a);   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11; int b=22; int result = 0;
		
		MethodEx2 m = new MethodEx2();
		result = a+b;
		
		m.print(10);
		m.print(b);
		m.print(result);
		
		MethodEx1 n = new MethodEx1();
		n.print();
	}

}
