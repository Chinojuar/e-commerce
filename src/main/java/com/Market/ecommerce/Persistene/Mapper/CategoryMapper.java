package com.Market.ecommerce.Persistene.Mapper;

import com.Market.ecommerce.Domain.Category;
import com.Market.ecommerce.Persistene.entity.Categoria;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping( source = "idCategoria",target = "categoryId"),
            @Mapping( source = "descripcion",target = "category"),
            @Mapping( source = "estado",target = "active")
    })

    Category toCategory(Categoria categoria);

    @InheritConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);

}
