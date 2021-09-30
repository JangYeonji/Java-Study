package T210929;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 대입연산자
		int value1 = 3;
		value1 = value1+3;
		System.out.println(value1);
		
		//축약표현
		int value2;
		value2 = 5; System.out.println(value2+=2);
		value2 = 5; System.out.println(value2-=2);
		value2 = 5; System.out.println(value2*=2);
		value2 = 5; System.out.println(value2/=2);
		value2 = 5; System.out.println(value2%=2);
		value2 = 5; System.out.println(value2|=2);
		value2 = 5; System.out.println(value2<<=2);
		value2 = 5; System.out.println(value2>>=2);
		value2 = 5; System.out.println(value2>>>=2);
		
	}

}
