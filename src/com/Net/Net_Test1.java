package com.Net;
import java.net.InetAddress;
public class Net_Test1 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
			InetAddress localAddress=InetAddress.getLocalHost();
			InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
			System.out.println("本机的IP地址："+localAddress.getHostAddress());
			System.out.println("itcast的IP地址："+remoteAddress.getHostAddress());
			System.out.println("3秒内是否可以访问："+remoteAddress.isReachable(3000));
			System.out.println("itcast的主机名为："+remoteAddress.getHostName());
	}

}
