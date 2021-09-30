package T210929;

public class TypeCasting_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동변환 (업캐스팅 + byte/short 자료형 데이터 입력)
		float value1 = 3;
		long value2 = 5;
		double value3 = 7;
		byte value4 = 9;
		short value5 = 11;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//2. 수동 타입 변환
		byte value6 = (byte)128;
		int value7 = (int)3.5;
		float value8 = (float)7.5;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}

}
