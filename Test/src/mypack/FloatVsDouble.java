package mypack;

public class FloatVsDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1. float의 정밀도 (대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		//#2. double의 정밀도 (대략 소수 15자리)
		double d1 = 1.00000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}

}//코드에 직접 작성한 값을 literal이라고 함
