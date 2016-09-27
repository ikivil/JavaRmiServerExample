package com.rmi.server;

/**
 * UserService 的实现类
 * @author KK
 *
 */
public class UserServiceImpl implements UserService {
	
	public UserServiceImpl () {}

	@Override
	public String getName() {
		return "ljw";
	}

	@Override
	public Account getAccount() {
		Account a = new Account();
		a.setUsername("hehe");
		a.setPassword("123123");
		return a;
	}

}
