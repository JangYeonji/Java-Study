package T211001;

import java.util.Collections;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7; int m=1;
		
		//방법1
//		int repeat = 3; 
//		
//		for(int i=7;i>=0;i-=2) {
//			for(int j=0;j<(i/2);j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<m;j++) {
//				System.out.print("*");
//			}
//			m+=2;
//			System.out.println();
//		}
		
		//방법2
		String str = "";
		
		for(int i=7;i>=0;i-=2) {
			for(int j=0;j<(i/2);j++) {
				System.out.print(" ");
			}
			System.out.print(String.join("", Collections.nCopies(m, "*")));   //*을 m번 반복해 출력
			m+=2;
			System.out.println();
		}
	}

}
