package com.main;

public class Student {
private int id;
private String name;
private String address;
private long mobno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mobno=" + mobno + "]";
}
}
