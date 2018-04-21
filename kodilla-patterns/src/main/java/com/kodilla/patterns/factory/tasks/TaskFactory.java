package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK :
                return new ShoppingTask("Buy in supermarket", "Milk",2.0);
            case PAINTINGTASK :
                return new PaintingTask("Paint children's room", "Blue","Walls");
            case DRIVINGTASK :
                return new DrivingTask("Drive kids", "School", "Car");
            default :
                return null;
        }
    }
}
