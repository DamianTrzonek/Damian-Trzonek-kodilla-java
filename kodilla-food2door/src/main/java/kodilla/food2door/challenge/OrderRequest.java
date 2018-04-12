package kodilla.food2door.challenge;

import java.time.LocalDateTime;

public class OrderRequest {
    private Producer producer;
    private User user;
    private Product product;
    private LocalDateTime at;

    public OrderRequest(final Producer producer, final Product product, final User user) {
        this.producer = producer;
        this.product = product;
        this.user = user;
        this.at = LocalDateTime.now();
    }

    public Producer getProducer() {
        return producer;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getAt() {
        return at;
    }

    public Product getProduct() {
        return product;
    }
}