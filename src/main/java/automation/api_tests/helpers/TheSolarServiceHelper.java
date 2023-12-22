package automation.api_tests.helpers;

import automation.api_tests.utils.SolarConfigManager;
import io.restassured.RestAssured;

public class TheSolarServiceHelper {
    private static final String BASE_URI = SolarConfigManager.getInstance().getString("base_url");
    public TheSolarServiceHelper() {
        RestAssured.baseURI = BASE_URI;
    }
}
