package com.mapping;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class question {

	@Id
	private int qid;
	private String question;
	@OneToOne
	private answer ans;
	public question(int qid, String question, answer ans) {
		super();
		this.qid = qid;
		this.question = question;
		this.ans = ans;
	}
	
	
	public answer getAns() {
		return ans;
	}


	public void setAns(answer ans) {
		this.ans = ans;
	}


	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public question(int qid, String question) {
		super();
		this.qid = qid;
		this.question = question;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
