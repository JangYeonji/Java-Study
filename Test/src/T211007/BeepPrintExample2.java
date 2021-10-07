package T211007;

import java.awt.Toolkit;

class BeepTask implements Runnable {	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

class BeepThread extends Thread { //@중요@ extends Thread
	@Override
	public void run() {	 //@중요@ run
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how1 p469 1번
				//BeepThread thread = new BeepThread(); //@중요@ new 뒤에 들어갈 것
				
				//how2
//				Runnable beepTask = new BeepTask();
//				Thread thread = new Thread(beepTask);
				
				//how3
//				Thread thread = new Thread() {
//					@Override
//					public void run() {		
//						Toolkit toolkit = Toolkit.getDefaultToolkit();	
//						for(int i=0; i<5; i++) {		
//							toolkit.beep();
//							try { Thread.sleep(500); } catch(Exception e) {}
//						}
//					}
//				};
				
				//how4
//				Thread thread = new Thread(new Runnable() {  //Runnable()
//					@Override
//					public void run() {
//						Toolkit toolkit = Toolkit.getDefaultToolkit();	
//						for(int i=0; i<5; i++) {		
//							toolkit.beep();
//							try { Thread.sleep(1000); } catch(Exception e) {}
//						}
//					}
//				});
			
				
				//how4 Runnable 인터페이스로 바로 객체 만들기
				
				Runnable tmp = new Runnable(){ //Runnable()
				@Override
					public void run() {
						Toolkit toolkit = Toolkit.getDefaultToolkit();	
						for(int i=0; i<5; i++) {		
							toolkit.beep();
							try { Thread.sleep(1000); } catch(Exception e) {}
						}
					}
				};
				
				Thread thread = new Thread(tmp);
				 
				
						
				thread.start(); //@중요@ start()
				
//				for(int i=0; i<5; i++) {
//					System.out.println("띵");
//					try { Thread.sleep(1000); } catch(Exception e) {}
//				}
	}

}
