package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[]args){

        FlightFinder flightFinder = new FlightFinder();
       try {
           flightFinder.findFlight(new Flight("Warsaw", "Berlin"));
       }catch (RouteNotFoundException e){
           System.out.println("Error! Route not found!");
       }
       try {
           flightFinder.findFlight(new Flight());
       }catch (RouteNotFoundException e){
           System.out.println("Error! Route not found!");
       }
    }
}
