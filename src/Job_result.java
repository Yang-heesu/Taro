import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Job_result extends Game_result{
	
	ImageIcon bgimage = new ImageIcon("img/Game_room_job.png");
	
	Job_result(){
		panel = this;
		
		setBackground(new Color(230,230,250));
		
		switch(card_index) {
		case 0:
			content.setText("<html><body>���ο���, �ϰ� ���� ���� �� ��.</html></body>");
			break;
		case 1:
			content.setText("<html><body>������ ������ �����Ͽ�<br>�ڽŸ��� ��ȹ�� © ��.</html></body>");
			break;
		case 2:
			content.setText("<html><body>��°� ������ ������ ���� ����<br>������ ���࿡ �ű�� ���� ����.</html></body>");
			break;
		case 3:
			content.setText("<html><body>���� Ư���� ����/��̸� �츮�ų�<br>������ ������� �ϴ� ������ ��������.</html></body>");
			break;
		case 4:
			content.setText("<html><body>�ڽ��� �ɷ°� ������ �ϰ� Ȱ������ ������ ���� ����� ���� ��.</html></body>");
			break;
		case 5:
			content.setText("<html><body>�ϳ���, �����ϰ� ������ �׾ư��� �����ڸ� ã��.</html></body>");
			break;
		case 6:
			content.setText("<html><body>����� ������ ���� ��̰� ���� ������ ������!</html></body>");
			break;
		case 7:
			content.setText("<html><body>�ڽ��� �̻��� �����ϱ� ����<br>����ϰ� �����ϵ��� ����.</html></body>");
			break;
		case 8:
			content.setText("<html><body>���̹��̳� ������ ��鸮�� ����<Br>�ٸ� �Ǵ��� �߽�����.</html></body>");
			break;
		case 9:
			content.setText("<html><body>Ÿ�ο��� �������� ����<br>������ Ž���ϰ� �������.</html></body>");
			break;
		case 10:
			content.setText("<html><body>�ųʸ��򿡼� �������� �� ���� ��,<br>��ȭ�� ������ �η������� ����.</html></body>");
			break;
		case 11:
			content.setText("<html><body>�������̰� ������ ������ ���� ��ȹ�� ���� ��.</html></body>");
			break;
		case 12:
			content.setText("<html><body>�������� �µ��� ���г�<br>Ʈ������ �غ��س�����.</html></body>");
			break;
		case 13:
			content.setText("<html><body>���� ������ �켱�� ��°� ü���� ȸ���ϴ� ���� ����.</html></body>");
			break;
		case 14:
			content.setText("<html><body>�����ϰ� �׾� �÷����� ���� �߿�� ����.<br>���� �����ڳ� �ڽ��� �������ִ� ����� ���� ���̴�.</html></body>");
			break;
		case 15:
			content.setText("<html><body>�߳� ô���� ���� ������ �µ��� ���� ������.</html></body>");
			break;
		case 16:
			content.setText("<html><body>���� ���� ������ �ñ⿡�� ������ �ൿ�ϵ���!</html></body>");
			break;
		case 17:
			content.setText("<html><body>�ް� ��ǥ�� ���� �⵵��,<br>���̵� ��ȹ ���� ������� �͵� ����.</html></body>");
			break;
		case 18:
			content.setText("<html><body>���� ���� ������ �ص� �������� �����ϵ���.</html></body>");
			break;
		case 19:
			content.setText("<html><body>�ټ� ������ �ϰ� ���� ���� �ϰ� ���� ��ŭ ����.</html></body>");
			break;
		case 20:
			content.setText("<html><body>�����̳� ���� �� ��� ������ �Դ� ���� �ִٸ�<br>����� �������� ���̴�.</html></body>");
			break;
		case 21:
			content.setText("<html><body>��ǥ�� ���� ����,<br>�����̳� ������ �� ��ȸ�� ���� ���� �𸥴�.</html></body>");
			break;
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
