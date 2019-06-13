package com.Service;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServer implements Runnable{

			@Override
			public void run() {

	    try {
	    WatchService watchService = FileSystems.getDefault().newWatchService();
	    
	    Path path = Paths.get("files");
	 
	     path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, 
	          StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
	    }catch (IOException ex) {
	     System.out.println("Watch service registered for dir: " + path.toString());
	    }
	     WatchKey key = null;
	     
	     while (true) { 
	        try {
	              
	              System.out.println("Waiting for key to be signalled...");
	              key = watchService.take();
	 
	              for (WatchEvent<?> event : key.pollEvents()) {
	                  //call DOmParser and call db to here 
	                   Kind<?> kind = event.kind();
	                    
	                   System.out.println("Event on " + event.context() + " is " + kind);
	              }
	        } catch (InterruptedException e) {
	                 System.out.println("InterruptedException: " + e.getMessage());
	        }
	         
	         boolean reset = key.reset();
	         if (!reset)
	            break;
	     }
	   
			}
	}

