package com.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecuteThread {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Runnable watch = new WatchServer();
		Thread t = new Thread(watch);
		t.start();
		

				System.out.println(Thread.currentThread().getName());
				System.out.println("My task1 started...");		
				System.out.println("My task1 ended.");
				
				
				executorService.submit(watch);
				
				executorService.shutdown();
				
			}

	}

