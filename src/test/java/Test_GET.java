import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Test_GET {

	@Test
	public void test_1() {
		
		given().
			header("Content-Type", "application/json").
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data.id[1]", equalTo(8)).
			body("data.first_name", hasItems("Michael", "Lindsay"));

	}
	
	@Test
	public void test_2_AA_GET() {
		
		given().
			header("Content-Type", "application/json").
			get("https://www.theaa.com/breakdown-cover/broken-down/safety-first").
		then().
			statusCode(200);
	}
	
	@Test
	public void test_3_reqres_GET() {
		
		Response response = RestAssured.get("https://reqres.in/");
		
		System.out.println(response.statusCode());
		System.out.println(response.getContentType());
		System.out.println(response.);
		
		given().
			header("Content-Type", "application/json").
			get("https://reqres.in/").
		then().
			statusCode(200);
	}
}
