package T211006;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ch10Test4_event extends JFrame{
	Ch10Test4_event(){
		setTitle("Swing Components");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);  //기본이 BorderLayout
		
		//2 패널 객체 생성하고 컨텐트패인에 연결
		MyPanel p1 = new MyPanel();
		p1.setBounds(10,10,260,100);
		c.add(p1);

		setSize(300,400);
		setVisible(true);
	}
	//1 패널 클래스 만들기
	class MyPanel extends JPanel{
		MyPanel(){
			setBackground(Color.blue);
			JButton btn = new JButton("옵션패인");  //변형
			add(btn);
			
			//3. 이벤트 처리 (Anonymous Inner 방법, 다른 방법으로도 시도)
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// 입력 다이얼로그 생성
					String name = JOptionPane.showInputDialog("버튼 이름을 주세요.");
					if(name != null)
						btn.setText(name); 
					JOptionPane.showMessageDialog((JButton)e.getSource(), "Be Happy", "Message", JOptionPane.PLAIN_MESSAGE);

					JOptionPane.showConfirmDialog(null, "계속?");
					int r = JOptionPane.showConfirmDialog(null, "열공?", "제목", JOptionPane.YES_NO_OPTION);
					//if( r== JOptionPane.YES_OPTION )
						//JOptionPane.showMessageDialog((JButton)e.getSource(), "Be Happy", "Message", JOptionPane.PLAIN_MESSAGE);
				}
			});
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ch10Test4_event();
	}

}
