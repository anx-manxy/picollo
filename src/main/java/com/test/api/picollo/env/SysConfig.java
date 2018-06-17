/**
 * 
 */
package com.test.api.picollo.env;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.test.api.picollo.App;


/**
 * @author harvy.torres
 *
 */
public class SysConfig {

	private Logger logger = LogManager.getLogger(App.class);

	/**
	 * Gets the property values of the given key
	 * 
	 * @param key
	 *            variables that mapped to a value
	 * @return values of the given key
	 */
	public String getProperty(String key) {
		try {
			Properties config = new Properties();
			FileInputStream fileInputStream = new FileInputStream(
					getResourceFileLocation("/config.properties"));
			config.load(fileInputStream);
			fileInputStream.close();
			logger.info("[S] getProperty " + config.getProperty(key));
			return config.getProperty(key);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		return null;
	}

	/**
	 * Gets the configuration in the resource folder
	 * 
	 * @param arg0
	 * @return absolute path of the configuration file
	 */
	public String getResourceFileLocation(String arg0) {
		try {
			URL resource = SysConfig.class.getResource(arg0);
			File file = new File(resource.toURI());
			return file.getAbsolutePath();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}
}
