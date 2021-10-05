package T211005;
class Parent{
	protected int pn;
}
class Child extends Parent{
	int cn = pn+1;
	int getPn(){
		return super.pn;
	}
}
public class Test6{
	public static void main(String[] args){
		Parent pa = new Parent();
		Child ch = new Child();
		
		//System.out.println("부모 pn" + pa.pn);
		System.out.println("자식 pn" + ch.getPn());
		System.out.println("자식 cn" + ch.cn);
	}
}