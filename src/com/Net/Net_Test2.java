package com.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Net_Test2 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket client= new DatagramSocket(3000);
		//定义发送的数据
		String str="来自董建坤的问候";
		byte [] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(hcqsz, hcqsz.length,InetAddress.getByName("10.2.103.51"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();
	}

}
