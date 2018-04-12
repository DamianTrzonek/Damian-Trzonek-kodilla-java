package kodilla.food2door.challenge;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        Producer producer = new HealthyShop();
        User user = new User("Bart", "Sample", "123 Sample Street");
        Product product = new Product("fish n chips", 2);

        return new OrderRequest(producer, product, user);

    }
}
