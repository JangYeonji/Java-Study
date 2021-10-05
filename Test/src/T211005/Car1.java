package T211005;

public class Car1 {
	private String carName;   
	private String carColor;
	private int carSize;
	private int velocity;

	public Car1(String _carName, String _carColor, int _carSize, int _velocity) {
		carName = _carName;
		carColor = _carColor;
		carSize = _carSize;
		velocity = _velocity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
//인스턴스 변수 : 객체 생성을 해야 사용 가능
//인스턴스마다 다른 값(속성)을 가질 수 있음

//클래스 변수(=정적 멤버변수) : static이 붙으며 객체 생성 없이 사용 가능
//공통으로 공유하는 값(속성)을 가짐

//지역 변수 : 메소드 내에서 선언되고 메서드 내에서만 사용 가능. {} 기준