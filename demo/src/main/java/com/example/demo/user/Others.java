package com.example.demo.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Others {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userid;
    private int value;

    private String name;
    private String description;
    private Date date;

    public Others() {

    }
    

	public Others(int userid, int value, String name, String description, Date date) {
		super();
		this.userid = userid;
		this.value = value;
		this.name = name;
		this.description = description;
		this.date = date;
	}


	@Override
	public String toString() {
		return "Others [id=" + id + ", userid=" + userid + ", value=" + value + ", name=" + name + ", description="
				+ description + ", date=" + date + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
    
    
}
