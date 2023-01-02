package com.example.eticaret.repository;

import com.example.eticaret.modul.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
