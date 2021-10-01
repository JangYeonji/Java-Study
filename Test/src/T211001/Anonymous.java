package T211001;

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous ay = new Anonymous();   //배열 이름 지정 안함. 즉시 배열을 만들어서 함수의 인수로 전달하고자 할 때 사용.
		System.out.println("숫자들의 합 : "+ ay.sum(new int[] {1,2,3,4}));
		//메인 메소드가 클래스 밖 전역에 메모리가 잡혀있을 때 sum 메소드는 static이어야 함
	}
	public int sum(int[] numbers) {   //non static으로 호출하고싶기 때문에 클래스를 객체 인스턴스 생성해서 사용함
		int total = 0;
		for (int i=0;i<numbers.length;i++) {
			total = total + numbers[i];
		}
		return total;
	}

}
