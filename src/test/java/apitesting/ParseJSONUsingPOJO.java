package apitesting;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParseJSONUsingPOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//For Printing Multiple value from Address Field
		Address address = new Address("India", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
		address.setstreet_nos(2, 3, 4);
		address.setHouseno("A-234", "A-123", "A-345");
		address.setCityList("Delhi", "Mumbai", "Banglore");
		address.setStateList("Delhi", "Maharashtra", "KArntaka");
		Users s =new Users("Shobhnath@test.com","Shobhnath",36,true,address);
		*/
		
		
		//For Printing Single  value from Address Field
		Users s =new Users("Shobhnath@test.com","Shobhnath",36,true,"India","2","A-234","Delhi","Delhi");
		
		s.setPhoneNumbers(123555,2454535,34553535);
		s.setCars("MBR","MRC","AUDI");
		Response response =given().contentType(ContentType.JSON).log().all().body(s).post("http://localhost:8080/api/users");
		//Response response =given().contentType(ContentType.JSON).log().all().body(h).post("https://reqres.in/api/users");
		response.prettyPrint();
		System.out.println("Status code is ------>"+response.statusCode());
	}

}
