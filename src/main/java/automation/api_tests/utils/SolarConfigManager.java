package automation.api_tests.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

public class SolarConfigManager {
    private static SolarConfigManager solarConfigManager;
	private static final Properties props = new Properties();
	private static final String SOLAR_CONFIG_FILE = "../api-tests/resources/solarconfig.properties";
	private static final Logger logger = Logger.getLogger(SolarConfigManager.class);
	
	private SolarConfigManager() throws IOException {
		File file = new File(SOLAR_CONFIG_FILE);
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
	}
	
	public static SolarConfigManager getInstance() {
		if(solarConfigManager == null) {
			synchronized (SolarConfigManager.class) {
				try {
					solarConfigManager = new SolarConfigManager();
				} catch(IOException e) {
					logger.error("SolarConfigManager instance is not created: " + e.getMessage() );
				}
			}
		}
		return solarConfigManager;
	}
	
	public String getString(String key) {
		return System.getProperty(key, props.getProperty(key));
	}
}
