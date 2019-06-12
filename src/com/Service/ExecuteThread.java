package com.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecuteThread {
	
	public static void main(String[] args) {
		
		WatchServer watch = new WatchServer();
		Thread t = new Thread(watch);
		t.start();
		

				System.out.println(Thread.currentThread().getName());
				System.out.println("My task1 started...");		
				System.out.println("My task1 ended.");
				
				ExecutorService executor = Executors.newFixedThreadPool(10);
				
				for (int i = 0; i <11; i++) {
					executor.execute(new WatchServer());
					executor.submit(watch);
					i++;
				}
				executor.shutdown();
				
			}

	}

