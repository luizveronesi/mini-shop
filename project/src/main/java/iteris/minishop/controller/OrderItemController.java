package iteris.minishop.controller;

import java.util.List;

import iteris.minishop.domain.OrderItem;
import iteris.minishop.service.OrderItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/item")
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping(value = "/list")
	public ResponseEntity<List<OrderItem>> list() {
		return ResponseEntity.ok(orderItemService.list());
	}
}