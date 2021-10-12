package T211008;

import java.awt.*;
import javax.swing.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GraphicEvent4 extends JFrame{
	GraphicEvent4(){
		setTitle("그래픽 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MyPanel my = new MyPanel();
		setContentPane(my);
		
		setSize(300,300);
		setVisible(true);
		getContentPane().requestFocus(); //키 이벤트에서 빼먹지 말기
	}
	
	class MyPanel extends JPanel{
		Point p = new Point(120,10);
		public MyPanel(){
			this.setBackground(Color.yellow);
			
			MyThread myThread = new MyThread();
			myThread.start();
			
			this.addKeyListener(new KeyAdapter() { //1. 이벤트 리스너 객체
				public void keyPressed(KeyEvent e) {
					super.keyPressed(e);
					if(e.getKeyChar()=='A'	) { 
						//MyThread my = new MyThread(); //2. 스레드 객체
						//my.start(); //3. start() 호출
						
						//p.y += 50;
						//repaint(); //@중요@ 1. y를 바꿨으니까 새로 그려라
						
						myThread.interrupt(); //@중요@ return 빼먹지 말기, 스레드 멈추게하기
					}
				}
			});
		}
		
		//2.1 스레드 클래스
		class MyThread extends Thread{
			public void run() { //2.1 run() 구현
				super.run();
				while(true) {
					p.y += 10;
					try {
						Thread.sleep(1000); //1초
					}catch(Exception e) { return ;}
					repaint(); //2. repaint() 호출
				}
			}
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); //이전 잔상 지우기
			g.setColor(Color.blue);
			g.fillRoundRect(p.x, p.y, 50, 50, 10, 10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEvent4();
	}

}
