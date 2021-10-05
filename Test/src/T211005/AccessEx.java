package T211005;
class Sample{
	public int a;
	private int b;
	int c;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
public class AccessEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.setB(10);
		int b = aClass.getB();
		aClass.c = 10;
		System.out.println(b);
	}

}
