package com.test.api.picollo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.test.api.picollo.env.SysConfig;
import com.test.api.picollo.reader.FuncCSV;

/**
 * @author harvy.torres
 *
 */
public class App {
	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) throws IOException {
		
		SysConfig sg = new SysConfig();
		FuncCSV fc = new FuncCSV();
		
		logger.info(System.getProperty("user.dir"), sg.getProperty("csv.tsc.file"));
		fc.readTscFile(sg.getResourceFileLocation("/test.data/tsc/tsc.data.csv"));
	}

}
