package com.kodilla.flightfinder.challenge;

import java.util.Objects;

public class Flight {
    private String departureFrom;
    private String arrivalAt;

    public Flight(final String departureFrom, final String arrivalAt) {
        this.departureFrom = departureFrom;
        this.arrivalAt = arrivalAt;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getArrivalAt() {
        return arrivalAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureFrom, flight.departureFrom) &&
                Objects.equals(arrivalAt, flight.arrivalAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureFrom, arrivalAt);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureFrom='" + departureFrom + '\'' +
                ", arrivalAt='" + arrivalAt + '\'' +
                '}';
    }
}
