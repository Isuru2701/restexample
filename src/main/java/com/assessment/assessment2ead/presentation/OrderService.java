package com.assessment.assessment2ead.presentation;

import com.assessment.assessment2ead.data.Order;
import com.assessment.assessment2ead.data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order updateOrder(Order order) {
        return orderRepo.save(order);
    }

    public Order makeOrder(Order order) {
        return orderRepo.save(order);
    }

    public String deleteOrderById(int id) {
        orderRepo.deleteById(id);
        return "order number " + id + " was successfully deleted";
    }
}
