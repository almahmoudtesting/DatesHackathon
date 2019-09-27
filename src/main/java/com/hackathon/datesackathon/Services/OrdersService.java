package com.hackathon.datesackathon.Services;

import com.hackathon.datesackathon.Models.Orders;
import com.hackathon.datesackathon.Repo.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepo ordersRepo;

    public List<Orders> findOrders(){return ordersRepo.findAll();}

    public  Orders addOrder(Orders orders){ return ordersRepo.save(orders);}

    public Optional<Orders> findById(Long id){return ordersRepo.findById(id);}

    public void deleteById(Long id){ ordersRepo.deleteById(id);}
}
