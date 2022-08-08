package Com.logerdata;

import org.apache.log4j.Logger;

public class Basic_configuration {
	
	 static Logger log = Logger.getLogger(Basic_configuration.class);
	 
	  public static void main(String[] args) {
		
		 log.debug("debug");
		 
		 log.info("info");
		 
		 log.warn("warning");
		 
		 log.error("error");
		 
		 log.fatal("fatel");
		 
		 
	}
	

}
