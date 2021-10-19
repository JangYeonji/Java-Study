package T211019;

import java.util.ArrayList;

class Before extends Thread{
	Before(String str){
		super(str);
	}
	void addCar() {
		System.out.println("addCar");
		JoinTest2.carList.add("Benz");
		JoinTest2.carList.add("Audi");
		JoinTest2.carList.add("SM7");
		JoinTest2.carList.add("Porsche");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		addCar();
	}
	
}
class After extends Thread{
	After(String title){
		super(title);
	}
	public void run() {
		System.out.println(getName());
		for(String car : JoinTest2.carList) {
			System.out.println(car);
		}
	}
}
public class JoinTest2 {
	public static ArrayList<String> carList = new ArrayList<>();
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Before bf = new Before("우선");
		After at = new After("나중에");
		bf.start();
		try {
			bf.join();
		}catch(Exception e){
			
		}
		at.start();
	}

}
