package apitesting;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class ExtractFieldValuesFromResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response response=given().auth().basic("", "")
				  .formParam("name","Mahesh")
				  .formParam("email","Mahesh@test.com")
				  .formParam("description", "Adding Mahesh From RrstAssured")
				  .formParam("address[line1]", "Mira Road,Thane")
				  .formParam("preferred_locales[0]","world")
				  .formParam("preferred_locales[1]","wide")
				  .post("https://api.stripe.com/v1/customers");
		
		response.prettyPrint();
		
		JsonPath json=response.jsonPath();
		
		System.out.println(json.get("id"));
		
		System.out.println(response.jsonPath().get("name"));
		System.out.println(response.jsonPath().get("address.line1"));
		
		System.out.println(response.jsonPath().get("preferred_locales[0]"));
		
		System.out.println(response.jsonPath().getMap("$").size()); //$ is wild card for All fields
		System.out.println(response.jsonPath().getMap("address").size());
		
		System.out.println("Status Code is ------->"+response.statusCode());
	}

}
