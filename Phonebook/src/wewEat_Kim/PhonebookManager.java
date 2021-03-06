package wewEat_Kim;


import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// CONTROLLER 객체
//   어플리케이션의 동작, 데이터 처리(CRUD), (Business logic 담당)
public class PhonebookManager implements Pb, Closeable {
	
	//읽어야하는것
	public static final String PB_DATA_DIR = "data";
	public static final String PB_DATE_FILE = "phonebook.dat";
	private File wsweData;
	private File pbFile;
	
	private ArrayList<PhonebookModel> pbList = new ArrayList<PhonebookModel>();
	
	// singleton적용
	private PhonebookManager() {
		
		wsweData = new File(PB_DATA_DIR);
		if(!wsweData.exists()) {
			if(wsweData.mkdir()) {
				System.out.println("폴더 생성 성공");
			}else {
				System.out.println("폴더 생성 실패");
			}
		}else {
			System.out.println("폴더 존재 : "+wsweData.getAbsolutePath());
		}
		
		pbFile = new File(wsweData, PB_DATE_FILE);
		
		if(pbFile.exists()) {
			System.out.println(" 파일에서 데이터를 읽었습니다. ");
			try(				
					InputStream in = new FileInputStream(pbFile);
					ObjectInputStream oin = new ObjectInputStream(in);
					){
				pbList = (ArrayList<PhonebookModel>)oin.readObject();
				System.out.println(pbList.size()+" 개의 데이터를 읽었습니다.");
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(" 읽어올 파일이 없습니다. ");
		}
		}			
		
		
		
	//파일이 존재하면 파일 읽어 들이기 --> 읽어들인걸 pbList 로 저장
	
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

	@Override
	public void close() throws IOException {
		try( 
				OutputStream out = new FileOutputStream(pbFile);
				ObjectOutputStream oout = new ObjectOutputStream(out);				
				){
			oout.writeObject(pbList);
			System.out.println("파일 저장 완료");
		}catch (FileNotFoundException e) {
		}catch (IOException e) {
		}
					
		
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

