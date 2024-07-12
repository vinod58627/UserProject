package com.apcfss.RequestClasses;

public class EmployeeRequest {
	
	
	public Integer sno;
	public String name;
	public String location;
	public String district;
	public String surname;
	public String email;
	public Integer age;
	public Integer mobile;
	public Integer salary;

	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
		this.age = age;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeRequest [sno=" + sno + ", name=" + name + ", location=" + location + ", district=" + district
				+ ", surname=" + surname + ", email=" + email + ", age=" + age + ", mobile=" + mobile + ", salary="
				+ salary + "]";
	}
	
	

}
