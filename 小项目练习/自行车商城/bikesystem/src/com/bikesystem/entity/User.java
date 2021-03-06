package com.bikesystem.entity;
/**
 * �û���Ϣ��user��Ӧʵ����
 * @author bwfadmin
 *
 */
public class User {
	private int uid;
	private String uphone;
	private String password;
	private String name;
	private String idnumber;
	private String sex;
	private String address;
	private String email;
	private double balance;
	
	
	
	public User(String uphone, String name, String sex, String address) {
		super();
		this.uphone = uphone;
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	public User() {
		super();
	}
	public User(int uid, String uphone, String password, String name, String idnumber, String sex, String address,
			String email, double balance) {
		super();
		this.uid = uid;
		this.uphone = uphone;
		this.password = password;
		this.name = name;
		this.idnumber = idnumber;
		this.sex = sex;
		this.address = address;
		this.email = email;
		this.balance = balance;
	}
	
	
	public User(String uphone, String name, String idnumber, String sex, String address, String email, double balance) {
		super();
		this.uphone = uphone;
		this.name = name;
		this.idnumber = idnumber;
		this.sex = sex;
		this.address = address;
		this.email = email;
		this.balance = balance;
	}
	public User(String uphone, String password, String name, String address, String email) {
		super();
		this.uphone = uphone;
		this.password = password;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public User(String uphone, String password, String name, String idnumber, String sex, String address, String email,
			double balance) {
		super();
		this.uphone = uphone;
		this.password = password;
		this.name = name;
		this.idnumber = idnumber;
		this.sex = sex;
		this.address = address;
		this.email = email;
		this.balance = balance;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return uphone+":"+password+":"+name+":"+address+":"+email;
	}
	
}
