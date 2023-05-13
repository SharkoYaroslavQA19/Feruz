package TestFeruz;

import Model.RequestFeruzSale;
import Model.ResponseFeruzAll;
import Specification.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static UtilsRequest.DataRequestSale.postRequestSale;
import static UtilsResponse.DataResponseSale.responseSale;
import static io.restassured.RestAssured.given;

public class SaleCurrencyTest {
    private final static String ENDPOINT = "saleCurrency";

    @Test
    public void saleCurrencyTest(){
        Specification.installSpecification(Specification.requestSpecification(),Specification.responseSpecification(200));
        RequestFeruzSale saleCurrency = postRequestSale();
        ResponseFeruzAll responseFeruzAll =  given()
                .body(saleCurrency)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().as(ResponseFeruzAll.class);
        Assert.assertEquals(responseSale(), responseFeruzAll);

    }

}
