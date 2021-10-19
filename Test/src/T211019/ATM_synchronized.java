package T211019;

class ATM implements Runnable{
	private long depositeMoney = 10000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			for(int i=0;i<10;i++) {
				if(getDepositeMoney()<=0)
					break;
				withDraw(1000);
				if(getDepositeMoney()==2000 || getDepositeMoney()==4000 || getDepositeMoney()==6000 || getDepositeMoney()==8000) {
					try {
						System.out.println("this.wait() 호출 \n");
						this.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("this.notify() 호출 \n");
					this.notify();
				}
			}
		}
	}
	public void withDraw(long howMuch) {
		if(getDepositeMoney()>0) {
			depositeMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + " : ");
			System.out.println("잔액 : "+getDepositeMoney() + " 원");
		}else {
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}
	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}
public class ATM_synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread hong = new Thread(atm,"홍길동");
		Thread lee = new Thread(atm, "이순신");
		hong.start();
		lee.start();
	}

}
