package T211006;

class Bank{
	double getInterestRate() {
		return 0.0;
	}
}
class BadBank extends Bank{
	double getInterestRate() {   //메소드 오버라이딩으로 부모클래스 메소드 재정의. 메소드의 이름, 반환형, 매개변수 개수, 데이터타입이 일치해야 함.
		return 10.0;
	}
}
class NormalBank extends Bank{
	double getInterestRate() {
		return 5.0;
	}
}
class GoodBank extends Bank{
	double getInterestRate() {
		return 3.0;
	}
}
public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율: " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율: " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율: " + b3.getInterestRate());
	}
}
