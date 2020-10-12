package com.haitao.thread;

public class join {
	
	static class ThreadA implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("我是子线程!我先睡一秒.");
				Thread.sleep(1000l);
				System.out.println("我是子线程,我睡完了一秒.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ThreadA());
		thread.start();
		thread.join();
		System.out.println("如果不加join方法，我会先被打出来，加了就不一样了");
	}

}
