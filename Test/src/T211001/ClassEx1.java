package T211001;

class myInt{
	int a;
}
public class ClassEx1 {
	static void func1(myInt m) {
		m.a = m.a + 1;
		System.out.printf("전달받은 a==>%d \n", m.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInt m = new myInt();
		m.a = 10;
		func1(m);
		System.out.printf("실행 후의 a==>%d \n", m.a);
	}

}
