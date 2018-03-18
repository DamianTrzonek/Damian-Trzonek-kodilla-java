package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double sideA;

    public Square(String name, double sideA) {
        this.name = name;
        this.sideA = sideA;
    }
    public String getShapeName() {
        return name;
    }
    public double getField(){
        return Math.pow(sideA,2);
  }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}
