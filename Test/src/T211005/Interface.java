package T211005;

interface IA {     // 인터페이스 정의와 특징? --> 추상보다 더 추상 강아지가 있다.
	public static final int n1=1;  //생략 가능한 부분?  오류찾기 답  확인 224p 상수 동그라미3개 추상메소드 동그라미1개 있어야만!!!!
	//상수는~, 인터페이스는 상속받아 다른 인터페이스를 만들 수 있다.
	abstract public void aa();  //생략 가능한 부분?
}

interface IB {  //생략한 것
	int n2 = 2;  //public static final 생략    
	void bb();	//abstract public 생략 가능
}
//abstract 넣어서 예제 만들어보기 
class CA {     // 일반 클래스 와 abstract 차이점
	int n3;
	void cc(){	//오버라이딩?
		System.out.println("Class CA");
	}
}

class CB extends CA implements IA, IB{  //인터페이스 구현, 클래스 상속   225p
	public void aa(){    //접근지정자 주의
		System.out.println("Interface IA 구현");
	}
	public void bb(){   //접근지정자 주의
		System.out.println("Interface IB 구현");
	}
	void cc(){   //오버라이딩
		System.out.println("Class CA 상속 후 오버라이딩");
	}	
}

public class Interface {
	public static void main(String[] args) {
		CB obj = new CB();
		obj.aa();
		obj.bb();
		obj.cc();
	}
}
