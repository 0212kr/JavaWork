package practice.cardcompany;

public class Company {
	
	//기본생성자
	private Company() {}
	
	//여기서만 사용하고 하나만쓰는 인트타입 cardNumber 를 10000으로 초기화;
	private static int cardNumber = 10000;
	
	//회사의 고유값 정하기
	//Main 에 처음나오는 싱글톤패턴을 만들기위해 여기서만 사용가능한 범위를설정
	//여기도 한개만으로 운용할거라 static 두개이상의 변수로 이용불가
	//처음 초기화하면 primitive 타입이 아니여서 null 로 초기화
	private static Company instance = null;
	
	//instance 가 null이면 new 로 초기화하면 null이기에 값은 null로 고정
	//다른값이 들어있다면 다른값으로 리턴시켜 그값을 계속 유지
	public static Company getInstance() {
		if (instance == null ) {
			instance = new Company();
		}
		return instance;
	}

//	10000부터 하나씩올라갈거고 값을 변경하지않을거라 set 을 안해도될거같음
//	public static void setInstance(Company instance) {
//		Company.instance = instance;
//	}

	//createCard 생성
	//카드의 올라가는 번호값은 회사에서 지정해줘야함
	//Card 클래스 cardNumber 에 현재cardNumber 값에 +1을한 값을
	//Card 클래스에 cardNumber 값에 넣어준다 넣어주기전에 원래있던 Card값을 초기화시켜준다
	public Card createCard() {
		cardNumber++;	//처음 값을 받으면서 +1 을하고 값을 보내준다
		return new Card(Company.cardNumber);
	}
	
	
	
} // end class
