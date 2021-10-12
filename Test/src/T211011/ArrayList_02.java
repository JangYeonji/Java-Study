package T211011;

import java.util.ArrayList;

public class ArrayList_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();   //이게 맞나?
		a1.add("watermelon");
		a1.add("apple");
		a1.add("grape");
		a1.add("orange");
		a1.add("watermelon");
		a1.add("watermelon");
		print(a1);
		
		a1.add(1,"kiwi");
		print(a1);
		a1.add(4,"peach");
		print(a1);
		a1.remove(0);
		print(a1);
		System.out.println("Index 3: "+a1.get(3));
		System.out.println("Banana: "+a1.contains("banana"));
		System.out.println("Banana: "+a1.indexOf("banana"));
		System.out.println("Banana: "+a1.lastIndexOf("banana"));
		for(int i=0;i<a1.size();i++) {
			if(a1.get(i).equals("banana")) {
				a1.set(i,"strawberry");
			}
		}
		print(a1);
	}
	private static void print(ArrayList<String> a1) {
		for(String str:a1) {
			System.out.print(str + "\t");
		}
	}
}
