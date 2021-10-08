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
	private JComboBox comboBox = null;
	private JLabel commentLabel, pictureLabel;
	Statement stmt;
	Connection con;
	
	public DbTest2() {
		///// DB 연결 
		con = makeConnection();
		try {
			stmt = con.createStatement(); //prepared로 바꿀 수 있음
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레시피야!");

		// 위쪽 핑크 패널
		comboBox = new JComboBox();
		comboBoxMenu(comboBox) ;
		commentLabel = new JLabel("메뉴를 고르세요");
		comboPanel = new JPanel(new FlowLayout()); // 콤보박스 
		comboPanel.setBackground(Color.pink);
		comboPanel.add(comboBox);
		comboPanel.add(commentLabel); // 좌측메뉴 라벨
		
		// comboBox에 이벤트 추가
		comboBox.addActionListener(new ManuSelectListener() );
		
		// 아래쪽 시안컬러 recipePanel 패널
		recipePanel = new RecipePanel();   // 아래에 내부 클래스 있음
		
		add(comboPanel, BorderLayout.NORTH);
		add(recipePanel, BorderLayout.CENTER);
		
		setSize(700, 500);
		setVisible(true);
	} // DBTest 생성자

	//// RecipePanel 클래스
	class RecipePanel extends JPanel {
		private JLabel recipe;
		public RecipePanel() {
			setLayout(null);
			setBackground(Color.CYAN);
			
			recipe = new JLabel();
			recipe.setFont(new Font("HYHeadLine", Font.BOLD, 15));
			recipe.setText("요리 완성 사진");
			recipe.setBounds(150, 10, 100, 200);
			add(recipe); 
			
			pictureLabel = new JLabel(); // 그림 레이블
			pictureLabel.setBounds(300, 50, 150,150);
			changePicutre("start");       // 아래에 메소드 있음
			add(pictureLabel);
			
			tArea = new JTextArea("여기에 레서피를 보여드립니다");
			tArea.setBackground(Color.pink);
			JScrollPane scrollPane = new JScrollPane(tArea);
			scrollPane.setBounds(50, 210, 600, 200);
			add(scrollPane);
		}
	} //class RecipePanel

	//// 이벤트 리스너 클래스
	class ManuSelectListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) { // DB에서 레시피 가져오는 부분
			JComboBox cBox = (JComboBox) e.getSource(); // 이벤트에서 콤보박스 가져오기
			String show = null;
			show = (String)cBox.getSelectedItem(); // cBox랑 비교
			String menu_recipe = null;
			ResultSet rs = null;
			try {
				rs = stmt.executeQuery("SELECT * FROM mainrecipe where menu = '" + show + "'");
				
				if(rs.next())
					menu_recipe = rs.getString("recipe");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			/*try {   // 참고-insert, primary key 중복안됨
				stmt.executeUpdate("insert into mainrecipe values('인보면3','요미요미')");
				stmt.executeUpdate("insert into combomenu values('인보면3')");
			} catch (Exception e2) {
				// TODO: handle exception
			}*/
			tArea.setText(menu_recipe);  // 레시피 출력 vs. append(menu_recipe);
			changePicutre(show); // 이미지 바꾸기
		} //actionPerformed
	} //ManuSelectListener
	
	//// 콤보박스 메뉴 DB로부터 읽어 들이기
	public void comboBoxMenu(JComboBox comboBox) {  
		ResultSet rs2 = null;
		try {
			rs2 = stmt.executeQuery("select * from combomenu");
			while (rs2.next()) {
				String temp = new String();
				temp = rs2.getString("menulist");
				comboBox.addItem(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} //comboBoxMenu
	
	public void changePicutre(String name) {      // 이미지 아이콘 체인지
		ImageIcon icon = new ImageIcon("images/recipe/" + name + ".png");
		pictureLabel.setIcon(icon);
	} //changePicutre

	//// DB 연결
	public static Connection makeConnection() {
		String connectionUrl = "jdbc:mysql://localhost:3306/data?serverTimezone=UTC&useSSL=false";
							//dbms는 mysql://내 포트는 3306/데이터베이스이름?
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
	} //makeConnection
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		DbTest2 f = new DbTest2();
	}

}
