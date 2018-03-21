package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
    //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> resultEmptyList = new ArrayList<>();
    //When
        ArrayList<Integer> emptyNumberList = new ArrayList<>();
        exterminator.exterminate(emptyNumberList);
        System.out.println("Testing empty ArrayList<Integer>");
    //Then
        Assert.assertEquals(resultEmptyList,emptyNumberList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<> ();
        for(int i = 1; i <11 ; i++) {
            numbers.add(i);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing Array List" + numbers);
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //Then
        System.out.println("New ArrayList: " + result);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        Assert.assertEquals(expected,result);
    }
}
