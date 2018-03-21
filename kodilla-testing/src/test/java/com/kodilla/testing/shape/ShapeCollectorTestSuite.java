package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseAddFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("circle1",2.0);
        //When
        collector.addFigure(circle);
        //Then
        Assert.assertTrue(collector.getShapes().contains(circle));
        Assert.assertFalse(collector.getShapes().isEmpty());
    }

    @Test
    public void testCaseRemoveFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("circle1",2.0);
        collector.addFigure(circle);
        //When
        collector.removeFigure(circle);
        //Then
        Assert.assertTrue(collector.getShapes().isEmpty());
    }

    @Test
    public void testCaseGetFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("circle1",2.0);
        Square square = new Square("square1",2.5);
        Triangle triangle = new Triangle("triangle1",2.5,5.5,7.0 );
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);
        //When
        Shape result = collector.getFigure(1);
        //Then
        Assert.assertSame(square,result);
    }

    @Test
    public void testCaseShowFigures(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("circle1",2.0);
        Square square = new Square("square1",2.5);
        Triangle triangle = new Triangle("triangle1",2.5,5.5,7.0 );
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);
        //When
        ArrayList<Shape> expected = new ArrayList<>(Arrays.asList(circle,square,triangle));
        //Then
        Assert.assertEquals(expected.toString(), collector.showFigures());
    }
}