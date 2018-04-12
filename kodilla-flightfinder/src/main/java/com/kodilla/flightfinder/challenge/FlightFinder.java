package com.kodilla.flightfinder.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public void searchFlightFrom(String from) {
        System.out.println("Flights from chosen destination:");
        FlightsTable.getFlights().stream()
                .filter(flight -> flight.getDepartureFrom().equals(from))
                .forEach(System.out::println);

    }
    public void searchFLightTo(String to) {
        System.out.println("Flights to chosen destination:");
        FlightsTable.getFlights().stream()
                .filter(flight -> flight.getArrivalAt().equals(to))
                .forEach(System.out::println);

    }

    public void searchIndirectFlightTo(String from,String to, String through) {
        System.out.println("Possible options of flights:");
        List<Flight> indirectFrom = FlightsTable.getFlights().stream()
                .filter(flight -> flight.getDepartureFrom().equals(from) && flight.getArrivalAt().equals(through))
                .collect(Collectors.toList());

        List<Flight> indirectToDestination = FlightsTable.getFlights().stream()
                .filter(flight -> flight.getDepartureFrom().equals(through) && flight.getArrivalAt().equals(to))
                .collect(Collectors.toList());
        List<List<Flight>> searchResult = new ArrayList<>();
        searchResult.add(indirectFrom);
        searchResult.add(indirectToDestination);
        searchResult.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
