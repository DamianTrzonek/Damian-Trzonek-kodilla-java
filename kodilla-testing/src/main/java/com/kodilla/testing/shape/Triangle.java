package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getShapeName() {
        return name;
    }
    public double getField() {
        double circ = 0.5 *(sideA + sideB + sideC );
        return Math.sqrt(circ * (circ - sideA) * (circ - sideB) * (circ - sideC));

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                '}';
    }
}
