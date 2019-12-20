package com.Thread;
class EmergencyThread implements Runnable{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=1 ;i<6;i++) {
		System.out.println(Thread.currentThread().getName()+"输入"+i);
		}
	}
}
public class Thrad_Test10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Thread thread1=new Thread(new EmergencyThread(),"thread1");
		thread1.start();
		for(int i=1 ;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"输入"+i);
		if (i==2) {
			thread1.join();
		}
	  }
   }
}
