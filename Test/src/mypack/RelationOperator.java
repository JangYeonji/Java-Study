package mypack;

public class RelationOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 크기비교 : true, false
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		
		//2. 등가비교 : true, false
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==c);
		System.out.println(a!=c);
		
		//참조자료형 등가비교 (번지비교)
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1==str2);
		//등가비교는 stack 메모리의 값을 비교
		//기본자료형(값비교) / 참조자료형(번지비교)
		//별도의 클래스에 '안녕'값이 생성되므로 주소가 다름
	}

}
