package mypack;

public class DoWhileControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 반복회수가 0인 경우 do-while과 while문 비교
		int a=0;
		while(a<0) {
			System.out.print(a+" ");
			a++;
		} // 실행회수 0번
		System.out.println();
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<0);
		System.out.println();
	}

}
