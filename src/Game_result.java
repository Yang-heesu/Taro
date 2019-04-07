import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Game_result extends JPanel{
	ImageIcon card[] = {new ImageIcon("img/card_0.png"),new ImageIcon("img/card_1.png"),new ImageIcon("img/card_2.png"),new ImageIcon("img/card_3.png"),
			new ImageIcon("img/card_4.png"),new ImageIcon("img/card_5.png"),new ImageIcon("img/card_6.png"),new ImageIcon("img/card_7.png"),
			new ImageIcon("img/card_8.png"),new ImageIcon("img/card_9.png"),new ImageIcon("img/card_10.png"),new ImageIcon("img/card_11.png"),
			new ImageIcon("img/card_12.png"),new ImageIcon("img/card_13.png"),new ImageIcon("img/card_14.png"),new ImageIcon("img/card_15.png"),
			new ImageIcon("img/card_16.png"),new ImageIcon("img/card_17.png"),new ImageIcon("img/card_18.png"),new ImageIcon("img/card_19.png"),
			new ImageIcon("img/card_20.png"),new ImageIcon("img/card_21.png")};
	
	JLabel card_view = new JLabel();
	JLabel title = new JLabel();
	JLabel content = new JLabel();
	JButton re = new JButton("다시하기");
	JPanel panel;
	
	int card_index = 0;
	
	Game_result(){
		setLayout(null);
		
		Random random = new Random();
		card_index = random.nextInt(22);
		
		card_view.setVerticalAlignment(SwingConstants.CENTER);
		card_view.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.CENTER);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("굴림",Font.BOLD,30));
		title.setOpaque(true);
		title.setBackground(Color.WHITE);
		content.setVerticalAlignment(SwingConstants.CENTER);
		content.setHorizontalAlignment(SwingConstants.CENTER);
		content.setFont(new Font("굴림",Font.PLAIN,15));
		content.setOpaque(true);
		content.setBackground(Color.WHITE);
		re.setVerticalAlignment(SwingConstants.CENTER);
		re.setHorizontalAlignment(SwingConstants.CENTER);
		re.setLayout(null);
		re.setBounds(100, 100, 100, 50);
		re.setFont(new Font("굴림",Font.PLAIN,15));
		re.setBackground(Color.WHITE);
		
		card_view.setBounds(50, 50, 400, 600);
		title.setBounds(515, 100, 300, 50);
		content.setBounds(520, 200, 300, 290);
		re.setBounds(520, 540, 300, 50);
		
		add(card_view);
		add(title);
		add(content);
		add(re);
		
		re.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.change_panel(panel, new Room(1));
			}
		});
		
		switch(card_index) {
		case 0:
			card_view.setIcon(card[0]);
			title.setText("광대");
			break;
		case 1:
			card_view.setIcon(card[1]);
			title.setText("마법사");
			break;
		case 2:
			card_view.setIcon(card[2]);
			title.setText("대사제");
			break;
		case 3:
			card_view.setIcon(card[3]);
			title.setText("여제");
			break;
		case 4:
			card_view.setIcon(card[4]);
			title.setText("황제");
			break;
		case 5:
			card_view.setIcon(card[5]);
			title.setText("교황");
			break;
		case 6:
			card_view.setIcon(card[6]);
			title.setText("연인");
			break;
		case 7:
			card_view.setIcon(card[7]);
			title.setText("전차");
			break;
		case 8:
			card_view.setIcon(card[8]);
			title.setText("힘");
			break;
		case 9:
			card_view.setIcon(card[9]);
			title.setText("은둔자");
			break;
		case 10:
			card_view.setIcon(card[10]);
			title.setText("운명의 수레바퀴");
			break;
		case 11:
			card_view.setIcon(card[11]);
			title.setText("정의");
			break;
		case 12:
			card_view.setIcon(card[12]);
			title.setText("매달린 사람");
			break;
		case 13:
			card_view.setIcon(card[13]);
			title.setText("죽음");
			break;
		case 14:
			card_view.setIcon(card[14]);
			title.setText("절제");
			break;
		case 15:
			card_view.setIcon(card[15]);
			title.setText("악마");
			break;
		case 16:
			card_view.setIcon(card[16]);
			title.setText("탑");
			break;
		case 17:
			card_view.setIcon(card[17]);
			title.setText("별");
			break;
		case 18:
			card_view.setIcon(card[18]);
			title.setText("달");
			break;
		case 19:
			card_view.setIcon(card[19]);
			title.setText("태양");
			break;
		case 20:
			card_view.setIcon(card[20]);
			title.setText("심판");
			break;
		case 21:
			card_view.setIcon(card[21]);
			title.setText("세계");
			break;
		}
	}
}
