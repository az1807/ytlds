package com.ytlds.entity;

public class Company {
private int companyid;
private String companyname;
private String email;
private String address;
private String introduction;
private String phone;
public int getCompanyid() {
	return companyid;
}
public void setCompanyid(int companyid) {
	this.companyid = companyid;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getIntroduction() {
	return introduction;
}
public void setIntroduction(String introduction) {
	this.introduction = introduction;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Company(int companyid, String companyname, String email, String address,
		String introduction, String phone) {
	super();
	this.companyid = companyid;
	this.companyname = companyname;
	this.email = email;
	this.address = address;
	this.introduction = introduction;
	this.phone = phone;
}
public Company() {
	
}
@Override
public String toString() {
	return "Company [companyid=" + companyid + ", companyname=" + companyname
			+ ", email=" + email + ", address=" + address + ", introduction="
			+ introduction + ", phone=" + phone + "]";
}


}
