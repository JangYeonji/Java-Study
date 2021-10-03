package T211001;

public class MethodEx3 {
	public void print1(String str) {
		System.out.println(str);   
	}
	public void print(int a, float b) {
		float c = a+b;
		System.out.println("결과값= "+c);   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=11; int num2=22; int result=0;
		
		MethodEx3 m = new MethodEx3();
		m.print(10, 30);
		m.print(num1, num2);
		m.print(10, 30.5f);
		m.print1("안녕하세요");
	}

}
