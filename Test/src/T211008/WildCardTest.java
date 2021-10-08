package T211008;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inum = {1,2,3,4,5};
		Double[] dnum = {1.0,2.0,3.0,4.0,5.0};
		String[] snum = {"1","2","3","4","5"};
		
		List<Integer> iList = Arrays.asList(inum);
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);
		
		double isum = sum(iList);
		double dsum = sum(dList);
		
		System.out.println("inum의 합계 : " + isum);
		System.out.println("dnum의 합계 : " + dsum);
	}
	public static double sum(List<? extends Number> list) {   //extends : 상위제한, <? super 하위클래스/인터페이스> : 하위제한
																				//와일드카드에 하위제한을 두면 서브클래스 or 서브클래스가 상속하고 있는 상위 객체만 타입으로 지정 가능
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
	

}
