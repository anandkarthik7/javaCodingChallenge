package com.model;

public class User {
  private int userId;
  private String user_name;
  private String password;
  private String role;
@Override
public String toString() {
	return "User [userIid=" + userId + ", user_name=" + user_name + ", password=" + password + ", role=" + role + "]";
}
public int getUser_id() {
	return userId;
}
public void setUser_id(int user_id) {
	this.userId = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String user_name, String password, String role) {
	super();
	this.userId = userId;
	this.user_name = user_name;
	this.password = password;
	this.role = role;
}

}
