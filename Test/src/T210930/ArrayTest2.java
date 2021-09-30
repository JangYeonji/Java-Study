package T210930;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5;
		Scanner sc = new Scanner(System.in);
		int[] scores = new int [STUDENTS];
		int total = 0;
		
		for(int i=0;i<STUDENTS;i++) {
			System.out.print("성적을 입력");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		
		System.out.println("평균 성적은" + total / STUDENTS + "입니다.");
	}

}
