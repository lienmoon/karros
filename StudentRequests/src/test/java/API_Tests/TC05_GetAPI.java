/*
 * Test a GET request to URL "https://my-json-server.typicode.com/lienmoon/karros-challenges/posts/1" that return a JSONObject
 * 
 * {
 * 	  "id": 1,
 * 	  "title": "Post 1"
 * }
 * 
 * Verify the returned statusCode equals to 200 is successful
 * Verify the response body if match with (1 & Post 1)
 * 
 */
package API_Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.response.Response;

public class TC05_GetAPI {
	
	/* Call an apiGetMethod from APIMethod class with the endPoint to GET API
	 * Assert the statusCode & response body if match with expected values 
	 */
	@Test 
	public void getPosts() {
		String endPoint = "https://my-json-server.typicode.com/lienmoon/karros-challenges/posts/1";
		Response response = APIMethods.apiGetMethod(endPoint);
		Assert.assertEquals(response.getStatusCode(), 200);		
		Assert.assertEquals(response.jsonPath().getInt("id"), 1);
		Assert.assertEquals(response.jsonPath().getString("title"), "Post 1");
	}
}
