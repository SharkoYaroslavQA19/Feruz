package TestFeruz;

import DataBase.DataForTheRequest;
import Model.BuyCurrency;
import Specification.Specification;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class BuyCurrencyTest {
    @Test(groups = {"feruz"})
    public void buyCurrencyTest(){
        Specification.installSpecification(Specification.requestSpecification());
        BuyCurrency buyCurrency = DataForTheRequest.getBuyCurrency();
        Response response = given()
                .body(buyCurrency).log().all()
                .when()
                .post("buyCurrency")
                .then().log().all()
                .extract().response();
        Assert.assertEquals(200,response.getStatusCode());

    }

    @Test(groups = {"feruz"})
    public void buyCurrencyNotContractTest(){
        Specification.installSpecification(Specification.requestSpecification());
        BuyCurrency buyCurrency = DataForTheRequest.getBuyCurrencyNotContract();
        Response response = given()
                .body(buyCurrency).log().all()
                .when()
                .post("buyCurrency")
                .then().log().all()
                .extract().response();
        Assert.assertEquals(200,response.getStatusCode());

    }

    @Test(groups = {"feruz"})
    public void buyCurrencyExTest(){
        Specification.installSpecification(Specification.requestSpecification());
        BuyCurrency buyCurrency = DataForTheRequest.getBuyCurrencyEx();
        Response response = given()
                .body(buyCurrency).log().all()
                .when()
                .post("buyCurrency")
                .then().log().all()
                .extract().response();
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals("40000",response.path("error"));
        Assert.assertEquals("12345678901234",response.path("request_id"));
        Assert.assertEquals("Validation error.",response.path("message"));

    }
}