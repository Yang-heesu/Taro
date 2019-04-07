import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music_loop extends Thread{
	public Music_loop() {
		while(true) {
			try {
				Player p = new Player(new FileInputStream("music/Fairy_Meeting.mp3"));
				p.play();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
