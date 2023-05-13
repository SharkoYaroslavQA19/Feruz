package UtilsResponse;

import Model.ResponseFeruzAll;

public class DataResponseSale {
    public static ResponseFeruzAll responseSale (){
        return ResponseFeruzAll.builder()
                .error("0")
                .message("")
                .request_id("12121212121212")
                .response_id("21007012000187")
                .build();
    }
}
