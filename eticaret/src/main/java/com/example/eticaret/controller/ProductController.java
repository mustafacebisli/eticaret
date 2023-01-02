package com.example.eticaret.controller;

import com.example.eticaret.modul.Product;
import com.example.eticaret.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/addproduct")
    public List<Product> addProduct(@RequestBody List<Product> productList){
        productService.addAllProduct(productList);
        return productList;
    }
    @GetMapping("/getproducts")
    public List<Product> getAllProduct(){
        List<Product> products = productService.getAllProduct();
        return products;
    }

    @DeleteMapping("/deleteProducts")
    public HttpStatus deleteProducts(@RequestBody List<Long> productIdList){
        productService.deleteProducts(productIdList);
        return HttpStatus.OK;
    }
}
