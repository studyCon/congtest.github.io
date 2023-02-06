package com.xxx.pojo;

public class ComInfo {
	private String address;
	private String tel;
	private String manager;
	private String email;
	private String createTime;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public ComInfo() {
		super();
	}
	public ComInfo(String address, String tel, String manager, String email, String createTime) {
		super();
		this.address = address;
		this.tel = tel;
		this.manager = manager;
		this.email = email;
		this.createTime = createTime;
	}
	public ComInfo(String address, String tel, String manager, String email) {
		super();
		this.address = address;
		this.tel = tel;
		this.manager = manager;
		this.email = email;
	}
	
	
	
}
