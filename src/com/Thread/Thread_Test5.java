package com.Thread;
class TicketWindow2 extends Thread{
	private int  tickets=80;
	
		public void run() {
		
			while (true) {
				if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发"+tickets--+"学习笔记");
			}
		}
	}
} 
public class Thread_Test5 {

	public static void main(String[] args) {
		TicketWindow2 tw=new TicketWindow2();
		// TODO 自动生成的方法存根
			new Thread(tw,"第1位老师").start();
			new Thread(tw,"第2位老师").start();
			new Thread(tw,"第3位老师").start();
			
	}

}
