package com.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

   public class Monitor implements Runnable
    {
	@Override
	public void run() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 11; ++i)
        {
            executorService.execute((Runnable) new WatchServer());
        }
	}
    }