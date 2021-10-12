package T211012;

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		javaScore.put("김성동",97);
		javaScore.put("asd",1);
		javaScore.put("fde",7);
		javaScore.put("ㄹㄷㅁ",6);
		javaScore.put("ㅎㅁㄷ",76);
		System.out.println("HashMap의 요소 개수 : " + javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : "+score);
		}
		
	}

}
