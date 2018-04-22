package com.kodilla.flightfinder.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    private List<Flight> searchDirectFlight(String from, String to) {

          return FlightsTable.getFlights().stream()
                .filter(flight -> flight.getDepartureFrom().equals(from))
                .filter(flight -> flight.getArrivalAt().equals(to))
                .collect(Collectors.toList());
    }

    public void searchIndirectFlightTo(String from, String to) {
        System.out.println("Possible options of flights:");

        List<Flight> flightsTo = FlightsTable.getFlights().stream()
                .filter(flight -> flight.getArrivalAt().equals(to))
                .collect(Collectors.toList());

        List<Flight> flightsFrom = FlightsTable.getFlights().stream()
                .filter(flight -> flight.getDepartureFrom().equals(from))
                .collect(Collectors.toList());

        List<Flight> resultList = new ArrayList<>();

        for(Flight f1 : flightsFrom) {
            for(Flight f2 : flightsTo) {
                if(f1.getArrivalAt().equals(f2.getDepartureFrom())) {
                    resultList.add(f1);
                }
            }
        }

        for(Flight f1 : flightsTo) {
            for(Flight f2 : flightsFrom) {
                if(f1.getDepartureFrom().equals(f2.getArrivalAt())) {
                    resultList.add(f1);
                }
            }
        }

        System.out.println(resultList);

    }
}
