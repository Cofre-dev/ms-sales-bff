package cl.duoc.ms_sales_bff.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_sales_bff.clients.SalesDbFeignClient;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@Service
public class ProductService {

    @Autowired
    SalesDbFeignClient salesDbFeignClient;

    public List<SalesDTO> selectAllProducts(){
        List<SalesDTO> listaProductos = salesDbFeignClient.selectAllProducts();
        return listaProductos;
    }
}
