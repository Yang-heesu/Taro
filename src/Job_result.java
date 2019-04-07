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
			content.setText("<html><body>새로운일, 하고 싶은 일을 할 것.</html></body>");
			break;
		case 1:
			content.setText("<html><body>정보를 착실히 수집하여<br>자신만의 계획을 짤 것.</html></body>");
			break;
		case 2:
			content.setText("<html><body>노력과 연구를 게을리 하지 말고<br>신중히 실행에 옮기는 것이 좋다.</html></body>");
			break;
		case 3:
			content.setText("<html><body>여성 특유의 감각/취미를 살리거나<br>여성을 대상으로 하는 직업을 선택하자.</html></body>");
			break;
		case 4:
			content.setText("<html><body>자신의 능력과 예상을 믿고 활기차게 나가면 좋은 결과를 얻을 것.</html></body>");
			break;
		case 5:
			content.setText("<html><body>하나씩, 착실하게 성과를 쌓아가며 협력자를 찾자.</html></body>");
			break;
		case 6:
			content.setText("<html><body>사람과 협력해 가면 즐겁게 일을 추진해 보도록!</html></body>");
			break;
		case 7:
			content.setText("<html><body>자신의 이상을 실현하기 위해<br>대범하게 도전하도록 하자.</html></body>");
			break;
		case 8:
			content.setText("<html><body>라이벌이나 문제에 흔들리지 말고<Br>바른 판단을 중시하자.</html></body>");
			break;
		case 9:
			content.setText("<html><body>타인에게 얽매이지 말고<br>꾸준히 탐구하고 노력하자.</html></body>");
			break;
		case 10:
			content.setText("<html><body>매너리즘에서 빠져나올 수 있을 듯,<br>변화와 모험을 두려워하지 말자.</html></body>");
			break;
		case 11:
			content.setText("<html><body>객관적이고 냉정한 전망을 갖고 계획을 세울 것.</html></body>");
			break;
		case 12:
			content.setText("<html><body>긍정적인 태도로 실패나<br>트러블을 극복해나가자.</html></body>");
			break;
		case 13:
			content.setText("<html><body>일이 막히면 우선은 기력과 체력을 회복하는 것이 좋다.</html></body>");
			break;
		case 14:
			content.setText("<html><body>차근하게 쌓아 올려가는 것을 중요시 하자.<br>올해 협력자나 자신을 이해해주는 사람을 만날 것이다.</html></body>");
			break;
		case 15:
			content.setText("<html><body>잘난 척하지 말고 나태한 태도는 당장 버리자.</html></body>");
			break;
		case 16:
			content.setText("<html><body>비난이 심해 불행한 시기에는 신중히 행동하도록!</html></body>");
			break;
		case 17:
			content.setText("<html><body>꿈과 목표는 높게 잡도록,<br>아이디어나 기획 쪽을 노려보는 것도 좋다.</html></body>");
			break;
		case 18:
			content.setText("<html><body>강한 힘에 눌린다 해도 평정심을 유지하도록.</html></body>");
			break;
		case 19:
			content.setText("<html><body>다소 무리라도 하고 싶은 일을 하고 싶은 만큼 하자.</html></body>");
			break;
		case 20:
			content.setText("<html><body>시험이나 전직 등 계속 생각해 왔던 일이 있다면<br>결단을 내려야할 것이다.</html></body>");
			break;
		case 21:
			content.setText("<html><body>목표는 높게 잡자,<br>독립이나 유학을 갈 기회가 생길 지도 모른다.</html></body>");
			break;
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
