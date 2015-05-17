package com.mangement.mybatis.model;

public class User {
    
    private int id;
    private String userName;
    private String userAge;
    private String userAddress;
    
    public User(int i, String string, int j, String string2, String string3,
			String string4, String string5, int k, String string6,
			String string7) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAge() {
        return userAge;
    }
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

}