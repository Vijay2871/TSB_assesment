package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	@Test
	public void responsecode()
	{
	Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	int code=resp.getStatusCode();
	
	System.out.println("Status is "+code);
	Assert.assertEquals(code,200);
	}

	@Test
	public void responsebody()
	{
	Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	String data=resp.asString();
	
	System.out.println("Status is "+data);
	System.out.println("Response time is "+resp.time());
	}

}
