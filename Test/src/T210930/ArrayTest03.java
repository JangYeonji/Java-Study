package T210930;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {10,20,30,40,50};
		int count, size;
		
		count = aa.length;
		size=count*Integer.BYTES;
		System.out.printf("배열 aa[]의 요소의 개수는 %d 개입니다.\n", count);
		System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다. \n", size);
	}

}
