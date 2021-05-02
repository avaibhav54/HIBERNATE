package com.map.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private List<project>pj;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int eid, String ename, List<project> pj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.pj = pj;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<project> getPj() {
		return pj;
	}
	public void setPj(List<project> pj) {
		this.pj = pj;
	}
	
}
