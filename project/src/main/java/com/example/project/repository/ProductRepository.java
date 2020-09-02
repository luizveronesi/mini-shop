package com.example.project.repository;

import java.util.List;

import com.example.project.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {    

    public List<Product> findByProductName(String name);
}