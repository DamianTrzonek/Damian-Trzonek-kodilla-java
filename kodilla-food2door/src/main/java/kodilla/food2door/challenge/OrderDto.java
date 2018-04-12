package kodilla.food2door.challenge;

public class OrderDto {
    public OrderRequest orderRequest;
    public boolean isDelivered;

    public OrderDto(OrderRequest orderRequest, boolean isDelivered) {
        this.orderRequest = orderRequest;
        this.isDelivered = isDelivered;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}

