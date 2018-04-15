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
        board.toDoList.tasks().add("Get shower");
        board.inProgressList.tasks().add("Coding app");
        board.doneList.tasks().add("Eat dinner");
        //Then
        Assert.assertEquals(board.toDoList.tasks().size(),1);
        Assert.assertEquals(board.toDoList.tasks().get(0),"Get shower");
        Assert.assertEquals(board.inProgressList.tasks().size(),1);
        Assert.assertEquals(board.inProgressList.tasks().get(0),"Coding app");
        Assert.assertEquals(board.doneList.tasks().size(),1);
        Assert.assertEquals(board.doneList.tasks().get(0),"Eat dinner");
    }
}
