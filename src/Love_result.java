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
			content.setText("<html><body>과거와 외적인 조건을 신경쓰지 말 것,<br>뒷일을 개의치 말고 행동부터.</body></html>");
			break;
		case 1:
			content.setText("<html><body>용기를 갖고 자신의 직감에 따라 행동할 것,<br>유쾌한 대화가 중요하다.</body></html>");
			break;
		case 2:
			content.setText("<html><body>자존심보다 자신의 기분을 중요시 하고,<Br>합리적인 사랑을 해야한다.</html></body>");
			break;
		case 3:
			content.setText("<html><body>따뜻한 마음과 애정으로 상대를 리드해서 받아들일 것.</html></body>");
			break;
		case 4:
			content.setText("<html><body>정열을 갖고 밀어붙여 상대방의 마음을 움직이자.</html></body>");
			break;
		case 5:
			content.setText("<html><body>성급해 하지 말고 지켜볼 것,<Br>신뢰하는 사람에게 상담하는 것이 좋다.</html></body>");
			break;
		case 6:
			content.setText("<html><body>솔로는 기회가, 연인은 로맨틱한 사랑이 찾아올 것이다.<br>직감과 자신의 뜻대로 행동을 하는 게 좋다.</html></body>");
			break;
		case 7:
			content.setText("<html><body>지금 이 기세를 몰아 자신의 마음을 직설적을 전하자!</html></body>");
			break;
		case 8:
			content.setText("<html><body>주위의 반대나 방해가 있어도<br>자신의 마음을 가장 우선시 해야한다.</html></body>");
			break;
		case 9:
			content.setText("<html><body>경솔하게 행동하지 말고<br>상대를 향한 마음을 다시 한번 곰곰이 생각해보자.</html></body>");
			break;
		case 10:
			content.setText("<html><body>두 번 다시 올 수 없을 찬스가 온다.<Br>주저하지 말고 뛰어들자</html></body>");
			break;
		case 11:
			content.setText("<html><body>머리를 굴려 사랑하는 것이 아니라<br>성실한 태도로 상대방을 대하자.</html></body>");
			break;
		case 12:
			content.setText("<html><body>괴로워도 상대방을 위해<br>뭔가를 희생할 각오를 하는 것이 좋다.</html></body>");
			break;
		case 13:
			content.setText("<html><body>관계를 정리해야 하는 날이 온다 해도<br>절망하지 말고 다시 출발을 하자.</html></body>");
			break;
		case 14:
			content.setText("<html><body>관계 전진에 조급해 하지 말고<br>자연스러운 흐름으로 교제를 해야한다.</html></body>");
			break;
		case 15:
			content.setText("<html><body>유혹을 뿌리치지 못해<Br>의지와 관계없는 육체관계는 맺지 말도록 하자.<br>연인이 있다면 그에게 집착을 버리자</html></body>");
			break;
		case 16:
			content.setText("<html><body>싸울 것이라면 두 사람 사이에 있는 앙금을<br>완전히 풀 각오로 해야한다.</html></body>");
			break;
		case 17:
			content.setText("<html><body>꿈과 목표는 높게 잡도록,<br>아이디어나 기획 쪽을 노려보는 것도 좋다.</html></body>");
			break;
		case 18:
			content.setText("<html><body>질투나 소문에 불안하더라도<br>자신의 마음을 믿자.</html></body>");
			break;
		case 19:
			content.setText("<html><body>마음을 감추지 말고 부딪혀 보자.<br>새로운 연애를 하게 되면 열린 마음으로 사귈 것.</html></body>");
			break;
		case 20:
			content.setText("<html><body>그동안 짝사랑을 해왔다면 애정을 보상받을 수 있을 것이다.<br>올해는 당신이 고백을 받거나 첫 키스, 결혼하기에 좋은 시기.</html></body>");
			break;
		case 21:
			content.setText("<html><body>사귀는 사람이 있다면 결혼까지 갈 수도,<br>짝사랑 상대라면 좋은 결과를 얻을 수 있다.</html></body>");
			break;
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
