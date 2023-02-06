package com.xxx.pojo;

public class User {
	
	private Integer id;
	private String username;
	private String password;
	private Integer sex;
	private Integer age;
	private String tel;
	private Integer state;
	private String createTime;
	private String updateTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	public User() {
		super();
	}
	public User(String username, String password, Integer sex, Integer age, String tel) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
	}
	public User(String username, String password, Integer sex, Integer age, String tel, Integer state) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.state = state;
	}
	
	public User(Integer id, String username, String password, Integer sex, Integer age, String tel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
	}
	public User(Integer id, String username, String password, Integer sex, Integer age, String tel, Integer state,
			String createTime, String updateTime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.state = state;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public User(Integer id, String username, String password, Integer sex, Integer age, String tel, Integer state) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.state = state;
	}
	
}
