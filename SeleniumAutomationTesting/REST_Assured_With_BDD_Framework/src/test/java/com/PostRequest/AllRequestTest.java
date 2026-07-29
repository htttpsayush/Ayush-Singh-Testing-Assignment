package com.PostRequest;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllRequestTest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private JSONObject testUser;
    private int createdUserId;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = BASE_URL;

        testUser = new JSONObject();
        testUser.put("name", "Test User");
        testUser.put("username", "ayush");
        testUser.put("email", "ayush.astepahead@gmail.com");
    }

    // ================= POST =================

    @Test(priority = 1)
    public void testPostRequestComplete() {

        System.out.println("\n================ POST REQUEST ================\n");

        JSONObject user = new JSONObject(testUser.toString());
        user.put("id", 1);

        System.out.println("Request Body:");
        System.out.println(user.toString(2));

        Response response = given()
                .header("Content-Type", "application/json")
                .body(user.toString())
                .when()
                .post("/users");

        printResponseDetails(response, "POST");

        Assert.assertEquals(response.getStatusCode(), 201);

        JSONObject responseJson = new JSONObject(response.getBody().asString());

        if (responseJson.has("id")) {
            createdUserId = responseJson.getInt("id");
            System.out.println("Created User ID : " + createdUserId);
        }
    }

    // ================= GET =================

    @Test(priority = 2)
    public void testGetRequest() {

        System.out.println("\n================ GET REQUEST ================\n");

        Response response = given()
                .when()
                .get("/users/1");

        printResponseDetails(response, "GET");

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // ================= PUT =================

    @Test(priority = 3)
    public void testPutRequestComplete() {

        System.out.println("\n================ PUT REQUEST ================\n");

        JSONObject updatedUser = new JSONObject();
        updatedUser.put("id", 1);
        updatedUser.put("name", "Updated User");
        updatedUser.put("username", "updateduser");
        updatedUser.put("email", "updated@gmail.com");

        System.out.println("Updated Body:");
        System.out.println(updatedUser.toString(2));

        Response response = given()
                .header("Content-Type", "application/json")
                .body(updatedUser.toString())
                .when()
                .put("/users/1");

        printResponseDetails(response, "PUT");

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // ================= DELETE =================

    @Test(priority = 4)
    public void testDeleteRequest() {

        System.out.println("\n================ DELETE REQUEST ================\n");

        Response response = given()
                .when()
                .delete("/users/1");

        printResponseDetails(response, "DELETE");

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // ================= Common Method =================

    public void printResponseDetails(Response response, String method) {

        System.out.println("------------- " + method + " RESPONSE -------------");

        System.out.println("Status Code : " + response.getStatusCode());

        System.out.println("Status Line : " + response.getStatusLine());

        System.out.println("Content Type : " + response.getContentType());

        System.out.println("Response Time : " + response.getTime() + " ms");

        System.out.println("Response Body :");

        System.out.println(response.getBody().asPrettyString());

        System.out.println("-----------------------------------------------");
    }
}