package com.Market.ecommerce.Persistene;

import com.Market.ecommerce.Persistene.crud.ProductoCrudRepository;
import com.Market.ecommerce.Persistene.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }


}
