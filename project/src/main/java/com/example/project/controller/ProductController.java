package com.example.project.controller;

import java.util.List;

import com.example.project.domain.Product;
import com.example.project.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/list")
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.ok(productService.findAll());
	}

	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id) {
		return ResponseEntity.ok(productService.get(id));
	}

	@PostMapping(value = "/upload")
	public ResponseEntity<Boolean> upload(@RequestBody xxx) {
		return ResponseEntity.ok(productService.upload(xxx));
	}
}