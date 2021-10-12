package T211012;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("MILK");
		set.add("BREAD");
		set.add("BUTTER");
		set.add("CHEESE");
		set.add("HAM");
		System.out.println(set);
		
		TreeSet<String> st = new TreeSet<>();
		st.add("MILK");
		st.add("BREAD");
		st.add("BUTTER");
		st.add("CHEESE");
		st.add("HAM");
		System.out.println(st);
	}

}
