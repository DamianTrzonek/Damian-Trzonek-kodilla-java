package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
   private final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent){
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeople = world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (total,current) -> total.add(current));
        return totalPeople;


    }

}
