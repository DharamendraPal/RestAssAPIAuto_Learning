package apitesting;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.response.Response;

public class SendingPOSTRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Sending Post Request Through FormParam
		/*
		Response response=given().auth().basic("", "")
						  //.formParam("name","Pinku Mandal").formParam("email","Pinkumandal@test.com").formParam("description", "Adding PinkuMandal From RrstAssured")
						  .formParam("name","Suresh Mohan").formParam("email","SureshMohan@temp.com").formParam("description", "Adding sureshMohan From RrstAssured")
						  //.formParam("name","Dinanath").formParam("email","Dinanath@Yahoo.com").formParam("description", "Adding Dinanath From RrstAssured")
						  .post("https://api.stripe.com/v1/customers");
		*/
		
		
		
		/*
		//Sending Post Request Through JSON String Data
		//Stripe Api do not accept JSON Data so that s why When it  accept the POST request with JSON Data  then  Request get passed but Data get ignored so Data is not visible on UI.
		//Stripe Accept data in application/x-www-form-urlencoded only. if we pass data in formParama then POSt request get passed and Data is also visible on UI  
		//But this will work on Resreq API. 
		String JesonBody ="{\'name\':\'AdvaitPal\',\"email\":\"Advait@Oal.com\",\"description\":\"Adding AdvaitPal From RrstAssured\"}" ;
		Response response=given().contentType("application/x-www-form-urlencoded").auth().basic("", "").formParam(JesonBody).post("https://api.stripe.com/v1/customers");
		response.prettyPrint();
		System.out.println("Status Code is ------->"+response.statusCode());
		
		*/
		
		
		/*
		//Sending Data in HashMap form
		
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("name", "Komal Pal");
		h.put("email", "Komal@Oal.com");
		h.put("description", "Adding KOmal Pal From RrstAssured");
		Response response=given().auth().basic("", "").formParams(h).post("https://api.stripe.com/v1/customers");
		response.prettyPrint();
		System.out.println("Status Code is ------->"+response.statusCode());
		*/
		
		
		//Reading Data from External JAson File .Stripe API do nt accept data in JASON file .it will give error . but if we use other API like Resreq or other own Api then it will work ...
		//Response response=given().contentType("application/x-www-form-urlencoded").auth().basic("","").body(new File("./users.json")).post("https://api.stripe.com/v1/customers");
		
		Response response=given().contentType("ContentType.JSON").log().all().body(new File("./users.json")).post("https://reqres.in/api/users");
		response.prettyPrint();
		System.out.println("Status Code is ------->"+response.statusCode());
		
		
		
	}

}
