package UtilsRequest;

import Model.RequestFeruzBuy;


public class DataRequestBuy {

    public static RequestFeruzBuy postBuyCurrency(){
        return RequestFeruzBuy.builder()
                .branch("01104")
                .deal_number("10")
                .deal_date("2023-03-07T00:00:00.000Z")
                .client("00270725")
                .client_inn("504314098")
                .client_oked("96030")
                .currency_code("840")
                .currency_rate(10980.22D)
                .currency_amount(12)
                .contract_number("123123")
                .buy_purpose("001")
                .purpose_country("028")
                .client_name("ЯТТ Умархонов Муродулла Одилжон угли")
                .purpose_detail("aaaaaaaaaaaaaa")
                .oper_id(1)
                .bank("038")
                .request_id(45454545454545L)
                .request_timestamp("2023-05-04T15:39:19.892Z")
                .message_id(78)
                .build();
    }

    public static RequestFeruzBuy postBuyCurrencyNotContract(){
        return RequestFeruzBuy.builder()
                .branch("01104")
                .deal_number("10")
                .deal_date("2023-03-07T00:00:00.000Z")
                .client("00270725")
                .client_inn("504314098")
                .client_oked("96030")
                .currency_code("840")
                .currency_rate(10980.44D)
                .currency_amount(12)
                .contract_number("")
                .buy_purpose("012")
                .purpose_country("028")
                .client_name("ЯТТ Умархонов Муродулла Одилжон угли")
                .purpose_detail("aaaaaaaaaaaaaa")
                .oper_id(1)
                .bank("038")
                .request_id(12345678901234L)
                .request_timestamp("2023-05-04T15:39:19.892Z")
                .message_id(78)
                .build();
    }

    public static RequestFeruzBuy postBuyCurrencyEx(){
        return RequestFeruzBuy.builder()
                .branch("01104")
                .deal_number("10")
                .deal_date("2023-03-07T00:00:00.000Z")
                .client("00270725")
                .client_inn("504314098")
                .client_oked("96030")
                .currency_code("840")
                .currency_rate(10980.22D)
                .currency_amount(12)
                .contract_number("№12-55 CSTrrr")
                .buy_purpose("001")
                .purpose_country("028")
                .client_name("ЯТТ Умархонов Муродулла Одилжон угли")
                .purpose_detail("aaaaaaaaaaaaaa")
                .bank("038")
                .request_id(121212121212L)
                .request_timestamp("2023-05-04T15:39:19.892Z")
                .message_id(78)
                .build();
    }
}
