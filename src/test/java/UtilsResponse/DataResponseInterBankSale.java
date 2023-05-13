package UtilsResponse;

import Model.ResponseFeruzAll;

public class DataResponseInterBankSale {

    public static ResponseFeruzAll responseInterBankSale(){
        return ResponseFeruzAll.builder()
                .error("")
                .message("")
                .request_id("")
                .response_id("")
                .build();
    }
}
