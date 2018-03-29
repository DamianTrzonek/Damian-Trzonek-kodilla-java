package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[]args){

    SecondChallenge challenge = new SecondChallenge();

    try {
        challenge.probablyIWillThrowException(2.1, 2.2);
    }catch(Exception e){
        System.out.println("Found problem!" + e);
    }finally {
        System.out.println("Don't let little problems become BIG problems!");
    }
    }
}
