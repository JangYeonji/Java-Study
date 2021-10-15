package T211015;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tic_Tac_Toe_Game extends JPanel implements ActionListener{
	JButton[][] buttons = new JButton[3][3];
	private char turn = 'X';
	
	public Tic_Tac_Toe_Game() {
		setLayout(new GridLayout(3,3,5,5));   //(행,열,수평간격,수직간격)
		Font f = new Font("Dialog",Font.ITALIC,50);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}
	
	@Override   //자식클래스에서 부모클래스에 메소드를 재정의하여 사용
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ")==true) {
					if (turn == 'X') {
						buttons[i][j].setText("X");
						turn = 'o';
						if (checkWin("X",i,j))
							System.out.println("X가 이겼음");
						else if(isDraw())
							System.out.println("비겼습니다.");
						else {
							buttons[i][j].setText("o");
							turn = 'X';
							if (checkWin("o",i,j))
								System.out.println("o가 이겼음");
							else if (isDraw())
								System.out.println("비겼습니다.");
						}
					}
				}
			}
		}	
	}
	public boolean isDraw() {
		for(int row=0;row<3;++row) {
			for(int col=0;col<3;++col) {
				if(buttons[row][col].getText().equals(" ")) {
					return false;
				}
			}
		}
		return true;
	}
	public boolean checkWin(String mark, int r, int c) {
		return (buttons[r][0].getText().equals(mark))
				&& buttons[r][1].getText().equals(mark)
				&& buttons[r][2].getText().equals(mark)
				|| buttons[0][c].getText().equals(mark)
				&& buttons[1][c].getText().equals(mark)
				&& buttons[2][c].getText().equals(mark)
				|| buttons[0][0].getText().equals(mark)
				&& buttons[1][1].getText().equals(mark)
				&& buttons[2][2].getText().equals(mark)
				|| buttons[0][2].getText().equals(mark)
				&& buttons[1][1].getText().equals(mark)
				&& buttons[2][2].getText().equals(mark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Tic_Tac_Toe_Game());
		f.setSize(300,300);
		f.setVisible(true);
	}

}
