package kodilla.food2door.challenge;


public class FoodOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        System.out.println("Order of " + orderRequest.getProduct().getQuantity() + " "
                + orderRequest.getProduct().getName() + " from " + orderRequest.getUser().toString() + " has been created at local repository.");
        return true;
    }
}
