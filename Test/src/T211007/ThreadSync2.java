package T211007;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadSync2 extends JFrame{
JLabel label = new JLabel();
	
	public ThreadSync2() {
		setTitle("스레드 동기화");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		label.setFont(new Font("Arial",Font.BOLD,50));
		getContentPane().add(label);
		
		//2. 객체만들어서 메소드 호출로 0~9까지 출력
		Worker w = new Worker();
		for(int i=0;i<10;i++) {
			w.print(i);
		}
		
		//4. 스레드 객체 만들기
		MyThread mt = new MyThread(w);
		mt.start();
		
		//5. 스레드 객체 또 만들고 출발
		MyThread mt2 = new MyThread(w);
		mt2.start();
		
		setSize(700,200);
		setVisible(true);
	}
	//1. Worker 클래스
	class Worker{
		synchronized public void print(int x) { //@중요@ 6. synchronized 
			label.setText(label.getText()+Integer.toString(x)); //기존 x에 x를 추가함
		}
	}
	//3. 스레드 클래스 만들기
	class MyThread extends Thread{
		Worker x;
		MyThread(Worker x){
			this.x = x;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			for(int i=0;i<10;i++) {
				x.print(i);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadSync2();
	}

}
