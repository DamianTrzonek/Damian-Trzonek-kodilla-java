package kodilla.food2door.challenge;

public class OrderInformator implements InformationService {

    public boolean inform(User user) {
        System.out.println("Delivery for " + user.getAddress() + " has been successfully delivered.");
        return true;
    }
}