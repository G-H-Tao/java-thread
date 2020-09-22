package com.haitao.thread;

public class ExtendsThreadDemo {
	
	public static class MyThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("MyThread");
		}
	}
	
	public static void main(String[] args) {
	 	 Thread myThread= new MyThread();
	 	 myThread.start();
//	 	 myThread.start();
	 	 /**
	 	  * 我们在程序里面调用了start()方法后，虚拟机会先为我们创建一个线程，
	 	  * 然后等到这个线程第一次得到时间片时再调用run()方法。
	 	  * 注意不可多次调用start()方法。在第一次调用start()方法后，再次调用start()方法会抛出异常。
	 	  */
	}

}
