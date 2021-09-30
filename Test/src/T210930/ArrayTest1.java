package T210930;

public class ArrayTest1 {

	public static void main(String[] args) {   //static은 메모리에 먼저 올라가는 메소드..?
		// TODO Auto-generated method stub
		int [] s = new int [10];   //생성시 크기를 지정. 이후 크기 변경 불가
		//int s [] = 로도 쓸 수 있음
		
		for (int i=0; i<s.length; i++) {
			s[i] = i;
		}
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]+" ");
		}
	}

}
