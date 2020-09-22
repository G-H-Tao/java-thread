package com.haitao.thread;

/**
 * нчкЬ
 * @author Tao-pc
 *
 */
public class NoneLock {
	
	static class ThreadA implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<100;i++) {
				System.out.println("Thread A "+i);
			}
		}
	}
	
	static class ThreadB implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<100;i++) {
				System.out.println("Thread B "+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new ThreadA()).start();
		new Thread(new ThreadB()).start();
	}

}
