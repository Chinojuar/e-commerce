package com.Market.ecommerce.Persistene.Mapper;

import com.Market.ecommerce.Domain.Category;
import com.Market.ecommerce.Domain.Product;
import com.Market.ecommerce.Persistene.entity.Categoria;
import com.Market.ecommerce.Persistene.entity.Producto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto",target = "productId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "precioVenta",target = "price"),
            @Mapping(source = "cantidadStock",target = "stock"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "categoria",target = "category"),

    })

    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritConfiguration
    @Mapping(target = "codigoBarras",ignore = true)
    Producto toProducto(Product product);
}
