import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Title extends JPanel{
	private ImageIcon bgimage = new ImageIcon("img/Title.png");
	private ImageIcon title_word = new ImageIcon("img/Title_word.png");
	private JPanel panel;
	
	public Title(){
		panel = this;
		
		setLayout(new BorderLayout());
		
		Title_word();
		word();
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Main.change_panel(panel, new Room());
			}
		});
	}
	
	private void Title_word(){
		JLabel tw = new JLabel(title_word);
		add(tw, BorderLayout.CENTER);
	}
	
	private void word() {
		JLabel sb = new JLabel("made by 'Yang Hee Su'");
		sb.setForeground(Color.WHITE);
		sb.setFont(getFont().deriveFont(12f));
		sb.setHorizontalAlignment(SwingConstants.CENTER);
		sb.setVerticalAlignment(SwingConstants.CENTER);

		JLabel sb2 = new JLabel("※주의 : 실제 타로와 다릅니다");
		sb2.setForeground(Color.WHITE);
		sb2.setFont(getFont().deriveFont(12f));
		sb2.setHorizontalAlignment(SwingConstants.CENTER);
		sb2.setVerticalAlignment(SwingConstants.CENTER);
		
		add(sb, BorderLayout.SOUTH);
		add(sb2,BorderLayout.NORTH);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
