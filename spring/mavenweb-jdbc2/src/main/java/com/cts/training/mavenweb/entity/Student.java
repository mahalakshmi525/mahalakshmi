package com.cts.training.mavenweb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*@Getter
@Setter
@AllArgsConstructor
@ToString*/
public class Student {

	private Integer id;
	private String name;
	private String email;
	private Integer age;
	private Integer salary;
	
	public Student() {}

	
	public Student(Integer id, String name, String email , Integer age,Integer salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.age=age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age =age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setsalary(Integer salary) {
		this.salary =salary;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + " , age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
