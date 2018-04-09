package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(Product product, User user, LocalDateTime at) {
        System.out.println("Order of " + product.getQuantity() + " " + product.getName() + " made by "
        + user.getName() + " " + user.getSurname() + " at " + at.toString() + " was created in repository." );
        return true;
    }
}
