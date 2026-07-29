package com.RestAssured;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class RestAssuredBDD {

    public static void main(String[] args) {

        Response response = given()
                .when()
                .get("https://dummy.restapiexample.com/api/v1/employees")
                .then()
                .extract()
                .response();

      //Status
      		System.out.println("Status Code:"+response.getStatusCode());
      		
      		//Complete Response
      		System.out.println("Complete Response :");
      		System.out.println(response.asPrettyString());
      		
      		//Response Body
      		System.out.println("Response Body :");
      		System.out.println(response.getBody().asPrettyString());
      		
      		//Status Line
      		
      		System.out.println("Status Line:"+response.getStatusLine());
      		
      		//Content Type
      		System.out.println("Content Type:"+response.getContentType());
      		
      		//Response Time
      		System.out.println("Response Time:"+response.getTime());
    }
}




