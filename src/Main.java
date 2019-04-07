import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Main {
	private static JFrame frame = new JFrame();
	
	static ImageIcon bgimage = new ImageIcon("img/Game_screen.png");
	static ImageIcon bichon = new ImageIcon("img/Bichon.png");
	static ImageIcon bichon_tongue = new ImageIcon("img/Bichon_tongue.png");
	static ImageIcon bichon_smile1 = new ImageIcon("img/Bichon_smile1.png");
	static ImageIcon bichon_smile2 = new ImageIcon("img/Bichon_smile2.png");
	
	public static void main(String[] args) {
		frame.setTitle("∫Òºı≈∏∑Œ");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image Icon_img = toolkit.getImage("img/Icon_img.png");
		frame.setIconImage(Icon_img);
		frame.setPreferredSize(new Dimension(905, 735));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
//		frame.add(new Title());
		frame.add(new Love_result());
	
		frame.pack();
		frame.setVisible(true);
		
		new Music_loop();
	}
	
	public static void change_panel(JPanel removePanel, JPanel addPanel) {
		frame.add(addPanel);
		frame.remove(removePanel);
		frame.repaint();
		frame.revalidate();
	}
}
