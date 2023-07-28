package org.verizon.CommunicationService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationService.model.Orders;
import org.verizon.CommunicationService.service.OrderService;


@RestController
@RequestMapping("/api/Orders")
public class OrderController {
	private OrderService orderservice;
	
@Autowired
public OrderController(OrderService orderservice) {
	this.orderservice = orderservice;
	}
	
@RequestMapping("/allorders")
public List<Orders>getAllOrders(){
	return orderservice.getAllOrders();
}

@PostMapping("/insertorder")
public Orders createOrders(@RequestBody Orders order ) {
	return orderservice.createOrders(order);
}

/*@PostMapping("/{id}")
public Orders updateOrder(@PathVariable int id, @RequestBody Orders order ) {
	return orderservice.updateOrder(id,order);
}*/

@DeleteMapping("/{id}")
public void deleteOrder( @PathVariable int id) {
	orderservice.deleteOrder(id);
}
}
