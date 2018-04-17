package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext (BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().tasks().add("Get shower");
        board.getInProgressList().tasks().add("Coding app");
        board.getDoneList().tasks().add("Eat dinner");
        //Then
        Assert.assertEquals(board.getToDoList().tasks().size(),1);
        Assert.assertEquals(board.getToDoList().tasks().get(0),"Get shower");
        Assert.assertEquals(board.getInProgressList().tasks().size(),1);
        Assert.assertEquals(board.getInProgressList().tasks().get(0),"Coding app");
        Assert.assertEquals(board.getDoneList().tasks().size(),1);
        Assert.assertEquals(board.getDoneList().tasks().get(0),"Eat dinner");
    }
}
