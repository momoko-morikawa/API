package com.example.springTodo.model;

public class TodoList {
	private int id;
	private String title;
	private String status;
	private String detail;
	
	public TodoList() {
		
	}

	public TodoList(int id, String title, String status, String detail) {//引数をフィールド代入
		super();
		this.id = id;
		this.title = title;
		this.status = status;
		this.detail = detail;
	}
	
	//getterとsetter---------------------------------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	
}
