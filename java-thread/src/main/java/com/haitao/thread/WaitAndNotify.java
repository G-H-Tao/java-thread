package com.haitao.thread;

/**
 * 等待/通知机制
 * @author Tao-pc
 *Java多线程的等待/通知机制是基于Object类的wait()方法和notify(), notifyAll()方法来实现的。
 *notify()方法会随机叫醒一个正在等待的线程，而notifyAll()会叫醒所有正在等待的线程。
 *一个锁同一时刻只能被一个线程持有。而假如线程A现在持有了一个锁lock并开始执行，它可以使用lock.wait()让自己进入等待状态。这个时候，lock这个锁是被释放了的。
 *线程B获得了lock这个锁并开始执行，它可以在某一时刻，使用lock.notify()，通知之前持有lock锁并进入等待状态的线程A，说“线程A你不用等了，可以往下执行了”。
 *需要注意的是，这个时候线程B并没有释放锁lock，除非线程B这个时候使用lock.wait()释放锁，或者线程B执行结束自行释放锁，线程A才能得到lock锁。
 *等待/通知机制使用的是使用同一个对象锁，如果你两个线程使用的是不同的对象锁，那它们之间是不能用等待/通知机制通信的。
 */
public class WaitAndNotify {
	
	private static Object lock = new Object();
	
	static class ThreadA implements Runnable{
		public void run() {
			synchronized(lock) {
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("ThreadA:"+i);
						lock.notify();
						lock.wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				lock.notify();
			}
		};
	}
	
	static class ThreadB implements Runnable{
		public void run() {
			synchronized(lock) {
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("ThreadB:"+i);
						lock.notify();
						lock.wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				lock.notify();
			}
		};
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 new Thread(new ThreadA()).start();
	     Thread.sleep(1000);
	     new Thread(new ThreadB()).start();
	}

}
