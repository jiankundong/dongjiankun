package com.Net.TCP;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		
			ServerSocket fwqtjz=new ServerSocket(8899);
			//通过服务器套接字获取客户端套接字
			while(true) {
				Socket khdtjz=fwqtjz.accept();
			new Thread(()-> {
				
			try {
				String ip=khdtjz.getInetAddress().getHostAddress();
				int port=khdtjz.getPort();
				System.out.println("与端口号为"+port+"的客户端连接成功");
				InputStream is;
				is=khdtjz.getInputStream();
				File wj=new File("d:\\upload\\"+ip+".jpg");
				FileOutputStream fout=new FileOutputStream(wj);
				byte[]zjhc=new byte[1024];
				int b=is.read(zjhc);
				while (b!=-1) {
					fout.write(zjhc,0,b);
					b=is.read(zjhc);
					
				} 
			//要往客户端发送数据，必须通过所获取的客户端套接字创建输出流
			OutputStream os;
			os=khdtjz.getOutputStream();
			String s=ip+"上传了";
			zjhc=s.getBytes();
			os.write(zjhc);
			Thread.sleep(5000);
			os.close();
			khdtjz.close();
			} catch (IOException | InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			
			/**/
			})
			.start();

			
	}
}
}
