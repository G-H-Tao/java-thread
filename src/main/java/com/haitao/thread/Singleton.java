package com.haitao.thread;

/**
 * ˫�ؼ�������
 * @author Tao-pc
 *
 */
public class Singleton {
	
	private volatile static Singleton singleton;

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
