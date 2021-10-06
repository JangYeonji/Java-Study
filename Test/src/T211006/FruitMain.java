package T211006;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fruit fruit = new Fruit();
		
		String[] fruitarr = new String[] {"청포도", "초록색", "맛있음"};
		Fruit fruit2 = new Fruit(fruitarr, 3000);
		
		String[] strArray = new String[]{"이름", "색", "맛"};		
		int strarr = strArray.length;   //호출 반복을 막기 위해
		
		for (int i=0;i<strarr;i++) {
			System.out.printf( "과일 %s을 입력하세요: ",strArray[i]);
			switch(i) {
				case 0:
					fruit.setName(sc.next());
					break;
				case 1:
					fruit.setColor(sc.next());
					break;
				case 2:
					fruit.setTaste(sc.next());
					break;
				default:
					break;
			}
		}
		
		System.out.print("과일 가격을 입력하세요 : ");
		fruit.setPrice(sc.nextInt());
		
		System.out.println("과일은 " + fruit.getName());
		System.out.println("색은 " + fruit.getColor());
		System.out.println("맛은 " + fruit.getTaste());
		System.out.println("가격은 " + fruit.getPrice()+"원");
	}

}
