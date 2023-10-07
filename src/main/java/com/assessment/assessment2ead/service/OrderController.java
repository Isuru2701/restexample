package com.assessment.assessment2ead.service;

import com.assessment.assessment2ead.data.Order;
import com.assessment.assessment2ead.presentation.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping(path = "/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();

    }

    @PostMapping("/orders")
    public Order makeOrder(@RequestBody Order order) {
        return orderService.makeOrder(order);
    }

    @PutMapping("/orders")
    public Order updateOrder(@RequestBody Order order) {
        return orderService.updateOrder(order);
    }

    @DeleteMapping(path = "/orders/{id}")
    public String deleteOrder(@PathVariable int id) {
        return orderService.deleteOrderById(id);
    }


}
