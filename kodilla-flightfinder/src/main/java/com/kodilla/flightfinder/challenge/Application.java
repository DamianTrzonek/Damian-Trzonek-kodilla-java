package com.kodilla.flightfinder.challenge;

public class Application {
    public static void main(String[]args) {

        FlightFinder flightFinder = new FlightFinder();
        //flightFinder.searchFlightFrom("Krakow");
        //flightFinder.searchFLightTo("Gdansk");
        flightFinder.searchIndirectFlightTo("Krakow","Gdansk");
    }
}
