package com.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteThread {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Runnable task1 = Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task1 started...");
				try {
					TimeUnit.SECONDS.sleep(2);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}		
				System.out.println("My task1 ended.");
			}
		}
		
		Runnable task2 = Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task2 started...");
				try {
					TimeUnit.SECONDS.sleep(2);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("My task2 ended.");
			}
		}
		
		Runnable task3 = Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task3 started...");
				try {
					TimeUnit.SECONDS.sleep(2);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}				
				System.out.println("My task3 ended.");
			}
		}
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.shutdown();
		
	}

}
