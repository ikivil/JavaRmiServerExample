package com.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI 服务端接口，需要打包给客户端
 * 1.需要继承 Remote
 * @author KK
 *
 */
public interface UserService extends Remote{
	String getName() throws RemoteException;
	Account getAccount() throws RemoteException;

}
