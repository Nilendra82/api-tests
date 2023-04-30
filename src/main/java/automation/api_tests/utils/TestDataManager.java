package automation.api_tests.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class TestDataManager {

	private static TestDataManager testDataManager;
	private static final Properties props = new Properties();
	private static final String CONFIG_FILE = "../api-tests/resources/TestData.properties";
	private static final Logger logger = Logger.getLogger(TestDataManager.class);
	
	private TestDataManager() throws IOException {
		File file = new File(CONFIG_FILE);
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
	}
	
	public static TestDataManager getInstance() {
		if(testDataManager == null) {
			synchronized (TestDataManager.class) {
				try {
					testDataManager = new TestDataManager();
				} catch(IOException e) {
					logger.error("TestDataManager instance is not created: " + e.getMessage() );
				}
			}
		}
		return testDataManager;
	}
	
	public String getString(String key) {
		return System.getProperty(key, props.getProperty(key));
	}
}
