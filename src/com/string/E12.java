package com.string;

import java.io.IOException;
public class E12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自动生成的  方法存根
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小"+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大可用内存大小"+rt.maxMemory()/1024/1024+"M");
		
		Process shuijiao=rt.exec("notepad.exe");
		Thread.sleep(3000);
		shuijiao.destroy();
	}

}
