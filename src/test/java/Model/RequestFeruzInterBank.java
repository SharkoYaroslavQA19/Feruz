package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFeruzInterBank {
    private String counterparty;
    private String direction;
    private String trade_date;
    private String execution_date;
    private String currency_code;
    private String currency_rate;
    private String currency_amount;
    private String bank;
    private Long request_id;
    private String request_timestamp;
    private Integer message_id;


}
