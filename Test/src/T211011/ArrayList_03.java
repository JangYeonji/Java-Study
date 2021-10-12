package T211011;

import java.util.ArrayList;

public class ArrayList_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		ArrayList <Integer> cha = new ArrayList<>();
		ArrayList <Integer> kyo = new ArrayList<>();
		ArrayList <Integer> hap = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		hap.addAll(cha);
		hap.addAll(list2);
		kyo.addAll(list2);
		kyo.removeAll(cha);
		
		System.out.println("교집합 : " + kyo);
		System.out.println("합집합 : " + hap);
		System.out.println("1-2 : "+cha);
	}

}
