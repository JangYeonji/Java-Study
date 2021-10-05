package T211005;

class Parent2{
	protected int pn; //public, protected, (default), private으로 비교
}
class Child2 extends Parent2{
	int cn;
}
public class Test1{
	public static void main(String[] args){
		Parent2 pa = new Parent2();
		Child2 ch = new Child2();
		
		pa.pn = 1;
		ch.pn = 2;
		ch.cn = 3;
		
		System.out.println(pa.pn);
		System.out.println(ch.pn);
		System.out.println(pa.pn);
		System.out.println(ch.cn);
	}
}