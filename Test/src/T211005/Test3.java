package T211005;

class Parent3{
	int pn;
	Parent3(){
		System.out.println("부모 기본 생성자");
	}
	Parent3(int x){
		System.out.println("부모 기본 생성자, 매개");
		pn = x;
	}
}
class Child3 extends Parent3{
	int cn;
	Child3(){
		System.out.println("자식 기본 생성자");
	}
	Child3(int x){
		super(x);
		System.out.println("자식 기본 생성자, 매개");
		cn = x;
	}
}
public class Test3{
	public static void main(String[] args){
		Parent3 pa = new Parent3();
		Child3 ch = new Child3(1);
		
		System.out.println("부모 pn" + pa.pn);
		System.out.println("자식 pn" + ch.pn);
		System.out.println("자식 cn" + ch.cn);
	}
}
