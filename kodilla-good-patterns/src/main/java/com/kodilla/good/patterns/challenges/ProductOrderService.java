package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean isOrdered(Product product, User user, LocalDateTime at) {
        System.out.println(product.getQuantity() + " " + product.getName() + " is ordered by " + user.getName()
                + " " + user.getSurname() + " at " + at.toString());
        return true;

    }
}
