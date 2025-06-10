package cl.duoc.ms_sales_bff.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SalesDTO {
    //private String           sessionId;
    //private LocalDateTime    date;
    //private Integer          amount;
    //private List<ProductDTO> products;

    private Long customerId;
    private LocalDateTime orderDate;
    private double totalAmount;

}
