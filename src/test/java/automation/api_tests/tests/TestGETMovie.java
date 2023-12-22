package automation.api_tests.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.parser.ParseException;
import org.apache.log4j.Logger;

import automation.api_tests.constants.EndPoints;
import automation.api_tests.helpers.TheMovieServiceHelper;
import automation.api_tests.httperrorcode.HttpErrorCode;
import automation.api_tests.models.Movie;
import automation.api_tests.models.UnauthorizedResponse;
import automation.api_tests.utils.ConfigManager;
import automation.api_tests.utils.TestDataManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestGETMovie {
	
	private TheMovieServiceHelper theMovieServiceHelper;
	private static final String TOKEN = ConfigManager.getInstance().getString("token");
	private static final String API_KEY = ConfigManager.getInstance().getString("api_key");
	private static final String API_KEY_INVALID = ConfigManager.getInstance().getString("api_key_invalid");
	private static final String STATUS_MESSAGE = TestDataManager.getInstance().getString("status_message");
	private static final String STATUS_MESSAGE_NOT_FOUND = TestDataManager.getInstance().getString("status_message_not_found");
	private static final String MOVIE_LENGTH = TestDataManager.getInstance().getString("movie_length");
	private static final String PRODUCTION_COMPANY_NAME = TestDataManager.getInstance().getString("production_company_name");
	private static final Logger logger = Logger.getLogger(TestGETMovie.class);
	
	private Movie movieList;
	private UnauthorizedResponse unauthorizedResponse;
	
	
	@BeforeClass
	public void init() {
		try {
			theMovieServiceHelper = new TheMovieServiceHelper();
			logger.info("Instance of TheMovieServiceHelper is created");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	// GET call with valid api key 
	@Test
	public void testGetTopRatedMovieByAPIKey() throws ParseException, IOException {
		
		Response response = RestAssured
				.given()
				.queryParam("api_key", API_KEY)
				.contentType(ContentType.JSON)
				.get(EndPoints.GET_TOP_RATED_MOVIE)
				.andReturn();
		
		JsonParser jsonParser = JsonParser.DEFAULT;
		
		movieList = jsonParser.parse(response.asString(), Movie.class);
		
		int statusCode = response.getStatusCode();
		
		AssertJUnit.assertEquals(statusCode, HttpErrorCode.OK);
		logger.info("Response code is success ok - [" + statusCode + "]");
		
		int movieLength = movieList.getGenres().size();
		AssertJUnit.assertEquals(movieLength, Integer.parseInt(MOVIE_LENGTH));
		logger.info("Total number of movie: " + movieLength);
		
		String productionCompanyName = movieList.getProduction_companies().get(0).getName();
		AssertJUnit.assertEquals(productionCompanyName, PRODUCTION_COMPANY_NAME);
		logger.info("Name of Production Company: " + productionCompanyName);
	}
	
	//GET call with invalid api key (Unauthorized)
	@Test()
	public void testGetTopRatedMovieByAPIKeyInvalid() throws ParseException, IOException {
			
		Response response = RestAssured
				.given()
	 			.queryParam("api_key", API_KEY_INVALID)
				.contentType(ContentType.JSON)
				.get(EndPoints.GET_TOP_RATED_MOVIE)
				.andReturn();
			
		JsonParser jsonParser = JsonParser.DEFAULT;
			
		unauthorizedResponse = jsonParser.parse(response.asString(), UnauthorizedResponse.class);
			
		int statusCode = response.getStatusCode();	
		assertEquals(statusCode, HttpErrorCode.UNAUTHORIZED);
		logger.info("Response code is unauthoriaed - [" + statusCode + "]");
		
		String statusMessage = unauthorizedResponse.getStatus_message();
		assertEquals(statusMessage, STATUS_MESSAGE);
		logger.info(statusMessage);
	}
	
	// No found 
	@Test
	public void testNotFound() throws ParseException, IOException {
			
		Response response = RestAssured
				.given()
				.queryParam("api_key", API_KEY)
				.contentType(ContentType.JSON)
				.get(EndPoints.INVALID_ENDPOINT)
				.andReturn();
			
		JsonParser jsonParser = JsonParser.DEFAULT;
			
		unauthorizedResponse = jsonParser.parse(response.asString(), UnauthorizedResponse.class);
			
		int statusCode = response.getStatusCode();
			
		assertEquals(statusCode, HttpErrorCode.NOT_FOUND);
		logger.info("Site is not found [" + statusCode + "]");
		String statusMessage = unauthorizedResponse.getStatus_message();
		assertEquals(statusMessage, STATUS_MESSAGE_NOT_FOUND);
		logger.info(statusMessage);
	}
	
	
	// Run test with Bearer token but currently it is disabled because same test written above - 
	// using API_KEY authorization
	@Test()
	public void testGetTopRatedMovieByToken() throws ParseException, IOException {
		
		Response response = RestAssured
				.given()
				.headers("Authorization", TOKEN)
				.contentType(ContentType.JSON)
				.get(EndPoints.GET_TOP_RATED_MOVIE)
				.andReturn();
		
		JsonParser jsonParser = JsonParser.DEFAULT;
		
		movieList = jsonParser.parse(response.asString(), Movie.class);
		
		int statusCode = response.getStatusCode();
		
		assertEquals(statusCode, HttpErrorCode.OK);
		logger.info("Response code is success ok - [" + statusCode + "]");
	}
}
