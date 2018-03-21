package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }
    public double getField() {
        return Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, radius);
    }
}
