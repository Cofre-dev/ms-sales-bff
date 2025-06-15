package cl.duoc.ms_sales_bff.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@FeignClient(name="ms-sales-bs", url="http://localhost:8182/api/sales")
public interface SalesBsFeignClient {

    @GetMapping
    public ResponseEntity<List<SalesDTO>> selectAllProducts();


    @GetMapping("/{id}")
    public List<SalesDTO> findSalesById(@PathVariable("id") Long id);

}
