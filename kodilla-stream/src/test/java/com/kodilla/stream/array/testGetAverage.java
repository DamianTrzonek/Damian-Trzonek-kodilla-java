package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class testGetAverage {
    @Test
    public void testGetAverage(){
       //Given
        int[] numbers = {10,15,17,13,2,5,100,22,1,19};
       //When
        double result =  ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(20.4,result,0);


    }
}
