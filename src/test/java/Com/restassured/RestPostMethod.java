package Com.restassured;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class RestPostMethod {
	@Test
	public void main(String[] args) {
		
		RestAssured.baseURI="https://api.github.com";
		String bearerToken="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";
	
		Response response = (Response) RestAssured.given()
				.headers("Authorization", "Bearer" + bearerToken)

				.body("{\r\n" + "\name\"Newrepo\"\r\n" + "}")
				
				.when().post("/user/repos")
				.then().log().all().extract().response();
		
		System.out.println(response.toString());
		
		System.out.println(response.getState());
		
				
	}
	
	
}
