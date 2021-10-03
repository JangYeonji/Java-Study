package T211001;

public class CallByString {
	public void setAddress(String addr) {
		//값을 매개변수로 받을 경우 값이 복사되어 전달됨
		addr = "경기도 수원시 장안구";   //리턴값을 반환하지 않는 이상 값의 변동은 없다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "서울시 강남구 논현동";
		CallByString st = new CallByString();
		System.out.println("메소드 호출 전");
		System.out.println("address= "+address);
		
		st.setAddress(address);
		System.out.println("메소드 호출 후");
		System.out.println("address= "+address);
	}

}
