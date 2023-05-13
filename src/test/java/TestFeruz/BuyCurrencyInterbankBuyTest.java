package TestFeruz;

import Model.RequestFeruzInterBank;
import Model.ResponseFeruzAll;
import Specification.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static UtilsRequest.DataRequestFeruzInterBankBuy.postRequestBuy;
import static UtilsResponse.DataResponseInterBankBuy.responseInterBankBuy;
import static io.restassured.RestAssured.given;

public class BuyCurrencyInterbankBuyTest {

    private final static String ENDPOINT = "interbankCurrency";

    @Test
    public void InterBankBuy(){
        Specification.installSpecification(Specification.requestSpecification(),Specification.responseSpecification(200));
        RequestFeruzInterBank requestFeruzInterBank = postRequestBuy();
        ResponseFeruzAll responseFeruzAll = given()
                .body(requestFeruzInterBank)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().as(ResponseFeruzAll.class);
        Assert.assertEquals(responseInterBankBuy(),responseFeruzAll);
    }
}
