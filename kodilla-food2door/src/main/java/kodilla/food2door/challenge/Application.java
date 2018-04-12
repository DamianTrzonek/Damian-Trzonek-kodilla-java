package kodilla.food2door.challenge;

public class Application {

    public static void main(String[]args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new FoodOrderRepository(), new OrderInformator());
        orderProcessor.process(orderRequest);
    }
}
