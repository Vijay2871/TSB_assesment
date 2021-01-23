package getrequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_delete {

	@Test
	public void test1()
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		
		JSONObject json=new JSONObject();
		json.put("id","7");
		json.put("first_name","vijay");
		json.put("last_name","biju");
		
		request.body(json.toJSONString());
		Response response=request.post("https://reqres.in/api/users");
		int code=response.getStatusCode();
		Assert.assertEquals(code,201);
		
}
}