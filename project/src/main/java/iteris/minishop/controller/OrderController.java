package iteris.minishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iteris.minishop.domain.Order;
import iteris.minishop.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/list")
	public ResponseEntity<List<Order>> list() {
		return ResponseEntity.ok(orderService.list());
	}

	@GetMapping(value = "/page/{page}/{start}")
	public ResponseEntity<Page<Order>> page(@PathVariable Integer page, @PathVariable Integer start) {
		return ResponseEntity.ok(orderService.page(page, start));
	}
}