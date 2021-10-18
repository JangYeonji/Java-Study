package T211018;

class MyData{
	int data = 3;
	public synchronized void plusData() {
		int mydata = data;
		try {Thread.sleep(2000);}catch(InterruptedException e) {}
		data = mydata+1;
	}
}
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		myData.plusData();
		System.out.println(getName()+"실행결과 : "+myData.data);
	}
}
public class SynchronizedMethod{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData myData = new MyData();
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}

}
