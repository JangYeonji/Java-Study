package T210930;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 6;
		int freq[] = new int[SIZE];
		
		for(int i=0;i<1000;i++) {
			++freq[(int)(Math.random()*SIZE)];
		}
		System.out.println("면 빈도");
		for (int i=0;i<SIZE;i++) {
			System.out.println(""+(i+1)+"\t"+freq[i]);
		}
	}

}
