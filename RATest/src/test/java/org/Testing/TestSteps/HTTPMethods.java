package org.Testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {

	Properties pr;

	public HTTPMethods(Properties pr) {
		this.pr=pr;
	}
	
	public void PostRequest(String body) {
		Response res=
	given()
	.contentType(com.jayway.restassured.http.ContentType.JSON)
	.body(body)
	.when()
	.post(pr.getProperty("QA_URI"));
	System.out.println("status code of Post request returned is : "+res.getStatusCode());
	System.out.println("Response = "+res.toString());
	
}
}
