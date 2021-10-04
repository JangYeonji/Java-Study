package T211004;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcController calc = new CalcController();
		
		int sum = calc.sum(1,2);
		int sub = calc.sub(2,1);
		int mul = calc.mul(1,2);
		float div = calc.div(2,1);
		System.out.printf("합 %d, 뺄 %d, 곱 %d, 나 %f",sum, sub, mul, div);
	}

	

}
