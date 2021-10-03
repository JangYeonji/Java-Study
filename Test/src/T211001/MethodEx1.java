package T211001;

public class MethodEx1 {
	public void print() {
		System.out.println("메소드를 호출합니다.");   //static이 아니라서 객체 인스턴스 생성 후 호출 가능
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1; int b=2; int result =0;
		
		MethodEx1 m = new MethodEx1();   //메모리에 인스턴스 생성
	}

}
