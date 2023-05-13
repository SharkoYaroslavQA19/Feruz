package Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFeruzSale {

    private String branch;
    private String deal_number;
    private String deal_date;
    private String client;
    private String client_inn;
    private String client_oked;
    private String currency_code;
    private Double currency_rate;
    private Integer currency_amount;
    private String currency_source;
    private String client_name;
    private Integer oper_id;
    private String bank;
    private Long request_id;
    private String request_timestamp;
    private Integer message_id;
}
