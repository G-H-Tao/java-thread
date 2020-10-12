package com.haitao.thread;

import java.util.stream.IntStream;

/**
 * Java�����ж��߳������õ����ȼ�ֻ�Ǹ�����ϵͳһ�����飬����ϵͳ��һ������ɡ�
 * �������ĵ���˳�����ɲ���ϵͳ���̵߳����㷨�����ġ�
 * ���ĳ���߳����ȼ������߳������߳����������ȼ�����ô���̵߳����ȼ�����ʧЧ��ȡ����֮�����߳����������ȼ���
 * @author Tao-pc
 *
 */
public class ThreadPrioity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =new Thread();
		System.out.println("����Ĭ���߳����ȼ�:"+thread.getPriority());
		
		Thread thread2 = new Thread();
		thread2.setPriority(10);
		System.out.println("�������ù����߳����ȼ�:"+thread2.getPriority());
		
		IntStream.range(1, 10).forEach(i->{
			Thread thread03 = new Thread(new T1());
			thread03.setPriority(i);
			thread03.start();
		});
		
		
	}
	
	public static class T1 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(String.format("��ǰִ�е��߳��ǣ�%s�����ȼ���%d",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority()));
		}
	}

}
