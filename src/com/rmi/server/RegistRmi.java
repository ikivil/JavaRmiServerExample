package com.rmi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 发布服务入口
 * @author KK
 *
 */
public class RegistRmi {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl=new UserServiceImpl(); 
		try{
			UserService userService=(UserService)UnicastRemoteObject.exportObject(userServiceImpl,0); 
	        // Bind the remote object's stub in the registry 
	        Registry registry = LocateRegistry.createRegistry(8001);
	        registry.rebind("userService", userService); 
		}catch(Exception e){
			e.printStackTrace();
		}
		
        System.out.println("server is ready"); 
	}

}
