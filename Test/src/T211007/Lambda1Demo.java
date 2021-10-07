package T211007;

import java.util.Arrays;

public class Lambda1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"로마","시간","펜"};
		Arrays.sort(strings,(first,second)->first.length() - second.length());
		for(String s:strings) {
			System.out.println(s);
		}
	}

}
