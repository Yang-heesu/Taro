import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Love_result extends Game_result{
	
	ImageIcon bgimage = new ImageIcon("img/Game_room_love.png");
	
	Love_result(){
		panel = this;
		
		setBackground(new Color(255,240,245));

		switch(card_index) {
		case 0:
			content.setText("<html><body>���ſ� ������ ������ �Ű澲�� �� ��,<br>������ ����ġ ���� �ൿ����.</body></html>");
			break;
		case 1:
			content.setText("<html><body>��⸦ ���� �ڽ��� ������ ���� �ൿ�� ��,<br>������ ��ȭ�� �߿��ϴ�.</body></html>");
			break;
		case 2:
			content.setText("<html><body>�����ɺ��� �ڽ��� ����� �߿�� �ϰ�,<Br>�ո����� ����� �ؾ��Ѵ�.</html></body>");
			break;
		case 3:
			content.setText("<html><body>������ ������ �������� ��븦 �����ؼ� �޾Ƶ��� ��.</html></body>");
			break;
		case 4:
			content.setText("<html><body>������ ���� �о�ٿ� ������ ������ ��������.</html></body>");
			break;
		case 5:
			content.setText("<html><body>������ ���� ���� ���Ѻ� ��,<Br>�ŷ��ϴ� ������� ����ϴ� ���� ����.</html></body>");
			break;
		case 6:
			content.setText("<html><body>�ַδ� ��ȸ��, ������ �θ�ƽ�� ����� ã�ƿ� ���̴�.<br>������ �ڽ��� ���� �ൿ�� �ϴ� �� ����.</html></body>");
			break;
		case 7:
			content.setText("<html><body>���� �� �⼼�� ���� �ڽ��� ������ �������� ������!</html></body>");
			break;
		case 8:
			content.setText("<html><body>������ �ݴ볪 ���ذ� �־<br>�ڽ��� ������ ���� �켱�� �ؾ��Ѵ�.</html></body>");
			break;
		case 9:
			content.setText("<html><body>����ϰ� �ൿ���� ����<br>��븦 ���� ������ �ٽ� �ѹ� ������ �����غ���.</html></body>");
			break;
		case 10:
			content.setText("<html><body>�� �� �ٽ� �� �� ���� ������ �´�.<Br>�������� ���� �پ����</html></body>");
			break;
		case 11:
			content.setText("<html><body>�Ӹ��� ���� ����ϴ� ���� �ƴ϶�<br>������ �µ��� ������ ������.</html></body>");
			break;
		case 12:
			content.setText("<html><body>���ο��� ������ ����<br>������ ����� ������ �ϴ� ���� ����.</html></body>");
			break;
		case 13:
			content.setText("<html><body>���踦 �����ؾ� �ϴ� ���� �´� �ص�<br>�������� ���� �ٽ� ����� ����.</html></body>");
			break;
		case 14:
			content.setText("<html><body>���� ������ ������ ���� ����<br>�ڿ������� �帧���� ������ �ؾ��Ѵ�.</html></body>");
			break;
		case 15:
			content.setText("<html><body>��Ȥ�� �Ѹ�ġ�� ����<Br>������ ������� ��ü����� ���� ������ ����.<br>������ �ִٸ� �׿��� ������ ������</html></body>");
			break;
		case 16:
			content.setText("<html><body>�ο� ���̶�� �� ��� ���̿� �ִ� �ӱ���<br>������ Ǯ ������ �ؾ��Ѵ�.</html></body>");
			break;
		case 17:
			content.setText("<html><body>�ް� ��ǥ�� ���� �⵵��,<br>���̵� ��ȹ ���� ������� �͵� ����.</html></body>");
			break;
		case 18:
			content.setText("<html><body>������ �ҹ��� �Ҿ��ϴ���<br>�ڽ��� ������ ����.</html></body>");
			break;
		case 19:
			content.setText("<html><body>������ ������ ���� �ε��� ����.<br>���ο� ���ָ� �ϰ� �Ǹ� ���� �������� ��� ��.</html></body>");
			break;
		case 20:
			content.setText("<html><body>�׵��� ¦����� �ؿԴٸ� ������ ������� �� ���� ���̴�.<br>���ش� ����� ����� �ްų� ù Ű��, ��ȥ�ϱ⿡ ���� �ñ�.</html></body>");
			break;
		case 21:
			content.setText("<html><body>��ʹ� ����� �ִٸ� ��ȥ���� �� ����,<br>¦��� ����� ���� ����� ���� �� �ִ�.</html></body>");
			break;
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
