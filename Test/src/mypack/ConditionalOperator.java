package mypack;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 삼항연산자
		int value1 = (3>5)?6:9;
		System.out.println(value1);
		
		int value2 = (5>3)?6:9;
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(value3);
		
		if(value3%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
