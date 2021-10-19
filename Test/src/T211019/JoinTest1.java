package T211019;

public class JoinTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "start");
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();
		try {
			myThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"end");
		
	}

}
