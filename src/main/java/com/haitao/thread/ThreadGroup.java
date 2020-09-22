package com.haitao.thread;

/**
 * ThreadGroup来表示线程组，我们可以使用线程组对线程进行批量控制。
 * @author Tao-pc
 *ThreadGroup和Thread的关系就如同他们的字面意思一样简单粗暴，
 *每个Thread必然存在于一个ThreadGroup中，Thread不能独立于ThreadGroup存在。
 *执行main()方法线程的名字是main，如果在new Thread时没有显式指定，
 *那么默认将父线程（当前执行new Thread的线程）线程组设置为自己的线程组。
 *ThreadGroup是一个标准的向下引用的树状结构，这样设计的原因是防止"上级"线程被"下级"线程引用而无法有效地被GC回收。
 */
public class ThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(()->{
			System.out.println("testThread当前线程组名字:"+Thread.currentThread().
					getThreadGroup().getName());
			System.out.println("testThread当前线程名字:"+Thread.currentThread().getName());
		});
		
		thread.start();
		System.out.println("main当前线程组名字:"+Thread.currentThread().
				getThreadGroup().getName());
		System.out.println("main当前线程名字:"+Thread.currentThread().getName());
		
	}

}
