package automation.api_tests.tests;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.parser.ParseException;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.api_tests.constants.SolarAPIEndpoints;
import automation.api_tests.helpers.TheSolarServiceHelper;
import automation.api_tests.httperrorcode.HttpErrorCode;
import automation.api_tests.models.solar.BoundingBox;
import automation.api_tests.models.solar.Root;
import automation.api_tests.utils.SolarConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.testng.Assert.assertEquals;

public class TestGETSolarDetails {
    private TheSolarServiceHelper theSolarServiceHelper;
    private static final String TOKEN = SolarConfigManager.getInstance().getString("token");
    private static final Logger logger = Logger.getLogger(TestGETMovie.class);
    private BoundingBox boundingBox;
    private Root root;
    
    @BeforeClass
	public void init() {
		try {
			theSolarServiceHelper = new TheSolarServiceHelper();
			logger.info("Instance of ThedSolarServiceHelper is created");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

    @Test()
	public void testGetBuildingInsighByToken() throws ParseException {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.headers("X-Goog-User-Project", "samplesolarapi")
            .headers("Authorization", TOKEN)
            .queryParam("location.latitude", "50.110924")
            .queryParam("location.longitude", "8.682127")
            .queryParam("requiredQuality", "HIGH")
            .contentType(ContentType.JSON)
            .urlEncodingEnabled(false)
            .log().all();
		
            Response response = requestSpecification.get(SolarAPIEndpoints.BUILDING_INSIGHTS);
            int statusCode = response.getStatusCode();
            assertEquals(statusCode, HttpErrorCode.OK);
            logger.info("Response code is success ok - [" + statusCode + "]");

            JsonParser jsonParser = JsonParser.DEFAULT;
		
            root = jsonParser.parse(response.asString(), Root.class);
            System.out.println("Name: "+root.getName());
            System.out.println("Region Code:" + root.getRegionCode());
            System.out.println("Pitch degrees: "+ root.getSolarPotential().getRoofSegmentStats().get(0).getPitchDegrees());
	}
}
