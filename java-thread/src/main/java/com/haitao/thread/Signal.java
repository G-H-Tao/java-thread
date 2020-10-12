package com.haitao.thread;

/**
 * –≈∫≈¡ø
 * @author Tao-pc
 *
 */
public class Signal {
	
	private static volatile int signal = 0;
	
	
	static class ThreadA implements Runnable{
		public void run() {
			while(signal<5) {
				if (signal%2 == 0) {
					System.out.println("threadA:"+signal);
					signal++;
				}
			}
		};
	}
	
	static class ThreadB implements Runnable{
		public void run() {
			while(signal<5) {
				if (signal%2 != 0) {
					System.out.println("threadB:"+signal);
					signal++;
				}
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
