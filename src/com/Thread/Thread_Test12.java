package com.Thread;
class SaleThread2 implements Runnable{
	private int tickets=10;
	Object lock=new Object(); 
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			saleTicket();
		}
}
	private synchronized void saleTicket() {
		// TODO 自动生成的方法存根
		if (tickets>0) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
			}
	}
}


public class Thread_Test12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SaleThread2 saleThread=new SaleThread2();
		// TODO 自动生成的方法存根
		new Thread(saleThread,"窗口1").start();
		new Thread(saleThread,"窗口2").start();
		new Thread(saleThread,"窗口3").start();
		new Thread(saleThread,"窗口4").start();
	}

}
