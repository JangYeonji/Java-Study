package T210929;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		String[] grade = {"A", "B", "C"};
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		score = in.nextInt();
		
		if(score>=90) {
			System.out.println(grade[0]);
		}else if(score>=80) {
			System.out.println(grade[1]);
		}else {
			System.out.println(grade[2]);
		}
	}

}
