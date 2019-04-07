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
		
		JButton next_btn = new JButton("��");
		next_btn.setBounds(770, 600, 50, 50);
		next_btn.setBackground(Color.WHITE);
		next_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(num) {
				case 0:
					chat.setText("���Ÿ�ο� ���� �� ȭ���Դϴ�");
					break;
				case 1:
					b.setIcon(Main.bichon_smile1);
					chat.setText("���� �̰� ���� ��񿡿�!");
					break;
				case 2:
					b.setIcon(Main.bichon_smile2);
					chat.setText("�� �ñ׸ż� ���˽Ῡ?");
					break;
				case 3:
					b.setIcon(Main.bichon);
					chat.setVisible(false);
					next_btn.setVisible(false);
					select_list(chat,next_btn);
					break;
				case 4:
					chat.setText("���� �ñ׸ż� ���˲۴�!");
					break;
				case 5:
					chat.setText("�������� ī�带 �������� �����Կ�.");
					break;
				case 6:
					chat.setText("���� �ٿ� ����� ��� ī�尡 �վ��� �ϳ� ����ֶ���.");
					break;
				case 7 :
					b_arm.setVisible(true);
					chat.setText("(ī�� ����)");
					break;
				case 8 :
					b_arm.setVisible(false);
					b.setIcon(Main.bichon_tongue);
					chat.setText("�� �����~ �۸�!!");
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
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // ���� ���� ���
		String[] data = {"������", "�ܱ���", "�����"};
		list.setListData(data);
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// https://stackoverflow.com/questions/12461627/jlist-fires-valuechanged-twice-when-a-value-is-changed-via-mouse
				if (!e.getValueIsAdjusting()) {
					// �̺�Ʈ Ŭ���� ��ü���� �����ϴ� getSource �޼ҵ带 ȣ���Ͽ� �̺�Ʈ�� �߻��� ������Ʈ(���⼭�� JList)�� ��ȯ���� �� ����
					JList<String> list = (JList<String>) e.getSource();
					System.out.println((String) list.getSelectedValue());
					
					switch((String) list.getSelectedValue()) {
					case "�����": 
						room_index = 1;
						chat.setText("���!");
						break;
					case "�ܱ���" :
						room_index = 2;
						chat.setText("��!");
						break;
					case "������" :
						room_index = 3;
						chat.setText("����!");
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
