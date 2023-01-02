package com.example.eticaret.modul;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseModel {
    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "image")
    private String image;
}
