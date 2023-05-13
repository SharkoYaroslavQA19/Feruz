package TestFeruz;

import Model.RequestFeruzInterBank;
import Model.ResponseFeruzAll;
import Specification.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static UtilsRequest.DataRequestFeruzInterBankSale.postInterBankSale;
import static UtilsResponse.DataResponseInterBankSale.responseInterBankSale;
import static io.restassured.RestAssured.given;

public class SaleCurrencyInterBankSaleTest {

    private final static String ENDPOINT = "interbankCurrency";

    @Test
    public void InterBankSaleTest(){
        Specification.installSpecification(Specification.requestSpecification(),Specification.responseSpecification(200));
        RequestFeruzInterBank requestFeruzInterBank = postInterBankSale();
        ResponseFeruzAll responseFeruzAll = given()
                .body(requestFeruzInterBank)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().as(ResponseFeruzAll.class);
        Assert.assertEquals(responseInterBankSale(),responseFeruzAll);

    }
}
