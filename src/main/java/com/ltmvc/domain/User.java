package com.ltmvc.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4208178886118995956L;
	
	private int id;
	
	private String eno;
	
	private String name;
	
	private String username;
	
	private String pass;
	
	private Date birth;
	
	private int sex;
	
	private String tel;
	
	private String qq;
	
	private int dept_id;
	
	private int group_id;
	
	private int manager_id;
	
	private int ismaster;
	
	private int status;
	
	private int cust_num;
	
	private int extend_no;
	
	private int create_time;
	
	private int login_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getIsmaster() {
		return ismaster;
	}

	public void setIsmaster(int ismaster) {
		this.ismaster = ismaster;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCust_num() {
		return cust_num;
	}

	public void setCust_num(int cust_num) {
		this.cust_num = cust_num;
	}

	public int getExtend_no() {
		return extend_no;
	}

	public void setExtend_no(int extend_no) {
		this.extend_no = extend_no;
	}

	public int getCreate_time() {
		return create_time;
	}

	public void setCreate_time(int create_time) {
		this.create_time = create_time;
	}

	public int getLogin_time() {
		return login_time;
	}

	public void setLogin_time(int login_time) {
		this.login_time = login_time;
	}
	
}
