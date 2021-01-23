package restassuredTests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class GetRequest {

	@Test
	public void getweatherdetails() {
		given()
		.when()
		.get("https://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City", equalTo("Hyderabad"))
		.header("Content-Type","application/json");
	}
}
