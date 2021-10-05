package T211005;

class Player {
	int score;
	private String name;
	
	void play() {
		System.out.println(name + "가 플레이합니다");
	}
	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
	Player(){
		this("나가자", 100);
		System.out.println("기본 생성자가 콜!");
	}
}
public class PlayerExam3 {
	public static void main(String[] args) {
		Player p1 = new Player("나인보",90);
		Player p2 = new Player("이명지",88);
		Player p3 = new Player();
		
		p1.play();
		p2.play();
		p3.play();
	}
}