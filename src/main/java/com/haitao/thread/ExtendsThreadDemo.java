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
	 	  * �����ڳ������������start()���������������Ϊ���Ǵ���һ���̣߳�
	 	  * Ȼ��ȵ�����̵߳�һ�εõ�ʱ��Ƭʱ�ٵ���run()������
	 	  * ע�ⲻ�ɶ�ε���start()�������ڵ�һ�ε���start()�������ٴε���start()�������׳��쳣��
	 	  */
	}

}
