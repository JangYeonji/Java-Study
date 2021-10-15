package T211015;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyPad extends JFrame implements ActionListener{
	private JTextField txt;
	private JPanel panel;
	
	public KeyPad() {
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		add(panel,BorderLayout.CENTER);
		for(int i=0;i<20;i++) {
			JButton btn = new JButton(""+i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100,100));   //layout 관리자에서는 setPreferredSize를 써줘야 함. BorderLayout을 사용중이면 영향을 줄 수 없음
			panel.add(btn);
		}
		pack();   //컴퍼넌트의 사이즈를 딱 맞게 맞춰줌
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyPad();
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}

}
