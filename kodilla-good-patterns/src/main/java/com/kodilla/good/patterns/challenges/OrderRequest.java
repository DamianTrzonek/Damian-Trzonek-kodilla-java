package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime at;

    public OrderRequest(final User user, final  Product product, final  LocalDateTime at) {
        this.user = user;
        this.product = product;
        this.at = at;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getAt() {
        return at;
    }
}
