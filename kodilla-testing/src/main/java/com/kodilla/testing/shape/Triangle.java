package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 &&
                Double.compare(triangle.sideB, sideB) == 0 &&
                Double.compare(triangle.sideC, sideC) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sideA, sideB, sideC);
    }
}
