package cl.duoc.ms_sales_bff.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_sales_bff.clients.SalesBsFeignClient;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@Service
public class ProductService {

    @Autowired
    SalesBsFeignClient salesDbFeignClient;

    public List<SalesDTO> selectAllProducts(){
        List<SalesDTO> listaProductos = (List<SalesDTO>) salesDbFeignClient.selectAllProducts();
        return listaProductos;
    }
}
