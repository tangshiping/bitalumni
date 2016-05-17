package com.fx.cl;

import org.elasticsearch.common.xcontent.ToXContent;

public class User {
	 private Long Id;      
	 private String Name;           
	 private int age;      
	 
	 public User(Long Id,String Name,int age){
		 this.Id = Id;
		 this.Name = Name;
		 this.age = age;
	 }
	public void setId(Long i) {
		// TODO 自动生成的方法存根
		this.Id=i;
		
	}
	public void setName(String string) {
		// TODO 自动生成的方法存根
		this.Name = string;
	}
	public void setAge(int i) {
		// TODO 自动生成的方法存根
		this.age=i;
	}
	public Long getId() {
		// TODO 自动生成的方法存根
		return this.Id;
	}
	public String getName() {
		// TODO 自动生成的方法存根
		return this.Name;
	}
	public int getAge() {
		// TODO 自动生成的方法存根
		return this.age;
	}
}
