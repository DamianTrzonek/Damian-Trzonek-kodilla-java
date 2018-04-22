package com.kodilla.flightfinder.challenge;

import java.util.ArrayList;
import java.util.List;

public final class FlightsTable {

    public static List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Katowice","Gdansk"));
        flights.add(new Flight("Krakow","Katowice"));
        flights.add(new Flight("Wroclaw","Gdansk"));
        flights.add(new Flight("Gdansk","Krakow"));
        flights.add(new Flight("Warszawa","Gdansk"));
        flights.add(new Flight("Krakow","Poznan"));
        flights.add(new Flight("Warszawa","Poznan"));
        flights.add(new Flight("Katowice","Warszawa"));
        flights.add(new Flight("Krakow","Gdansk"));
        flights.add(new Flight("Krakow","Warszawa"));
        return new ArrayList<>(flights);
    }

}
