package com.example.project.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.project.domain.Product;
import com.example.project.repository.ProductRepository;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product get(Integer id) {
		return productRepository.getOne(id);
	}

	public Boolean upload(xxx) {
		// grvar o arquivo numa pasta local
	}
}