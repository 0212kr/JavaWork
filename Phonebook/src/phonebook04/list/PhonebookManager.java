package phonebook04.list;


import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.text.PlainDocument;

// CONTROLLER 객체
//   어플리케이션의 동작, 데이터 처리(CRUD), (Business logic 담당)
public class PhonebookManager implements Pb {

	private ArrayList<PhonebookModel> pbList = new ArrayList<PhonebookModel>();
	
	// singleton적용
	private PhonebookManager() {}
	private static PhonebookManager instance = null;
	public static PhonebookManager getInstance() {
		if (instance == null) {
			instance = new PhonebookManager();
		}
		return instance;
	} // end getInstance()	
	
	
	
	// 전화번호부 생성 등록
	@Override
	public int insert(String name, String phoneNum, String memo) {
		
		
		// 매개변수 검증 : 이름 필수
		if (name == null || name.trim().length() == 0) {
			throw new PhonebookException("insert() 이름입력오류 : ",Pb.ERR_EMPTY_STRING);
		}
		
		PhonebookModel phoneA = new PhonebookModel(name, phoneNum, memo);
		
		pbList.add(phoneA);
		phoneA.setUid(getMaxUid()+1);
		
		return 1;
	}

	@Override
	public PhonebookModel[] selectAll() {
		PhonebookModel [] a = new PhonebookModel[pbList.size()];
		for (int i = 0; i < pbList.size(); i++) {
			a[i] = pbList.get(i);
		}
		
		return a;
		// return pbList.toArray(new PhonebookMedel[pbList.size()];
	}
	
	
	//특정 uid의 데이터 검색 리턴
	//못찾으면 null 리턴
	
	@Override
	public PhonebookModel selectByUid(int uid) {
		for (int i = 0; i < pbList.size(); i++) {
			if (pbList.get(i).getUid() == uid) {
				return pbList.get(i);
			}
		}
		
		
		return null; // 못찾으면 null 리턴
	}

	@Override
	public int updateByUid(int uid, String name, String phoneNum, String memo) {
		
		//매개변수 검증
		if (uid < 1) 
			throw new PhonebookException("update() uid 오류 : "+uid,Pb.ERR_UID);			// 고유저장값이있는지
		if (name == null || name.trim().length() == 0) throw new PhonebookException("update() 이름입력 오류 : ",Pb.ERR_EMPTY_STRING);	//이름이 들어가있는지
		
		// 특정 uid 값을 가진 데이터의 배열 인덱스 찾기
		int index = findIndexByUid(uid);
		if (index < 0) 
			throw new PhonebookException("update() 없는 uid : "+uid,Pb.ERR_UID);
		
		pbList.get(index).setName(name);
		pbList.get(index).setPhoneNum(phoneNum);
		pbList.get(index).setMemo(memo);
		
		
		return 1;
	}

	@Override
	public int deleteByUid(int uid) {

		
		// 매개변수 검증
		if(uid < 1)
			throw new PhonebookException("deleteByUid 오류 : "+uid,Pb.ERR_UID);			// 고유저장값이있는지;
		
		int index = findIndexByUid(uid);
		if(index < 0)
			throw new PhonebookException("deleteByUid 오류 : "+uid,Pb.ERR_UID);			// 고유저장값이있는지;
		
		pbList.remove(index);

		
		
		
		return 1;
	}
	
	//현재 데이터중 가장 큰 uid 값을 찾아서 리턴
	private int getMaxUid() {
		int maxUid = 0;
		int a = pbList.size();
		for (int i = 0; i < pbList.size(); i++) {
			if (maxUid < pbList.get(i).getUid()) {
				maxUid = pbList.get(i).getUid();	
			}
		}

		
		return maxUid;
	}
	
	
	// 특정 uid 값을 가진 데이터의 배열 인덱스 찾기
	private int findIndexByUid(int uid) {
		
		for (int index = 0; index < pbList.size(); index++) {
			if (pbList.get(index).getUid() == uid) {
				return index;		
			}
		}
		
		return -1;
	}
	
	
	
	
	
	
	
	
}


// 예외 클래스 정의
// 예외발생하면 '에러코드' + '에러메세지'를 부여하여 관리하는게 좋다.
// 클래스로 이름은 PhonbookException 에러받을거야 extends 어떤에러를 RuntimeException 을
class PhonebookException extends RuntimeException{
	private int errCord = Pb.ERR_GENERIC;
	
	public PhonebookException() {
		super("Phonebook 예외 발생");
	}
	
	public PhonebookException(String msg) {
		super(msg);
	}
	
	public PhonebookException(String msg, int errCord) {
		super(msg);
		this.errCord = errCord;
	}
	
	// Throwable 의 getMassage 를 오버리이딩 가능
	@Override
	public String getMessage() {
		String msg = " ERR-"+errCord+"]"+Pb.ERR_STR[errCord]+
				" "+super.getMessage();
		return super.getMessage();
	}
	
	
}

