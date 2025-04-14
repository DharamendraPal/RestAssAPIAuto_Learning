package apitesting;
import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.Matchers.* ;

import io.restassured.response.Response;

public class SendingGetRequest {
	
	/**
	 * Set Authentication : Basic Auth /Bearer token using Headers
	 * 
	 * Request ---->set of Request specifications
	 * 
	 * Response----->do validation
	 * 
	 * content type in RestaSsured can be provied by 2 Ways
	 *   1. -------Using Content Type()
	 *   2.adding the content type in the headers
	 *   COntent type is also type of Specifications
	 *   
	 * 
	 * 
	 * 
	 * */
	
     
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Response response=given().auth().basic("", "").get("https://api.stripe.com/v1/customers");
		
		//We can pass Param as well in our Request . // Instead of Param We can also use FormParam to send  Multiple Param like Email etc. Also if i paste paste Para after Basic then also we get same response output
		//Response response=given().params("limit","1").auth().basic("", "").get("https://api.stripe.com/v1/customers");
		
		//Response response=given().auth().basic("", "").params("limit","1").get("https://api.stripe.com/v1/customers");
		
		Response response=given().auth().basic("", "").formParam("limit","1").formParams("email","test@Dharamaproduction.com").get("https://api.stripe.com/v1/customers");
		
		
		//This is one way to print ouput of RestAssured output. This prettyPrint method do not have to be stored in variable .It can be printed directly
		//response.prettyPrint();
		
		
		//If we are using asString mthod then  We have to store output into String variable then we can print the output
		String response1 =response.asString();
		System.out.println(response1);
		
		
		
		System.out.println("Statsus code is ----->"+response.statusCode());
		
		//**below are 3 different way of Defining Content Type
		//given().contentType("ContentType.JSON");
		//OR
		//given().contentType("application/json");
		//OR
		//given().header("content-type","application/json").auth().basic("","");
		//These content Type are only and only used when It is required as per API Documentation else do not use 
		//STRIP API Which i am using in this prigramme don't require content type	
	}


	
/*	
public static void main(String [] args)
{
	//Code to Retrive Record of one particular Customers
	//Also using Headers Bearer  authentication instead of Basic Auth
	
	Response response=given().header("Authorization","Bearer ").get("https://api.stripe.com/v1/customers/cus_S7eYbYUbbSR0HP");
	
	response.prettyPrint();
	
}
*/
	



}
