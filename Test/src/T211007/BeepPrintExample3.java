package T211007;

import java.awt.Toolkit;

//p469 1번
class MyThread extends Thread {	
	public void run() {		
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			//System.out.println("띵");
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
		*/
		super.run();
	}
}

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how1 p469 1번
				MyThread ttt = new MyThread();
			
						
				ttt.start(); //@중요@ start()
				
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try { Thread.sleep(1000); } catch(Exception e) {}
				}
	}

}
