package com.haitao.thread;

public class SynchronizeDemo {
	
	//�ؼ�����ʵ��������,��Ϊ��ǰʵ��
	public synchronized void instanceLock() {
		//code
	}
	
	/**
	 * �ȼ���
	 */
	
	///�ؼ����ڴ������,��Ϊ��������Ķ���
	public void instanceLock01() {
		synchronized(this) {
			//code
		}
	}
	
	//�ؼ����ھ�̬������,��Ϊ��ǰ��class����
	public static synchronized void classLock() {
		//code
	}
	
	/**
	 * �ȼ���
	 */
	
	//�ؼ����ڴ������,��Ϊ��������Ķ���
	public void classLock01() {
		synchronized(this.getClass()) {
			//code
		}
	}
	
	//�ؼ����ڴ������,��Ϊ��������Ķ���
	public void blockLock() {
		Object object = new Object();
		synchronized(object) {
			//code
		}
	}
	
	/**
	 * ���ٽ�������ָ����ĳһ�����������ͬһʱ��ֻ����һ���߳�ִ�С�
	 * ������������У����synchronized�ؼ����ڷ����ϣ����ٽ����������������ڲ���
	 * �������ʹ��synchronized����飬���ٽ�����ָ���Ǵ�����ڲ�������
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
