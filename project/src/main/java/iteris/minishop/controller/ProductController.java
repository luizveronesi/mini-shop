package iteris.minishop.controller;

import java.util.List;

import iteris.minishop.domain.Product;
import iteris.minishop.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/list")
	public ResponseEntity<List<Product>> list() {
		return ResponseEntity.ok(productService.list());
	}

	@PostMapping(value = "/upload/{id}", consumes = "multipart/form-data")
	public ResponseEntity<String> upload(@RequestParam MultipartFile file, @PathVariable Integer id) {
		return new ResponseEntity<>(productService.upload(file, id), HttpStatus.OK);
    }
}