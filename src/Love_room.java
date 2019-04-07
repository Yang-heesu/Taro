import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Love_room extends JPanel{
	JPanel panel;
	
	ImageIcon bgimage = new ImageIcon("img/Game_room_love.png");
	ImageIcon c = new ImageIcon("img/Taro_card_love.png");
	
	public Love_room() {
		panel = this;
		
		setBackground(new Color(255,240,245));
		
		setLayout(new GridLayout(4, 6));
		
		JButton[] card = new JButton[22]; 
		
		for (int i = 0; i < card.length; i++) {
			card[i] = new JButton(c);
			card[i].setBorderPainted(false);
			card[i].setContentAreaFilled(false);
			card[i].setFocusPainted(false);
			card[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Main.change_panel(panel, new Love_result());
				}
			});
			
            add(card[i]);
        }
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
