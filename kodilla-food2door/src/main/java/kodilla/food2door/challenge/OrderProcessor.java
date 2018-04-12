package kodilla.food2door.challenge;


public class OrderProcessor {
    private OrderRepository orderRepository;
    private InformationService informationService;

    public OrderProcessor(OrderRepository orderRepository, InformationService informationService) {
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isProcessed = orderRequest.getProducer().process(orderRequest);
        if(isProcessed) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest,true);
        } else {
            return new OrderDto(orderRequest,false);
        }
    }
}
