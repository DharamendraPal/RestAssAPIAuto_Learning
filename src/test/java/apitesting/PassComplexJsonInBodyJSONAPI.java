package apitesting;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassComplexJsonInBodyJSONAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		JSONObject jsonobject =new JSONObject();
		
		jsonobject.put("name", "Dharmendra");
		jsonobject.put("eamil","trainer@nowhwere.com");
		jsonobject.put( "age","36");
		jsonobject.put("is_admin","true");
		
		JSONArray ArrphoneNumber =new JSONArray();
		ArrphoneNumber.put(123555);
		ArrphoneNumber.put(2454535);
		ArrphoneNumber.put(34553535);
		jsonobject.put("phone_number",ArrphoneNumber);
		
		JSONArray ArrCars =new JSONArray();
		ArrCars.put("MBR");
		ArrCars.put("MRC");
		ArrCars.put("AUDI");
		jsonobject.put("Cars",ArrCars);
		
		JSONObject AddressObject =new JSONObject();
		
		JSONArray ArrHouseNo =new JSONArray();
		ArrHouseNo.put("A-234");
		ArrHouseNo.put("A-123");
		ArrHouseNo.put("A-345");
		AddressObject.put("Houseno", ArrHouseNo);
		
	
		JSONArray ArrStreetNo =new JSONArray();
		ArrStreetNo.put(2);
		ArrStreetNo.put(3);
		ArrStreetNo.put(4);
		AddressObject.put("street_no", ArrStreetNo);
		
		
		
		JSONArray Arrcity =new JSONArray();
		Arrcity.put("Delhi");
		Arrcity.put("Mumbai");
		Arrcity.put("Banglore");
		AddressObject.put("city", Arrcity);
		
		JSONArray Arrstate =new JSONArray();
		Arrstate.put("Delhi");
		Arrstate.put("Maharashtra");
		Arrstate.put("KArntaka");
		AddressObject.put("state", Arrstate);
		
		
		AddressObject.put("Country", "India");
		
		jsonobject.put("Address",AddressObject);
		
		Response response =given().contentType(ContentType.JSON).log().all().body(jsonobject.toString()).post("http://localhost:8080/api/users");
		//Response response =given().contentType(ContentType.JSON).log().all().body(jsonobject.toString()).post("https://reqres.in/api/users");
		response.prettyPrint();
		System.out.println("Status code is ------>"+response.statusCode());
		
	
	}

}
