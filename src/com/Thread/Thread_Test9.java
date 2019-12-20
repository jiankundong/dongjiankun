package com.Thread;

class YieldThread extends Thread{
	public YieldThread(String name) {
		super(name);
	}
	public void run(){
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if (i==2) {
				System.out.println(Thread.currentThread().getName()+"正在让步");
				Thread.yield();
			}
		}
	}
}
public class Thread_Test9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread thread1=new YieldThread("线程1");
		Thread thread2=new YieldThread("线程2");
		thread1.start();
		thread2.start();
	}
}