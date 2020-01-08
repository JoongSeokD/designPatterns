package adapterPattern;

public class TestPattern {
	public static void main(String[] args) {
		APlayer player1 = new APlayerImpl();
		player1.play("aaa.mp3");
		
		BPlayer player2 = new BPlayerImpl();
		player2.playFile("bbb.mp3");
		
		player1 = new BToAAdpter();
		player1.play("ccc.mp3");
	}
}
