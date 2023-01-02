package com.example.eticaret.repository;

import com.example.eticaret.modul.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    void deleteByIdIn(List<Long> productIdList);
}
