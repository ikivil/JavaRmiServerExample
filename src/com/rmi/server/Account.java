package com.rmi.server;

import java.io.Serializable;

/**
 * 用到的 Bean，需要打包给服务端
 * @author windy
 *
 */
public class Account implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username; 
    private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + "]";
	} 
    

}
