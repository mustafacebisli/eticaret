package com.example.eticaret.controller;

import com.example.eticaret.modul.Category;
import com.example.eticaret.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @PostMapping("/addallcategory")
    public List<Category> addAllCategory(@RequestBody List<Category> categoryList){
        categoryService.addAllCategory(categoryList);
        return categoryList;
    }
}
