package mypack;

public class Ex04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		System.out.printf(" And 연산 : %s \n", (a>=100) && (a<=200));
		System.out.printf(" OR 연산 : %s \n", (a>=100) || (a<=200));
		System.out.printf(" NOT 연산 : %s \n", !(a>=100));
		
		System.out.println(3&10);
		System.out.println(0b00000011 & 0b00001010);
	}

}
