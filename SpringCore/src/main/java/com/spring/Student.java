package com.spring;

public class Student {

	private int sId;
	private String sName;
	private String Addr;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", Addr=" + Addr + "]";
	}
	
	
	
}
