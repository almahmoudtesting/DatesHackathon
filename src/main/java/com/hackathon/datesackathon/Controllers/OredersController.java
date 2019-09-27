package com.hackathon.datesackathon.Controllers;

import com.hackathon.datesackathon.Models.Orders;
import com.hackathon.datesackathon.Services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/Orders")
public class OredersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping
    public List<Orders> getAllOrders(){return  ordersService.findOrders();}

    @PostMapping
    public ResponseEntity create(@RequestBody Orders orders){
        return ResponseEntity.ok(ordersService.addOrder(orders));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Orders>> findById(@PathVariable Long id){
        return ResponseEntity.ok(ordersService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        ordersService.deleteById(id);
    }
}
