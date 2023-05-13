package UtilsRequest;

import Model.RequestFeruzSale;

public class DataRequestSale {

    public static RequestFeruzSale postRequestSale(){
        return RequestFeruzSale.builder()
                .branch("01104")
                .deal_number("10")
                .deal_date("2023-03-07T00:00:00.000Z")
                .client("00270725")
                .client_inn("504314098")
                .client_oked("96030")
                .currency_code("840")
                .currency_rate(10980.56D)
                .currency_amount(1)
                .currency_source("005")
                .client_name("AAAAAAAAAAAAAAAAAAAA")
                .oper_id(2)
                .bank("038")
                .request_id(12121212121212L)
                .request_timestamp("2023-05-04T15:39:19.892Z")
                .message_id(72118)
                .build();
    }
}
