package kodilla.food2door.challenge;

public class GlutenFreeShop implements Producer {
    private static final String GLUTEN_FREE_SHOP = "Gluten Free Shop";
    private Product product;

    public String getName() {
        return GLUTEN_FREE_SHOP;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Thank you for ordering in Gluten Free Shop. Your order is being processed.");
        return true;
    }
}