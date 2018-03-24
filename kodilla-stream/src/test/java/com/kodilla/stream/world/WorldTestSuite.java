package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country china = new Country("China",new BigDecimal("1376049000"));
        Country india = new Country("India", new BigDecimal("1293057000"));
        Country northKorea = new Country("North Korea", new BigDecimal("24051218"));
        Country nigeria = new Country("Nigeria",new BigDecimal("199800400"));
        Country egypt = new Country("Egypt", new BigDecimal("90120000"));
        Country rpa = new Country("RPA", new BigDecimal("54956900"));
        Country usa = new Country("USA", new BigDecimal("325365189"));
        Country mexico = new Country("Mexico", new BigDecimal("112322758"));
        Country canada = new Country("Canada", new BigDecimal("35151728"));
        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(northKorea);
        Continent africa = new Continent();
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(rpa);
        Continent northAmerica = new Continent();
        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        World theEarth = new World();
        theEarth.addContinent(asia);
        theEarth.addContinent(africa);
        theEarth.addContinent(northAmerica);

        //When
        BigDecimal expectedTotalSumOfPeople = new BigDecimal("3510874193");
        BigDecimal totalSumOfPeople =  theEarth.getPeopleQuantity();

        //Then
        Assert.assertEquals(expectedTotalSumOfPeople,totalSumOfPeople);
    }
}
