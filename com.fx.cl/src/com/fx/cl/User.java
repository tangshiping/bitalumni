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
		// TODO �Զ����ɵķ������
		this.Id=i;
		
	}
	public void setName(String string) {
		// TODO �Զ����ɵķ������
		this.Name = string;
	}
	public void setAge(int i) {
		// TODO �Զ����ɵķ������
		this.age=i;
	}
	public Long getId() {
		// TODO �Զ����ɵķ������
		return this.Id;
	}
	public String getName() {
		// TODO �Զ����ɵķ������
		return this.Name;
	}
	public int getAge() {
		// TODO �Զ����ɵķ������
		return this.age;
	}
}
