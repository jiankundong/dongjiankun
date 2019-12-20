package com.Net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;


public class ChatRoom {

	public static void main(String[] args) throws SocketException {
		// TODO 自动生成的方法存根

			DatagramSocket socket=new DatagramSocket(3000);
			new Thread(new ChatReceiver(socket),"接受服务").start();
			new Thread(new ChatSend(socket,3000),"发送服务").start();
		
	}

}
