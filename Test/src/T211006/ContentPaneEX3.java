package T211006;

import javax.swing.*;
import java.awt.*;

class ContentPaneEX3 extends JFrame{
	public ContentPaneEX3() {
				setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀  달기->제목이라서 있어야 됨
				//setDefaultCloseOperation(EXIT_ON_CLOSE);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
				//->창을 닫아도 프로세스가 살아있기 때문에 창을 닫으면 끝나야한다
				
				Container c = getContentPane(); // 컨텐트 팬을 알아낸다.
				c.setBackground(new Color(100,100,100));
				//c.setBackground(Color.ORANGE); // 오렌지색 배경 설정
				
				c.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
				//c.setLayout(new GridLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
				//c.setLayout(new GridLayout(3,2)); //컨텐트팬에 FlowLayout 배치관리자 달기
				//FlowLayout이랑 GridLayout 차이점 알기
				
				JButton btn1 = new JButton("OK");
				btn1.setBackground(Color.BLUE);
				btn1.setForeground(Color.WHITE);
				c.add(btn1);
				
				//c.add(new JButton("OK")); // OK 버튼 달기
				c.add(new JButton("Cancel")); // Cancel 버튼 달기
				//c.add(new JLabel("Ignore")); // Ignore 버튼 달기
				
				JLabel lab1 = new JLabel("Ignore");
				lab1.setBackground(Color.RED);
				lab1.setOpaque(true);
				c.add(lab1);
				
				setSize(300, 150); // 프레임 크기 300x150 설정
				setVisible(true); // 화면에 프레임 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEX3();
	}

}
