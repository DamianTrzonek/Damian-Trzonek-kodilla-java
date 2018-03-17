package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main (){
        SimpleUser simpleUser = new SimpleUser("theForumUser","John Smith");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy.");

        Calculator calc = new Calculator ();

        int addResult = calc.add(10,5);

        if(addResult == 15) {
            System.out.println("Add test OK!");
        } else {
            System.out.println("Add test FAIL!");
        }

        int substractResult = calc.substract(10,5);

        if(substractResult == 5){
            System.out.println("Substract test OK!");
        } else {
            System.out.println("Substract test FAIL!");
        }
}
}
