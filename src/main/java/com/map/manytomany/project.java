package com.map.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany
	private List<employee>emp;
	public project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public project(int pid, String pname, List<employee> emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<employee> getEmp() {
		return emp;
	}
	public void setEmp(List<employee> emp) {
		this.emp = emp;
	}
	

}
