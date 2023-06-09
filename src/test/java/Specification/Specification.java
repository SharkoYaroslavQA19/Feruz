package Specification;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Specification {
    private final static String URL = String.valueOf(System.getProperty
            ("url","http://192.168.166.204/srcntint/integration-feruz/"));
    //http://192.168.166.204/ntint/integration-nibbd/
    //http://192.168.166.204/srcntint/integration-nibbd/
    public static RequestSpecification requestSpecification(){
        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification responseSpecification (Integer statusCode){
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .log(LogDetail.ALL)
                .build();
    }
    public static void installSpecification(RequestSpecification request,ResponseSpecification response){
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}