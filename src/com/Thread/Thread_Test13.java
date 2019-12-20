package com.Thread;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class SaleThread3 implements Runnable{
	private int tickets=10;
	private final Lock lock =new ReentrantLock();
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			lock.lock(); 
			if (tickets>0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		 }
	  }
   }
public class Thread_Test13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SaleThread3 lockThread=new SaleThread3();
		new Thread(lockThread,"窗口1").start();
		new Thread(lockThread,"窗口2").start();
		new Thread(lockThread,"窗口3").start();
		new Thread(lockThread,"窗口4").start();
	}

}
