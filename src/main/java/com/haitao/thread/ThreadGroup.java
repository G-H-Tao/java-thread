package com.haitao.thread;

/**
 * ThreadGroup����ʾ�߳��飬���ǿ���ʹ���߳�����߳̽����������ơ�
 * @author Tao-pc
 *ThreadGroup��Thread�Ĺ�ϵ����ͬ���ǵ�������˼һ���򵥴ֱ���
 *ÿ��Thread��Ȼ������һ��ThreadGroup�У�Thread���ܶ�����ThreadGroup���ڡ�
 *ִ��main()�����̵߳�������main�������new Threadʱû����ʽָ����
 *��ôĬ�Ͻ����̣߳���ǰִ��new Thread���̣߳��߳�������Ϊ�Լ����߳��顣
 *ThreadGroup��һ����׼���������õ���״�ṹ��������Ƶ�ԭ���Ƿ�ֹ"�ϼ�"�̱߳�"�¼�"�߳����ö��޷���Ч�ر�GC���ա�
 */
public class ThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(()->{
			System.out.println("testThread��ǰ�߳�������:"+Thread.currentThread().
					getThreadGroup().getName());
			System.out.println("testThread��ǰ�߳�����:"+Thread.currentThread().getName());
		});
		
		thread.start();
		System.out.println("main��ǰ�߳�������:"+Thread.currentThread().
				getThreadGroup().getName());
		System.out.println("main��ǰ�߳�����:"+Thread.currentThread().getName());
		
	}

}
