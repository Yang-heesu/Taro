import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Money_result extends Game_result{
	
	ImageIcon bgimage = new ImageIcon("img/Game_room_money.png");
	
	Money_result(){
		panel = this;
		
		setBackground(new Color(240,248,255));
		
		switch(card_index) {
		case 0:
			content.setText("<html><body>���� �ʹ� ���������� �� ��.</html></body>");
			break;
		case 1:
			content.setText("<html><body>�������� ����<br>�ʿ��� �Ϳ� ���� �� ���� ���� �߿��ϴ�.</html></body>");
			break;
		case 2:
			content.setText("<html><body>ȭ���� �Ѻ��ٴ�<br>�������� ������ �켱�� ����.</html></body>");
			break;
		case 3:
			content.setText("<html><body>�λ��ϰ� ���� ���� ��ܶ�,<br>�ռ� ���� �����̳� �丮�� ����.</html></body>");
			break;
		case 4:
			content.setText("<html><body>�㼼�� �θ����� ������ ������ �� �� �߽��� ��.</html></body>");
			break;
		case 5:
			content.setText("<html><body>�����ο� ��ȹ�� ���� ��, �ǿ����� ������ ����.</html></body>");
			break;
		case 6:
			content.setText("<html><body>�ǿ뼺���ٴ� ���� �ְ� ������ ǳ�������� ������.</html></body>");
			break;
		case 7:
			content.setText("<html><body>�ݵ�� �տ� �ְڴٴ� ���� ������ ���� ������ ���� ���� �����.</html></body>");
			break;
		case 8:
			content.setText("<html><body>�� �� �������̶�� ���� ������<br>���� ��ε� ���� ������ ����.</html></body>");
			break;
		case 9:
			content.setText("<html><body>å, ����, �̼� ���� �� �������� ������ ���� �Ẹ��.</html></body>");
			break;
		case 10:
			content.setText("<html><body>�������� ������ �̺�Ʈ�� ã�ƿ���<br>��ġ�� ���� �����ؾ��Ѵ�.</html></body>");
			break;
		case 11:
			content.setText("<html><body>�λ�� ��ʴ� ���� ����.<br>���Һ� ������.</html></body>");
			break;
		case 12:
			content.setText("<html><body>�˼��԰� ������ �߿��ϴ�.<br>����ؼ� ���� ���� ������ ������!</html></body>");
			break;
		case 13:
			content.setText("<html><body>���������� ������� �� ���� ��ƿ ��.</html></body>");
			break;
		case 14:
			content.setText("<html><body>ģ������ ����� �ʴ���<br>���� ���� ������ ��� ������ �ຸ��.</html></body>");
			break;
		case 15:
			content.setText("<html><body>��ɺθ��� �� ��.<br>�������� ��Ʈ���� �ؼҴ� �Ұ����ϴ� �ٸ� ������ �ؼ��غ���.</html></body>");
			break;
		case 16:
			content.setText("<html><body>���� �߿��� ���� �Ҿ�����ų� ������ ���ɼ��� ������ ����!</html></body>");
			break;
		case 17:
			content.setText("<html><body>���� �;��� �����̳� ���� ��,<br>���Ƿ� �̷� �� �ִ� ������ ã�ƿ� ���̴�.</html></body>");
			break;
		case 18:
			content.setText("<html><body>���� �� �� Ÿ������ ������,<br>��ȹ���� ������ ������ ��.</html></body>");
			break;
		case 19:
			content.setText("<html><body>��ΰ� �������� ū ������ �������.<Br>���� ��� ����̳� �Ͱ���.</html></body>");
			break;
		case 20:
			content.setText("<html><body>��ҿ� �ż��� �� ������� ������ ������ ���� ������ �ǳ�����.<br>���� ���ݾ� �����س���.</html></body>");
			break;
		case 21:
			content.setText("<html><body>��ĺ��� ������ ������ ����.<br>���ش� ������� ����, ���థ ��ȸ�� ���� ���̴�.</html></body>");
			break;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
