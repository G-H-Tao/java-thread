package com.haitao.thread;

public class join {
	
	static class ThreadA implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("�������߳�!����˯һ��.");
				Thread.sleep(1000l);
				System.out.println("�������߳�,��˯����һ��.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ThreadA());
		thread.start();
		thread.join();
		System.out.println("�������join�������һ��ȱ�����������˾Ͳ�һ����");
	}

}
