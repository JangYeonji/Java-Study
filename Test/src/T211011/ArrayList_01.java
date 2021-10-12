package T211011;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("구렁이");
		a1.add("팔렁이");
		a1.add("칠렁이");
		a1.add("구렁이");
		a1.add("구렁삼");
		a1.add("구렁사");
		for (int i=0;i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("=============");
		for(String str : a1)
			System.out.println(str);
	}

}
