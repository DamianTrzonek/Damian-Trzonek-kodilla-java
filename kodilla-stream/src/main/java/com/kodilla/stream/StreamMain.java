package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Siemaneczko", s -> "ABC"  + s.concat("ABC"));
        poemBeautifier.beautify("Siemaneczko", s -> s.toUpperCase() );
        poemBeautifier.beautify("Siemaneczko", s -> s.replace('n','*'));
        poemBeautifier.beautify("Siemaneczko", s -> s.substring(0,4));

    }
}
