package com.haitao.thread;

import java.util.stream.IntStream;

/**
 * Java程序中对线程所设置的优先级只是给操作系统一个建议，操作系统不一定会采纳。
 * 而真正的调用顺序，是由操作系统的线程调度算法决定的。
 * 如果某个线程优先级大于线程所在线程组的最大优先级，那么该线程的优先级将会失效，取而代之的是线程组的最大优先级。
 * @author Tao-pc
 *
 */
public class ThreadPrioity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =new Thread();
		System.out.println("我是默认线程优先级:"+thread.getPriority());
		
		Thread thread2 = new Thread();
		thread2.setPriority(10);
		System.out.println("我是设置过的线程优先级:"+thread2.getPriority());
		
		IntStream.range(1, 10).forEach(i->{
			Thread thread03 = new Thread(new T1());
			thread03.setPriority(i);
			thread03.start();
		});
		
		
	}
	
	public static class T1 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(String.format("当前执行的线程是：%s，优先级：%d",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority()));
		}
	}

}
