package com.haitao.thread;

/**
 * �ȴ�/֪ͨ����
 * @author Tao-pc
 *Java���̵߳ĵȴ�/֪ͨ�����ǻ���Object���wait()������notify(), notifyAll()������ʵ�ֵġ�
 *notify()�������������һ�����ڵȴ����̣߳���notifyAll()������������ڵȴ����̡߳�
 *һ����ͬһʱ��ֻ�ܱ�һ���̳߳��С��������߳�A���ڳ�����һ����lock����ʼִ�У�������ʹ��lock.wait()���Լ�����ȴ�״̬�����ʱ��lock������Ǳ��ͷ��˵ġ�
 *�߳�B�����lock���������ʼִ�У���������ĳһʱ�̣�ʹ��lock.notify()��֪֮ͨǰ����lock��������ȴ�״̬���߳�A��˵���߳�A�㲻�õ��ˣ���������ִ���ˡ���
 *��Ҫע����ǣ����ʱ���߳�B��û���ͷ���lock�������߳�B���ʱ��ʹ��lock.wait()�ͷ����������߳�Bִ�н��������ͷ������߳�A���ܵõ�lock����
 *�ȴ�/֪ͨ����ʹ�õ���ʹ��ͬһ��������������������߳�ʹ�õ��ǲ�ͬ�Ķ�������������֮���ǲ����õȴ�/֪ͨ����ͨ�ŵġ�
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
