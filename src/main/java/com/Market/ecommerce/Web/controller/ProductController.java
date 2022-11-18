package com.Market.ecommerce.Web.controller;

import com.Market.ecommerce.Domain.Product;
import com.Market.ecommerce.Domain.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    public List<Product> getAll(){
        return productService.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoriId){
        return productService.getByCategory(categoriId);
    }

    public Optional<List<Product>> getScarseProducts(int quantity){
        return productService.getScarseProducts(quantity);
    }

    public Product save(Product product){
        return productService.save(product);
    }

    public Boolean delete(int productId){
        return productService.delete(productId);
    }
}
