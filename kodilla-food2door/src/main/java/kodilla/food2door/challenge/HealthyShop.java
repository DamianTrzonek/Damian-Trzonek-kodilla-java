package kodilla.food2door.challenge;


public class HealthyShop implements Producer {
    private static final String HEALTHY_SHOP = "Healthy Shop";

    public String getName() {
        return HEALTHY_SHOP;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Thank you for your order of " + orderRequest.getProduct().getQuantity() + " "
                + orderRequest.getProduct().getName()
                + ".Your order will be ready to go in 15 min.");
        return true;
    }
}