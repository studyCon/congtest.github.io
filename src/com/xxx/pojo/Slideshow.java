package com.xxx.pojo;

public class Slideshow {
	private Integer id;
	private String name;
	private String local;
	private Integer state;
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
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
	public Slideshow() {
		super();
	}
	public Slideshow(Integer id, String name, String local, Integer state, String createTime, String updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.local = local;
		this.state = state;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	
	
	
	
}
