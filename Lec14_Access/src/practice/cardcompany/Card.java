package practice.cardcompany;

public class Card {
	//받아먹는 번호값
	
	//기본생성자
	Card() {}	//default 생성자 패키지 내에서만 사용가능 public 으로도 쓸수있지않을까
	
	//Company 에서 보낸 cardNumber값을 저장한다
	int cardNumber;
	
		//생성자 인스턴스를 받을때 위에 cardNumber 값을 가져온다.
	Card(int cardNumber){
//		cardNumber++; // 
		//가져온 cardNumber 값을 여기에 cardNumber 값으로 넣어준다
		this.cardNumber = cardNumber;
		//받은 카드넘버값을 private 의 cardNumber 값으로 덮어씌운다
	}
	
	// getter setter
	public int getCardNumber() {
		return cardNumber;
	}

// 여기도 값을 임의변경하지않을거라 없어도 되지않을까
//	public void setCardNumber(int cardNumber) {
//		this.cardNumber = cardNumber;
//	}
	
	
	
	
	
	
	

	
} // end class
