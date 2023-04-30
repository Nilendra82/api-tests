package automation.api_tests.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigManager {
	private static ConfigManager configManager;
	private static final Properties props = new Properties();
	private static final String CONFIG_FILE = "../api-tests/resources/config.properties";
	private static final Logger logger = Logger.getLogger(ConfigManager.class);
	
	private ConfigManager() throws IOException {
		File file = new File(CONFIG_FILE);
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
	}
	
	public static ConfigManager getInstance() {
		if(configManager == null) {
			synchronized (ConfigManager.class) {
				try {
					configManager = new ConfigManager();
				} catch(IOException e) {
					logger.error("ConfigManager instance is not created: " + e.getMessage() );
				}
			}
		}
		return configManager;
	}
	
	public String getString(String key) {
		return System.getProperty(key, props.getProperty(key));
	}
}
