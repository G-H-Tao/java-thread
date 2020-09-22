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
		//模拟计算一秒
		Thread.sleep(1000);
		return 2;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//使用
		ExecutorService executorService = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> resFuture = executorService.submit(task);
		// 注意调用get方法会阻塞当前线程，直到得到结果。
        // 所以实际编码中建议使用可以设置超时时间的重载get方法。
		System.out.println(resFuture.get());
	}
}
