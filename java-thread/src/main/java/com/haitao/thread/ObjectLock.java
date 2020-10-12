package com.haitao.thread;

/**
 * 基于对象锁
 * @author Tao-pc
 *
 */
public class ObjectLock {
	
	private static Object lock = new Object();
	
	static class ThreadA implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(lock) {
				for(int i=0;i<100;i++) {
					System.out.println("Thread A "+i);
				}
			}
		}
	}
	
	static class ThreadB implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(lock) {
				for(int i=0;i<100;i++) {
					System.out.println("Thread B "+i);
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Thread(new ThreadA()).start();
		Thread.sleep(20l);
		new Thread(new ThreadB()).start();
	}

}
