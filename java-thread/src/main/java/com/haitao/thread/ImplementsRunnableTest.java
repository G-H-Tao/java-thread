package com.haitao.thread;

/**
 * 有继承Thread类或者实现Runnable接口这两种方式，它们之间有什么优劣呢？
 * 由于Java“单继承，多实现”的特性，Runnable接口使用起来比Thread更灵活。
 * Runnable接口出现更符合面向对象，将线程单独进行对象的封装。
 * Runnable接口出现，降低了线程对象和线程任务的耦合性。
 * 如果使用线程时不需要使用Thread类的诸多方法，显然使用Runnable接口更为轻量.
 * @author Tao-pc
 *
 */
public class ImplementsRunnableTest {

	public static class MyThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("MyThread");
		}
	}
	
	public static void main(String[] args) {
		new Thread(new MyThread()).start();
		
		//函数式编程,可以省略MyThread类
		new Thread(()->{
			System.out.println("Java 8 匿名内部类");
		}).start();
	}
}
