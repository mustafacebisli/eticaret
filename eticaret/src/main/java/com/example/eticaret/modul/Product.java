package com.example.eticaret.modul;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @NonNull
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "quantity_in_stock")
    private int quantityInStock;
    @NonNull
    @Column(name = "upload_date")
    private Date uploadDate;
    @Column(name = "modifiedDate")
    private Date modifiedDate;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
