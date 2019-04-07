import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Room extends JPanel{
	JPanel panel;

	int num = 0;
	int room_index = 0;
	
	Room() {
		panel = this;
		setLayout(null);
		
		init();
	}
	
	Room(int chat_index){
		panel = this;
		setLayout(null);
		
		num = 2;
		init();
	}
	
	private void init() {
		ImageIcon ba = new ImageIcon("img/Bichon_arm.png");
		
		JLabel b = new JLabel(Main.bichon);
		b.setBounds(212, 22, Main.bichon.getIconWidth(), Main.bichon.getIconHeight());
		
		JLabel b_arm = new JLabel(ba);
		b_arm.setBounds(365, 400, ba.getIconWidth(), ba.getIconHeight());
		b_arm.setVisible(false);
		
		JLabel chat = new JLabel("...");
		chat.setOpaque(true);
		chat.setForeground(Color.WHITE);
		chat.setBackground(new Color(0,0,0,155));
		chat.setBounds(45, 520, 800, 150);
		chat.setFont(getFont().deriveFont(20f));
		chat.setHorizontalAlignment(SwingConstants.CENTER);
		chat.setVerticalAlignment(SwingConstants.CENTER);
		
		JButton next_btn = new JButton("▶");
		next_btn.setBounds(770, 600, 50, 50);
		next_btn.setBackground(Color.WHITE);
		next_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(num) {
				case 0:
					chat.setText("비숀타로에 오신 골 화녕함니댜");
					break;
				case 1:
					b.setIcon(Main.bichon_smile1);
					chat.setText("저눈 이고세 주인 비비에오!");
					break;
				case 2:
					b.setIcon(Main.bichon_smile2);
					chat.setText("모가 궁그매서 오셧써여?");
					break;
				case 3:
					b.setIcon(Main.bichon);
					chat.setVisible(false);
					next_btn.setVisible(false);
					select_list(chat,next_btn);
					break;
				case 4:
					chat.setText("구게 궁그매서 오셧꾼뇨!");
					break;
				case 5:
					chat.setText("이제뷰터 카드를 마구마구 섞을게오.");
					break;
				case 6:
					chat.setText("섞은 다움에 마우메 드는 카드가 잇쓰면 하나 골라주떼여.");
					break;
				case 7 :
					b_arm.setVisible(true);
					chat.setText("(카드 섞섞)");
					break;
				case 8 :
					b_arm.setVisible(false);
					b.setIcon(Main.bichon_tongue);
					chat.setText("다 섞엇어여~ 멍멍!!");
					break;
				case 9 :
					if(room_index == 1) Main.change_panel(panel, new Love_room());
					else if(room_index == 2) Main.change_panel(panel, new Money_room());
					else Main.change_panel(panel, new Job_room());
					break;
				}
				num++;
				
				repaint();
				revalidate();
			}
		});
		
		add(b); add(chat); add(next_btn); add(b_arm);
	}
	
	private void select_list(JLabel chat, JButton next_btn) {
		JList<String> list = new JList<>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 다중 선택 모드
		String[] data = {"★직업", "●금전", "♥사랑"};
		list.setListData(data);
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// https://stackoverflow.com/questions/12461627/jlist-fires-valuechanged-twice-when-a-value-is-changed-via-mouse
				if (!e.getValueIsAdjusting()) {
					// 이벤트 클래스 객체에서 제공하는 getSource 메소드를 호출하여 이벤트가 발생한 컴포넌트(여기서는 JList)를 반환받을 수 있음
					JList<String> list = (JList<String>) e.getSource();
					System.out.println((String) list.getSelectedValue());
					
					switch((String) list.getSelectedValue()) {
					case "♥사랑": 
						room_index = 1;
						chat.setText("사랑!");
						break;
					case "●금전" :
						room_index = 2;
						chat.setText("됸!");
						break;
					case "★직업" :
						room_index = 3;
						chat.setText("직업!");
						break;
					}
					chat.setVisible(true);
					next_btn.setVisible(true);
					
					remove(list);
					repaint();
					revalidate();
				}
			}
		});
		list.setForeground(Color.WHITE);
		list.setBackground(new Color(0,0,0,155));
		list.setFont(getFont().deriveFont(25f));
		list.setBounds(45, 520, 800, 150);
		add(list);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Main.bgimage.getImage(),0,0,null);
	}
}
