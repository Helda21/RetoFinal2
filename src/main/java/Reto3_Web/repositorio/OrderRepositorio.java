/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Web.repositorio;

import Reto3_Web.interfaces.InterfaceOrder;
import Reto3_Web.modelo.Order;
import Reto3_Web.modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author david
 */
@Repository
public class OrderRepositorio {

    @Autowired
    private InterfaceOrder repository;

    public List<Order> getAll() {
        return (List<Order>) repository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return repository.findById(id);
    }

    public Order create(Order order) {
        return repository.save(order);
    }

    public void update(Order order) {
        repository.save(order);
    }

    public void delete(Order order) {
        repository.delete(order);
    }
    
    public Optional<Order> lastUserId(){
        return repository.findTopByOrderByIdDesc();
    }
    
    public List<Order> findByZone(String zona) {
        return repository.findByZone(zona);
    }
}
