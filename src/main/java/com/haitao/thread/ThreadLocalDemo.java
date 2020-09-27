package com.haitao.thread;

/**
 * 
 * @author Tao-pc
 *ThreadLocal是一个本地线程副本变量工具类。内部是一个弱引用的Map来维护
 *类的某个静态变量（user ID或者transaction ID）与线程状态关联，则可以考虑使用ThreadLocal。
 *最常见的ThreadLocal使用场景为用来解决数据库连接、Session管理等。
 *数据库连接和Session管理涉及多个复杂对象的初始化和关闭。
 *如果在每个线程中声明一些私有变量来进行操作，那这个线程就变得不那么“轻量”了，需要频繁的创建和关闭连接。
 */
public class ThreadLocalDemo {
	
	static class threadA implements Runnable{
		
		private ThreadLocal<String> threadLocal;
		
		public threadA(ThreadLocal<String> threadLocal) {
			// TODO Auto-generated constructor stub
			this.threadLocal = threadLocal;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			threadLocal.set("A");
			try {
//				Thread.sleep(1000L);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("threadA输出:"+threadLocal.get());
		}
	}
	
	static class threadB implements Runnable{
		
		private ThreadLocal<String> threadLocal;
		
		public threadB(ThreadLocal<String> threadLocal) {
			// TODO Auto-generated constructor stub
			this.threadLocal = threadLocal;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			threadLocal.set("B");
			try {
//				Thread.sleep(1000L);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("threadB输出:"+threadLocal.get());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		new Thread(new threadA(threadLocal)).start();
		new Thread(new threadB(threadLocal)).start();
	}

}
