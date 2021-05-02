package com.map.manytoone;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "one_question")
public class questions {

	@Id
	@Column(name="quid")
	private int qid;
	@Column(name="ques")
	private String question;
	@OneToMany(mappedBy = "ques")
	@Column(name="answe")
	private List<answers> ans;
	

	public questions(int qid, String question, List<answers> ans) {
		super();
		this.qid = qid;
		this.question = question;
		this.ans = ans;
	}



	public List<answers> getAns() {
		return ans;
	}



	public void setAns(List<answers> ans) {
		this.ans = ans;
	}



	public questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public questions(int qid, String question) {
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
