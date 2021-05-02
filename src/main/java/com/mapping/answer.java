package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class answer {

	@Id
	private int aid;
	private String answer;
	public answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public answer(int aid, String answer) {
		super();
		this.aid = aid;
		this.answer = answer;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
