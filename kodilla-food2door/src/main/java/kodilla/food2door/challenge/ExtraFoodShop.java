package kodilla.food2door.challenge;

public class ExtraFoodShop implements Producer {
    private static final String EXTRA_FOOD_SHOP = "Extra Food Shop";

    public String getName() {
        return EXTRA_FOOD_SHOP;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Extra choice for ordering with us! We are on the way to get your food ready to send.");
        return true;
    }
}