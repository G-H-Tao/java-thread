package com.haitao.thread;

public class SynchronizeDemo {
	
	//关键字在实例方法上,锁为当前实例
	public synchronized void instanceLock() {
		//code
	}
	
	/**
	 * 等价于
	 */
	
	///关键字在代码块上,锁为括号里面的对象
	public void instanceLock01() {
		synchronized(this) {
			//code
		}
	}
	
	//关键字在静态方法上,锁为当前的class对象
	public static synchronized void classLock() {
		//code
	}
	
	/**
	 * 等价于
	 */
	
	//关键字在代码块上,锁为括号里面的对象
	public void classLock01() {
		synchronized(this.getClass()) {
			//code
		}
	}
	
	//关键字在代码块上,锁为括号里面的对象
	public void blockLock() {
		Object object = new Object();
		synchronized(object) {
			//code
		}
	}
	
	/**
	 * “临界区”，指的是某一块代码区域，它同一时刻只能由一个线程执行。
	 * 在上面的例子中，如果synchronized关键字在方法上，那临界区就是整个方法内部。
	 * 而如果是使用synchronized代码块，那临界区就指的是代码块内部的区域。
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
