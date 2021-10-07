package T211006;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Piano extends JFrame {
	
	JButton [] wkey = new JButton [10];
	String [] names = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
	
	JButton [] bkey1 = new JButton [2];
	String [] names2 = {" ", " "};
	
	JButton [] bkey2 = new JButton [3];
	String [] names3 = {" ", " ", " "};
	
	JButton [] bkey3 = new JButton [2];
	String [] names4 = {" ", " "};
	
	Piano() {
		setTitle("PIANO"); //PIANO 타이틀
		setDefaultCloseOperation(EXIT_ON_CLOSE); //프로세스 닫기
		
		Container c = getContentPane(); //컨테이너 만들기
		c.setBackground(Color.DARK_GRAY); //컨테이너 오렌지색 배경 #a52a2a
		c.setLayout(null);
		
		// 10개의 버튼 컴포넌트를 생성하고 동일한 크기로 설정한다.
		for(int i=0; i<bkey1.length; i++) {
			bkey1[i] = new JButton(names2[i]);
			bkey1[i].setLocation((i*100)+85, 50); // 버튼의 위치 설정
			bkey1[i].setSize(80, 130); // 버튼의 크기는 동일하게 100x200
			bkey1[i].setBackground(Color.BLACK);
			bkey1[i].setForeground(Color.WHITE);
			c.add(bkey1[i]); // 버튼을 컨텐트팬에 부착
		}
		
		for(int i=0; i<bkey2.length; i++) {
			bkey2[i] = new JButton(names3[i]);
			bkey2[i].setLocation((i*100)+385, 50); // 버튼의 위치 설정
			bkey2[i].setSize(80, 130); // 버튼의 크기는 동일하게 100x200
			bkey2[i].setBackground(Color.BLACK);
			bkey2[i].setForeground(Color.WHITE);
			c.add(bkey2[i]); // 버튼을 컨텐트팬에 부착
		}
		
		for(int i=0; i<bkey3.length; i++) {
			bkey3[i] = new JButton(names4[i]);
			bkey3[i].setLocation((i*100)+785, 50); // 버튼의 위치 설정
			bkey3[i].setSize(80, 130); // 버튼의 크기는 동일하게 100x200
			bkey3[i].setBackground(Color.BLACK);
			bkey3[i].setForeground(Color.WHITE);
			c.add(bkey3[i]); // 버튼을 컨텐트팬에 부착
		}
		
		for(int i=0; i<wkey.length; i++) {
			wkey[i] = new JButton(names[i]);
			wkey[i].setLocation((i*100)+20, 50); // 버튼의 위치 설정
			wkey[i].setSize(100, 200); // 버튼의 크기는 동일하게 100x200
			wkey[i].setBackground(Color.WHITE);
			c.add(wkey[i]); // 버튼을 컨텐트팬에 부착
		}
		
		
		JLabel label = new JLabel();
		label.setLocation(500,280);
		label.setSize(145, 45);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("굴림체", Font.ITALIC, 40));
		c.add(label);
		
		wkey[0].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("도"); 
			}
		});
		wkey[1].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("레"); 
			}
		});
		wkey[2].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("미"); 
			}
		});
		wkey[3].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("파"); 
			}
		});
		wkey[4].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("솔"); 
			}
		});
		wkey[5].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("라"); 
			}
		});
		wkey[6].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("시"); 
			}
		});
		wkey[7].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("도"); 
			}
		});
		wkey[8].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("레"); 
			}
		});
		wkey[9].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("미"); 
			}
		});
		
		bkey1[0].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("도#=레b"); 
			}
		});
		bkey1[1].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("레#=미b"); 
			}
		});
		bkey2[0].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("파#=솔b"); 
			}
		});
		bkey2[1].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("솔#=라b"); 
			}
		});
		bkey2[2].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("라#=시b"); 
			}
		});
		bkey3[0].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("도#=레b"); 
			}
		});
		bkey3[1].addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				label.setText("레#=미b"); 
			}
		});
	
		
		
		setSize(1050,400); // 프레임 크기 1050x400 설정
		setVisible(true); // 화면에 프레임 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Piano();
	}

}
