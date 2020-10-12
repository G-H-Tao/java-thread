package com.haitao.thread;

/**
 * �м̳�Thread�����ʵ��Runnable�ӿ������ַ�ʽ������֮����ʲô�����أ�
 * ����Java�����̳У���ʵ�֡������ԣ�Runnable�ӿ�ʹ��������Thread����
 * Runnable�ӿڳ��ָ�����������󣬽��̵߳������ж���ķ�װ��
 * Runnable�ӿڳ��֣��������̶߳�����߳����������ԡ�
 * ���ʹ���߳�ʱ����Ҫʹ��Thread�����෽������Ȼʹ��Runnable�ӿڸ�Ϊ����.
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
		
		//����ʽ���,����ʡ��MyThread��
		new Thread(()->{
			System.out.println("Java 8 �����ڲ���");
		}).start();
	}
}
