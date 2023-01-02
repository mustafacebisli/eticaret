package com.example.eticaret.service;

import com.example.eticaret.modul.Product;
import com.example.eticaret.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public List<Product> addAllProduct(List<Product> productList) {
        Date date = Calendar.getInstance().getTime();
        for (Product product : productList) {
            product.setUploadDate(date);
        }
        productRepository.saveAll(productList);
        return productList;
    }

    public List<Product> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Transactional
    public void deleteProducts(List<Long> productIdList) {
        productRepository.deleteByIdIn(productIdList);
    }

}
