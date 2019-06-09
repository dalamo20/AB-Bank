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

public class WatchServer {

	   public static void main(String[] args) throws IOException {
	    
	    WatchService watchService = FileSystems.getDefault().newWatchService();
	    
	    Path path = Paths.get("files");
	 
	     path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, 
	          StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
	 
	     System.out.println("Watch service registered for dir: " + path.toString());
	 
	     WatchKey key = null;
	     
	     while (true) { // create an infinite loop to wait for events
	        try {
	              /*
	              * Get a watch key. The take() method returns a queued key. 
	              * If no queued key is available, this method waits.
	              */
	              
	              System.out.println("Waiting for key to be signalled...");
	              key = watchService.take();
	 
	              /*
	               * Process the pending events for the key. 
	               * You fetch the List of WatchEvents from the pollEvents() method.
	               */
	 
	              for (WatchEvent<?> event : key.pollEvents()) {
	                  
	                  /*
	                   * Retrieve the type of event by using the kind() method.
	                   */
	                   Kind<?> kind = event.kind();
	 
	                   /* Retrieve the file name associated with the event. 
	                    * The file name is stored as the context of the event, 
	                    * so the context() method is used to retrieve it.
	                    */
	                    
	                   System.out.println("Event on " + event.context() + " is " + kind);
	              }
	        } catch (InterruptedException e) {
	                 System.out.println("InterruptedException: " + e.getMessage());
	        }
	       
	        /* After the events for the key have been processed, 
	         * you need to put the key back into a ready state by invoking reset(). 
	         * If this method returns false, the key is no longer valid and the loop can exit. 
	         * This step is very important. If you fail to invoke reset, 
	         * this key will not receive any further events.
	         */
	         
	         boolean reset = key.reset();
	         if (!reset)
	            break;
	     }
	   }
	}
