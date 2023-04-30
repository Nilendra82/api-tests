package automation.api_tests.helpers;

import automation.api_tests.utils.ConfigManager;
import io.restassured.RestAssured;

public class TheMovieServiceHelper {
	
	private static final String BASE_URL = ConfigManager.getInstance().getString("base_url");
	
	public TheMovieServiceHelper() {
		RestAssured.baseURI = BASE_URL;
	}
}
