package UtilsRequest;

import Model.RequestFeruzInterBank;

public class DataRequestFeruzInterBankBuy {

    public static RequestFeruzInterBank postRequestBuy(){
        return RequestFeruzInterBank.builder()
                .counterparty("004")
                .direction("2")
                .trade_date("2023-03-07T00:00:00.000Z")
                .execution_date("2023-03-07T00:00:00.000Z")
                .currency_code("978")
                .currency_rate("1055.55")
                .currency_amount("10553000")
                .bank("038")
                .request_id(23133140000045L)
                .request_timestamp("2023-05-13T14:03:25.688Z")
                .message_id(74812)
                .build();
    }
}
