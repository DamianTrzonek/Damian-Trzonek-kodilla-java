package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Mark", "Sample", "mark@email.com");
        Product product = new Product("White Paper", 120);
        LocalDateTime at = LocalDateTime.of(2018, 6, 15,15,11);

        return new OrderRequest(user, product, at);
    }
}
