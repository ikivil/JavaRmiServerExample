package com.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rmi.server.UserService;

/**
 * Java RPC(Remote Procedure Call 远程过程调用协议) 之 RMI(Remote Method Invoke 远程方法调用) 实现
 * 服务端打包  UserService 和 Account类 
 * 客户端导入  UserService 和 Account类 (不要更改包路径)
 * 编写 ClientTest 测试 
 * @author windy
 *
 */
public class ClientTest {
	public static void main(String[] args) {
		 try { 
	            Registry registry = LocateRegistry.getRegistry("localhost",8001); 
	            UserService userService = (UserService) registry.lookup("userService"); 
	            System.out.println(""+userService.getAccount().getUsername()+userService.getAccount().getPassword());
	            System.out.println(userService.getName());
	        } catch (RemoteException e) { 
	            e.printStackTrace(); 
	        } catch (NotBoundException e) { 
	            e.printStackTrace(); 
	        } 
	}

}
