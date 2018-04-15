package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void TestCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
       double addResult = calculator.add(10.0,2.0);
       double subResult = calculator.sub(10.0,2.0);
       double mulResult = calculator.mul(10.0,2.0);
       double divResult = calculator.div(10.0,2.0);
        //Then
        Assert.assertEquals(12.0,addResult,0);
        Assert.assertEquals(8.0,subResult,0);
        Assert.assertEquals(20.0,mulResult,0);
        Assert.assertEquals(5.0,divResult,0);
    }
}
