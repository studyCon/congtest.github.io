package com.xxx.pojo;

public class News {
	private Integer id;
	private Integer cateId;
	private Integer seCateId;
	private String title;
	private String author;
	private String shortContent;
	private String content;
	private Integer state;
	private Integer status;
	private String createTime;
	private String updateTime;
	private String pic;

	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCateId() {
		return cateId;
	}
	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}
	public Integer getSeCateId() {
		return seCateId;
	}
	public void setSeCateId(Integer seCateId) {
		this.seCateId = seCateId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getShortContent() {
		return shortContent;
	}
	public void setShortContent(String shortContent) {
		this.shortContent = shortContent;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public News() {
		super();
	}
	public News(Integer id, Integer cateId, Integer seCateId, String title, String author, String shortContent,
			String content, Integer state, Integer status, String createTime, String updateTime, String pic) {
		super();
		this.id = id;
		this.cateId = cateId;
		this.seCateId = seCateId;
		this.title = title;
		this.author = author;
		this.shortContent = shortContent;
		this.content = content;
		this.state = state;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.pic = pic;
	}

	
	
	
}
