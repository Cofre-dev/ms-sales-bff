package cl.duoc.ms_sales_bff.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@FeignClient(name="ms-sales-bs", url="http://localhost:8184/")
public interface SalesDbFeignClient {

    @GetMapping("products")
    public List<SalesDTO> selectAllProducts();

}
