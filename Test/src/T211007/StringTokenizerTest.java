package T211007;

//int countTokens()
//boolean hasMoreTokens()
//String nexToken()

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("사과 배 딸기 포도 석류 아보카도"," ");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}