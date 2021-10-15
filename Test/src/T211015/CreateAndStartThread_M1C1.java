package T211015;
class SMIFileThread extends Thread{
	
}

public class CreateAndStartThread_M1C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		int[] intArray = {1,2,3,4,5};
		for(int i=0;i<intArray.length;i++) {
			System.out.println("(비디오프레임) " + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}

}
