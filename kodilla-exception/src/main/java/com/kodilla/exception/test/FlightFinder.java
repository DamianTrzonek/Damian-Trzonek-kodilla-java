package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("Prague", false);
        flights.put("Moscow", false);
        flights.put("London", true);

        if(!flights.containsKey(flight.getDepartureAirport()) &&
                !flights.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException();
        }
        System.out.println(flights.get(flight.getDepartureAirport()));
    }
}
