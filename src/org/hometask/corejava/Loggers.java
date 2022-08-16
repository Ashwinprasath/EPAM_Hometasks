package org.hometask.corejava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggers {

	static Logger log = LogManager.getLogger(Loggers.class.getName());
	
	public static void main(String[] args) {
		
		log.info("Hello");
		log.debug("Debug");
		log.warn("Warning");
		log.error("Error occured while running");
	}
}
