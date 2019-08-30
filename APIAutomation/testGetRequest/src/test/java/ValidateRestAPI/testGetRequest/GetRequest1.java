package ValidateRestAPI.testGetRequest;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest1 {
public static void main(String[] args) { //main method
	Response res= 
	given() 
	.contentType(ContentType.JSON)  // pre-condition set where Content type is JSON
	.when()
	.get("http://localhost:3000/posts"); // pass the API endpoint URI
	System.out.println("Status Code is : " +res.statusCode());
	if ((res.statusCode())==200) {       // verify if Response status is as Expected
		System.out.println("Status Code verified succesfully");
	}
	else {
		System.out.println("Status Code verification failed! The Status code recieved is "+res.statusCode());
	}
	System.out.println(res.asString());
} //end of main
} // end of class
