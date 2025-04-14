package apitesting;

import java.util.ArrayList;
import java.util.HashMap;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassComplexJsonInBodyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,Object> h= new HashMap<String,Object>();
		h.put("name", "Dharmendra");
		h.put("eamil","trainer@nowhwere.com");
		h.put( "age","36");
		h.put("is_admin","true");
		
		
		ArrayList<Integer> ArrphoneNumber=new ArrayList<Integer>();
		ArrphoneNumber.add(123555);
		ArrphoneNumber.add(2454535);
		ArrphoneNumber.add(34553535);
		h.put("phone_number", ArrphoneNumber);
		
		ArrayList<String> ArrCars=new ArrayList<String>();
		ArrCars.add("MBR");
		ArrCars.add("MRC");
		ArrCars.add("AUDI");
		h.put("Cars", ArrCars);
		
		
		HashMap<String,Object> AddressMap= new HashMap<String,Object>();
		
		ArrayList<String> ArrHouseNo=new ArrayList<String>();
		ArrHouseNo.add("A-234");
		ArrHouseNo.add("A-123");
		ArrHouseNo.add("A-345");
		AddressMap.put("Houseno", ArrHouseNo);
		
		
		ArrayList<Integer> ArrStreetNo=new ArrayList<Integer>();
		ArrStreetNo.add(2);
		ArrStreetNo.add(3);
		ArrStreetNo.add(4);
		AddressMap.put("street_no", ArrStreetNo);
		
		ArrayList<String> ArrCity=new ArrayList<String>();
		ArrCity.add("Delhi");
		ArrCity.add("Mumbai");
		ArrCity.add("Banglore");
		AddressMap.put("city", ArrCity);
		
		
		ArrayList<String> Arrstate=new ArrayList<String>();
		Arrstate.add("Delhi");
		Arrstate.add("Maharashtra");
		Arrstate.add("KArntaka");
		AddressMap.put("state", Arrstate);
		
		
		AddressMap.put("Country","India");
		
		h.put("Address", AddressMap);
		
		
		
		
		//Response response =given().contentType(ContentType.JSON).log().all().body(h).post("http://localhost:8080/api/users");
		Response response =given().contentType(ContentType.JSON).log().all().body(h).post("https://reqres.in/api/users");
		response.prettyPrint();
		System.out.println("Status code is ------>"+response.statusCode());
		
	}

}
