package com.map.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="many_ans")
public class answers {

	@Id
	private int aid;
	private String answer;
	@ManyToOne
	private  questions ques;
	public answers(int aid, String answer, questions ques) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.ques = ques;
	}
	public questions getQues() {
		return ques;
	}
	public void setQues(questions ques) {
		this.ques = ques;
	}
	public answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public answers(int aid, String answer) {
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
