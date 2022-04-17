package com.ripples.collections.map.unpd;

public class UserNamePwd {
	private String userName;
	private String passwd;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public UserNamePwd(String userName, String passwd) {
		super();
		this.userName = userName;
		this.passwd = passwd;
	}
	public UserNamePwd() {
		super();
	}
	
	@Override
	public String toString() {
		return "UserNamePwd [userName=" + userName + ", passwd=" + passwd + "]";
	}
	

}
