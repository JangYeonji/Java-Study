package T211012;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("구렁이");
		al.add("팔렁이");
		al.add("칠렁이");
		al.add("구렁이");
		al.add("구렁삼");
		al.add("구렁사");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================");
		LinkedList<String> kk = new LinkedList<>();
		String[] animal = {"산토끼","집토끼","판토끼","죽은토끼","알카리토끼"};
		for(int i=0;i<animal.length;i++) {
			kk.add(animal[i]);
		}
		Iterator<String> it2 = kk.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println(al);
		System.out.println(kk);
	}

}
