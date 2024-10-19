package com.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.model.Student;
import com.model.StudentManager;

@ManagedBean(name="studentdata",eager=true)
public class StudentData {
	public List<Student> getList() {
		try {
			StudentManager SM= new StudentManager();
			list=SM.readData();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	List<Student> list;
	

}
