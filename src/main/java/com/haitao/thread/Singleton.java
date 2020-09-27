package com.haitao.thread;

/**
 * Ë«ÖØ¼ìË÷µ¥Àý
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
