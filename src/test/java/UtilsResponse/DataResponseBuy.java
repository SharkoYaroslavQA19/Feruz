package UtilsResponse;

import Model.ResponseFeruzAll;

public class DataResponseBuy {

    public static ResponseFeruzAll responseBuy(){
        return ResponseFeruzAll.builder()
                .error("")
                .message("")
                .request_id("")
                .response_id("")
                .build();
    }
}
