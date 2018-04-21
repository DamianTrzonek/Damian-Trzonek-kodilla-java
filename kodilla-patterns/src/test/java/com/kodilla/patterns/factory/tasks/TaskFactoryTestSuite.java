package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Buy in supermarket", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Paint children's room", paintingTask.getTaskName());
        Assert.assertEquals(false,paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Drive kids", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
    }
    @Test
    public void testExecuteTask(){
        //Given
        Task drivingTask = new DrivingTask("Ride","Warsaw","Bike");
        System.out.println(drivingTask.isTaskExecuted());
        //When
        drivingTask.executeTask();
        //Then
        Assert.assertEquals(true,drivingTask.isTaskExecuted());
    }

}
