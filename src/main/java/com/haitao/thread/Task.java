package com.haitao.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		//ģ�����һ��
		Thread.sleep(1000);
		return 2;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ʹ��
		ExecutorService executorService = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> resFuture = executorService.submit(task);
		// ע�����get������������ǰ�̣߳�ֱ���õ������
        // ����ʵ�ʱ����н���ʹ�ÿ������ó�ʱʱ�������get������
		System.out.println(resFuture.get());
	}
}
