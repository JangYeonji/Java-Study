package T211008;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class DbTest2 extends JFrame{
	private JTextArea tArea;
	private JPanel comboPanel, recipePanel = null;
	private JLabel pictureLabel;
	Statement stmt;
	Connection con;
	
	public DbTest2() {
		con = makeConnection();   //DB 연결
		try {
			stmt = con.createStatement(); //prepared로 바꿀 수 있음
		} catch (Exception e) { }
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레시피야!");

		/* 위쪽 핑크 패널 */
		JComboBox comboBox = new JComboBox();
		comboBoxMenu(comboBox);   //class
		JLabel commentLabel = new JLabel("메뉴를 고르세요");
		comboPanel = new JPanel(new FlowLayout());
		comboPanel.setBackground(Color.pink);
		comboPanel.add(comboBox);
		comboPanel.add(commentLabel); 
		
		comboBox.addActionListener(new ManuSelectListener());   //event class
		
		/* 아래쪽 패널 전체*/
		recipePanel = new RecipePanel();   //class
		
		add(comboPanel, BorderLayout.NORTH);
		add(recipePanel, BorderLayout.CENTER);
		
		setSize(700, 500);
		setVisible(true);
	} 

	class RecipePanel extends JPanel {
		public RecipePanel() {
			setLayout(null);
			setBackground(Color.CYAN);
			
			JLabel recipe = new JLabel();
			recipe.setFont(new Font("HYHeadLine", Font.BOLD, 15));
			recipe.setText("요리 완성 사진");
			recipe.setBounds(150, 10, 100, 200);
			add(recipe); 
			
			pictureLabel = new JLabel();
			pictureLabel.setBounds(300, 50, 150,150);
			changePicutre("start");   //class
			add(pictureLabel);
			
			tArea = new JTextArea("여기에 레서피를 보여드립니다");
			tArea.setBackground(Color.pink);
			JScrollPane scrollPane = new JScrollPane(tArea);
			scrollPane.setBounds(50, 210, 600, 200);
			add(scrollPane);
		}
	} 

	class ManuSelectListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { 
			JComboBox cBox = (JComboBox) e.getSource();   //콤보박스 값 가져오기
			String show = null;
			show = (String)cBox.getSelectedItem(); 
			String menu_recipe = null;
			try {
				ResultSet rs = stmt.executeQuery("SELECT * FROM mainrecipe WHERE menu = '" + show + "'");   //질의문
				if(rs.next())
					menu_recipe = rs.getString("recipe");   //menu, recipe는 필드명
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			tArea.setText(menu_recipe);  
			changePicutre(show);   //class
		} 
	}
	
	public void comboBoxMenu(JComboBox comboBox) {  
		try {
			ResultSet rs2 = stmt.executeQuery("select * from combomenu");
			while (rs2.next()) {
				String temp = rs2.getString("menulist");
				comboBox.addItem(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	
	public void changePicutre(String name) {      
		ImageIcon icon = new ImageIcon("images/recipe/" + name + ".png");
		pictureLabel.setIcon(icon);
	} 

	public static Connection makeConnection() {
		String connectionUrl = "jdbc:mysql://localhost:3306/data?serverTimezone=UTC&useSSL=false";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			//update, delete, remove 변경
			//excutequery 실행만
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(connectionUrl, "root", "root"); //id/pwd
			System.out.println("DB연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	} 
	
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		DbTest2 f = new DbTest2();
	}

}
