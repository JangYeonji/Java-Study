package T211005;

public class Car {
	private String carName;   //private 접근자를 사용해서 해당 필드에 대한 외부에서 오는 접근을 차단
	private String carColor;
	private int carSize;
	private int velocity;
	
	//get, set()을 만들어서 사용하는 이유는 캡슐화, 정보화 은닉을 위함
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getCarSize() {
		return carSize;
	}
	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public void speedUp() {
		velocity = velocity+1;
	}
	public void speedDown() {
		velocity = velocity-1;
		if(velocity<0) {
			velocity = 0;
		}
	}
	public void stop() {
		velocity = 0;
	}
	public void park() {
		System.out.println("주차합니다.");
	}
}

