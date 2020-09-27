package com.haitao.thread;

/**
 * 
 * @author Tao-pc
 *ThreadLocal��һ�������̸߳������������ࡣ�ڲ���һ�������õ�Map��ά��
 *���ĳ����̬������user ID����transaction ID�����߳�״̬����������Կ���ʹ��ThreadLocal��
 *�����ThreadLocalʹ�ó���Ϊ����������ݿ����ӡ�Session����ȡ�
 *���ݿ����Ӻ�Session�����漰������Ӷ���ĳ�ʼ���͹رա�
 *�����ÿ���߳�������һЩ˽�б��������в�����������߳̾ͱ�ò���ô���������ˣ���ҪƵ���Ĵ����͹ر����ӡ�
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
			System.out.println("threadA���:"+threadLocal.get());
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
			System.out.println("threadB���:"+threadLocal.get());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		new Thread(new threadA(threadLocal)).start();
		new Thread(new threadB(threadLocal)).start();
	}

}
