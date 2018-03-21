package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideA, sideA) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sideA);
    }
}
