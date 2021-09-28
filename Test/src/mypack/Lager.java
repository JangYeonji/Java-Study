package mypack;

import java.util.Scanner;

public class Lager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, max;
		Scanner input = new Scanner(System.in);
		System.out.print("1번 정수를 입력하시오: ");
		num1 = input.nextInt();
		System.out.print("2번 정수를 입력하시오: ");
		num2 = input.nextInt();
		
		if(num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}
		System.out.println("최댓값은 " + max + "입니다.");
	}

}
