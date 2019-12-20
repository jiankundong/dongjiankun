package com.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class Net_Test3 {
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket server= new DatagramSocket(8900);
		byte [] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		System.out.println("等待数据接受。。。");
		while (true) {
			server.receive(dp);
			String neirong=new String(dp.getData());
			System.out.println(dp.getAddress().getHostAddress()+":"+neirong);
		}
	}

}
