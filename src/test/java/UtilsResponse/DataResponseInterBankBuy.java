package UtilsResponse;

import Model.ResponseFeruzAll;

public class DataResponseInterBankBuy {

    public static ResponseFeruzAll responseInterBankBuy(){
        return ResponseFeruzAll.builder()
                .error("")
                .message("")
                .request_id("")
                .response_id("")
                .build();
    }
}
