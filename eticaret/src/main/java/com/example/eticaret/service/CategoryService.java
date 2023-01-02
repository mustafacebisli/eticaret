package com.example.eticaret.service;

import com.example.eticaret.modul.Category;
import com.example.eticaret.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {


    @Autowired
    CategoryRepository categoryRepository;

    @Transactional
    public List<Category> addAllCategory(List<Category> categoryList){
        categoryRepository.saveAll(categoryList);
        return categoryList;
    }
}
