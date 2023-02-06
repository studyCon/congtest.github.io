package com.xxx.pojo;

public class Category {
	private Integer id;
	private String name;
	private Integer pid;
	private Integer state;
	private Integer status;
	private String createTime;
	private String updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Category() {
		super();
	}
	public Category(Integer id, String name, Integer pid, Integer state, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.state = state;
		this.status = status;
	}
	public Category(Integer id, String name, Integer pid, Integer state, Integer status, String createTime,
			String updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.state = state;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Category(Integer id, String name, Integer pid, Integer state, Integer status, String createTime) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.state = state;
		this.status = status;
		this.createTime = createTime;
	}
	
	
	
}
