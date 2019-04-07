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
			content.setText("<html><body>돈에 너무 연연해하지 말 것.</html></body>");
			break;
		case 1:
			content.setText("<html><body>낭비하지 말고<br>필요한 것에 돈을 잘 쓰는 것이 중요하다.</html></body>");
			break;
		case 2:
			content.setText("<html><body>화려한 겉보다는<br>정신적인 만족을 우선시 하자.</html></body>");
			break;
		case 3:
			content.setText("<html><body>인색하게 굴지 말고 즐겨라,<br>손수 만든 선물이나 요리가 좋다.</html></body>");
			break;
		case 4:
			content.setText("<html><body>허세를 부리더라도 양질의 물건을 좀 더 중시할 것.</html></body>");
			break;
		case 5:
			content.setText("<html><body>여유로운 계획을 세울 것, 실용적인 물건을 고르자.</html></body>");
			break;
		case 6:
			content.setText("<html><body>실용성보다는 꿈이 있고 정서가 풍부해지는 물건을.</html></body>");
			break;
		case 7:
			content.setText("<html><body>반드시 손에 넣겠다는 강한 의지를 갖고 나가면 좋은 일이 생긴다.</html></body>");
			break;
		case 8:
			content.setText("<html><body>싼 게 비지떡이라는 말을 유념해<br>조금 비싸도 좋은 물건을 고르자.</html></body>");
			break;
		case 9:
			content.setText("<html><body>책, 음악, 미술 전시 등 정신적인 만족에 돈을 써보자.</html></body>");
			break;
		case 10:
			content.setText("<html><body>돌발적인 권유나 이벤트가 찾아오면<br>놓치지 말고 참가해야한다.</html></body>");
			break;
		case 11:
			content.setText("<html><body>인사와 답례는 잊지 말자.<br>과소비를 피하자.</html></body>");
			break;
		case 12:
			content.setText("<html><body>검소함과 절약이 중요하다.<br>고생해서 모은 돈은 신중히 쓰도록!</html></body>");
			break;
		case 13:
			content.setText("<html><body>경제적으로 힘들더라도 꾹 참고 버틸 것.</html></body>");
			break;
		case 14:
			content.setText("<html><body>친구에게 비싸지 않더라도<br>직접 만든 마음이 담긴 선물을 줘보자.</html></body>");
			break;
		case 15:
			content.setText("<html><body>욕심부리지 말 것.<br>쇼핑으로 스트레스 해소는 불가능하니 다른 쪽으로 해소해보자.</html></body>");
			break;
		case 16:
			content.setText("<html><body>돈과 중요한 것을 잃어버리거나 망가질 가능성이 있으니 주의!</html></body>");
			break;
		case 17:
			content.setText("<html><body>갖고 싶었던 물건이나 여행 등,<br>현실로 이룰 수 있는 찬스가 찾아올 것이다.</html></body>");
			break;
		case 18:
			content.setText("<html><body>물건 고를 때 타협하지 말도록,<br>계획적인 지출을 염두할 것.</html></body>");
			break;
		case 19:
			content.setText("<html><body>비싸고 움직임이 큰 물건을 사용하자.<Br>예를 들면 목걸이나 귀걸이.</html></body>");
			break;
		case 20:
			content.setText("<html><body>평소에 신세를 진 사람에게 감사의 마음을 담은 선물을 건네주자.<br>돈을 조금씩 저축해놓자.</html></body>");
			break;
		case 21:
			content.setText("<html><body>상식보단 센스로 선물을 고르자.<br>올해는 여행운이 좋아, 여행갈 기회가 생길 것이다.</html></body>");
			break;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgimage.getImage(),0,0,null);
	}
}
