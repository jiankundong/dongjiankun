package com.Net.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread (Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		String ip=socket.getInetAddress().getHostAddress();
		int count=1;
	}
}
public class UploadTCPServer {


		// TODO 自动生成的方法存根
		public static void main(String[] args) throws Exception {
			// TODO 自动生成的方法存根
			
				ServerSocket fwqtjz=new ServerSocket(8899);
				//通过服务器套接字获取客户端套接字
				while(true) {
					Socket khdtjz=fwqtjz.accept();
				Thread thread=new Thread(()-> {
					
				try {
					
					int port=khdtjz.getPort();
					System.out.println("与端口号为"+port+"的客户端连接成功");
				//要往客户端发送数据，必须通过所获取的客户端套接字创建输出流
				OutputStream os=khdtjz.getOutputStream();
				os.write(("服务器端向客户端做出响应!").getBytes());
				String s="你好客户端，来自10.2.103.31这个TCP服务器的问候";
				byte[] b=s.getBytes();
				os.write(b);

				khdtjz.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
				
				/**/
				});
				thread.start();

				
		}
	
	}

}
