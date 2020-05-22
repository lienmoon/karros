/*
 * Class: API Method is using Rest Assured and HTTP requests to send to server
 * 
 */
package API_Tests;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class APIMethods {

	/*
	 * Send a HttpRequest request included GET Method and endpoint 
	 * Return a response
	 */	
	public static Response apiGetMethod(String endpoint) {
		RestAssured.baseURI = endpoint;

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("content-type", "application/json");
		Response response = httpRequest.request(Method.GET, RestAssured.baseURI);

		return response;
	}

	/*
	 * Send a HttpRequest request included POST Method and endpoint 
	 * Return a response
	 */
	public static Response apiPostMethod(String endpoint, JSONObject requestParams) {
		RestAssured.baseURI = endpoint;

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("content-type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST, RestAssured.baseURI);
		
		return response;
	}
	
}
