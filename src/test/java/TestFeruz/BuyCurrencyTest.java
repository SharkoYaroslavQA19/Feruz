package TestFeruz;

import Model.RequestFeruzBuy;
import Model.ResponseFeruzAll;
import Specification.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static UtilsRequest.DataRequestBuy.*;
import static UtilsResponse.DataResponseBuy.responseBuy;
import static io.restassured.RestAssured.given;

public class BuyCurrencyTest {

    private final static String ENDPOINT = "buyCurrency";

    @Test
    public void buyCurrencyTest(){
        Specification.installSpecification(Specification.requestSpecification(),Specification.responseSpecification(200));
        RequestFeruzBuy buyCurrency = postBuyCurrency();
        ResponseFeruzAll responseFeruzAll = given()
                .body(buyCurrency)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().as(ResponseFeruzAll.class);
        Assert.assertEquals(responseBuy(), responseFeruzAll);

    }

    @Test
    public void buyCurrencyNotContractTest(){
        Specification.installSpecification(Specification.requestSpecification(),Specification.responseSpecification(200));
        RequestFeruzBuy buyCurrency = postBuyCurrencyNotContract();
        ResponseFeruzAll responseFeruzAll = given()
                .body(buyCurrency)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().as(ResponseFeruzAll.class);
        Assert.assertEquals(responseBuy(), responseFeruzAll);

    }

    @Test
    public void buyCurrencyExTest(){
        Specification.installSpecification(Specification.requestSpecification(),Specification.responseSpecification(200));
        RequestFeruzBuy buyCurrency = postBuyCurrencyEx();
        ResponseFeruzAll responseFeruzAll =  given()
                .body(buyCurrency)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().as(ResponseFeruzAll.class);
        Assert.assertEquals(responseBuy(), responseFeruzAll);

    }
}