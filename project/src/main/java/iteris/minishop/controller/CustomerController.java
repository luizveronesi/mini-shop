package iteris.minishop.controller;

import java.util.List;

import iteris.minishop.domain.Customer;
import iteris.minishop.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/list")
	public ResponseEntity<List<Customer>> list() {
		return ResponseEntity.ok(customerService.list());
	}
}