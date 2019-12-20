package com.Net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend implements Runnable  {
	private DatagramSocket client;
	private int targetPort;
	public ChatSend(DatagramSocket client, int targetPort) {
		// TODO 自动生成的构造函数存根
		this.client=client;
		this.targetPort=targetPort;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			Scanner sc=new Scanner(System.in);
			while (true) {
				System.out.println("请输入要发送的信息");
				String data=sc.nextLine(); 
				byte [] hcqsz=data.getBytes("UTF-8");
				System.out.println("请输入要发送的IP地址");
				String ip=sc.nextLine();
				DatagramPacket packet=new DatagramPacket(hcqsz, hcqsz.length,InetAddress.getByName("10.2.103."+ip),targetPort);
				client.send(packet);
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
