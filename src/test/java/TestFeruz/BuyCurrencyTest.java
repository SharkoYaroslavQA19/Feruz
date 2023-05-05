package TestFeruz;

import Model.BuyCurrency;
import Specification.Specification;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

public class BuyCurrencyTest {
    @Test
    public void buyCurrency(){
        Specification.installSpecification(Specification.requestSpecification());
        BuyCurrency buyCurrency = new BuyCurrency("01104","10","2023-03-07T00:00:00.000Z","00270725","504314098","96030",
                "840",10980,12,"1212","001","028","ЯТТ Умархонов Муродулла Одилжон угли",
                "qqqqqqqqqqq",1,"038",123456,"2023-05-04T15:39:19.892Z",69206);
        Response response = given()
                .body(buyCurrency).log().all()
                .when()
                .post("buyCurrency")
                .then().log().all()
                .extract().response();
        Assert.assertEquals(200,response.getStatusCode());
    }
}
