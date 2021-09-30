package T210929;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XOR
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^(5<3));
		System.out.println((5<=5)^(7>2));
		
		//NOT
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || ! (5<3));
		System.out.println((5<=5) | (7>2));
		
		//2. 비트 연산자로 논리연산 수행
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|(5<3));
		System.out.println((5<=5)^(7>2));
		
		//숏 서킷 사용 여부(논리연산자 O, 비트연산자 X)
		int value1 = 3;
		System.out.println(false && ++value1>6);   //AND이고, 앞이 false이기 때문에 뒤에 연산 안해도 돼서 ++value1 연산을 안 함
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false & ++value2>6);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true || ++value3>6);   //OR이고, 앞이 true이기 때문에 ++value3은 연산을 안 함
		System.out.println(value3);
	}

}
