package com.lec.java.collection04;

public class MemberModel {
	private String id;
	private String passwd;
	
	public MemberModel() {}
	public MemberModel(String id, String pw) {
		this.id = id;
		this.passwd = pw;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void displayInfo() {
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + passwd);
	}
	
	@Override
	public String toString() {
		
		return "아이디"+id+"패스워드"+passwd;
	}

	
} // end class MemberModel




