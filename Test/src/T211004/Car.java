package T211004;

public class Car {
	String color;
	int speed;
	int gear;
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	void changegear(int g) {
		gear = g;
	}
	void speedUp() {
		speed = speed+10;
	}
	void speedDown() {
		speed = speed-10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.color = null;
		c.speed = 10;
		c.gear = 1;
		System.out.print(c.toString());
	}

}
