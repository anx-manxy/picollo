/**
 * 
 */
package com.test.api.picollo.reader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opencsv.CSVReader;
import com.test.api.picollo.App;

/**
 * @author harvy.torres
 *
 */
public class FuncCSV {

	private Logger logger = LogManager.getLogger(App.class);

	public void readTscFile(String args) throws IOException {
        try {
        		Reader reader = Files.newBufferedReader(Paths.get(args));
            @SuppressWarnings("resource")
			CSVReader csvReader = new CSVReader(reader);
            
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                logger.info("Name : " + nextRecord[0]);
                logger.info("Email : " + nextRecord[1]);
                logger.info("Phone : " + nextRecord[2]);
                logger.info("Country : " + nextRecord[3]);
                logger.info("==========================");
            }
        }catch(Exception e) {
        		logger.error(e.getMessage());
        }
    }
}
