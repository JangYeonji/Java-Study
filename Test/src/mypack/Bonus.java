package mypack;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mysales, bonus;
		final int target = 1000;
		Scanner input = new Scanner(System.in);
		System.out.print("내가 판매한 금액을 입력하세요: ");
		//클래스명.변수.메소드명()
		mysales = input.nextInt();

		String result;
		if(mysales > target) {
			result = "실적 달성";
			bonus = (int) ((mysales-target) * 0.1);
		}else {
			result = "실적 달성 못함";
			bonus = 0;
		}
		
		System.out.println(result + "\n보너스는 " + bonus + "입니다.");
	}

}
