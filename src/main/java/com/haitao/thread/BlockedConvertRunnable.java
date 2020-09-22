package com.haitao.thread;

/**
 * BLOCKED与RUNNABLE状态的转换
 * @author Tao-pc
 *
 */
public class BlockedConvertRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				testMethod();
			}
		},"a");
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				testMethod();
			}
		},"b");
		
		thread.start();
//		Thread.sleep(1000l);
//		thread.join();
		thread.join(1000l);
		thread2.start();
		System.out.println(thread.getName()+":"+thread.getState());
		System.out.println(thread2.getName()+":"+thread2.getState());
		
	}
	
	/**
	 * 同步方法争夺锁
	 */
	private synchronized static void testMethod() {
		try {
			Thread.sleep(2000l);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
