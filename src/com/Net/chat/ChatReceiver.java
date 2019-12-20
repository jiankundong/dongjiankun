package com.Net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable{
	private DatagramSocket server;
	
	public ChatReceiver(DatagramSocket server) {
		// TODO 自动生成的构造函数存根
		this.server=server;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			byte [] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		System.out.println("等待数据接受。。。");
		while (true) {
			server.receive(dp);
			String neirong=new String(dp.getData(),0,dp.getLength());
			System.out.println("来自"+dp.getAddress().getHostAddress()+"的信息"+neirong);
		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
