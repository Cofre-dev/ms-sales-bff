package cl.duoc.ms_sales_bff.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bff.model.dto.SalesDTO;
import cl.duoc.ms_sales_bff.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SalesController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<SalesDTO> selectAllProducts() {
        return productService.selectAllProducts();
    }
    

}
