package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Confirmation email has been sent on user email: " + user.getEmail());

    }
}
