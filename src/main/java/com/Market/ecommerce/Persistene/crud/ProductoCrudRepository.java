package com.Market.ecommerce.Persistene.crud;

import com.Market.ecommerce.Persistene.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
}
