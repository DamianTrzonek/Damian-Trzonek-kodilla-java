package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkRepositoryTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkRepository sashaCohen = new HomeworkRepository("Sasha Cohen's homework");
        HomeworkRepository jessicaBlack = new HomeworkRepository("Jessica Black's homework");
        HomeworkRepository drewCarey = new HomeworkRepository("Drew Carey's homework");
        Mentor jackDaniels = new Mentor("Jack Daniels");
        Mentor johnCage = new Mentor("John Cage");
        sashaCohen.registerObserver(jackDaniels);
        jessicaBlack.registerObserver(johnCage);
        drewCarey.registerObserver(jackDaniels);
        //When
        sashaCohen.addTask("for loop homework");
        sashaCohen.addTask("library task");
        jessicaBlack.addTask("List and ArrayList task");
        jessicaBlack.addTask("Optional homework");
        jessicaBlack.addTask("Test suite homework");
        drewCarey.addTask("Gradle and Maven rebuild");
        drewCarey.addTask("Random class");
        //Then
        Assert.assertEquals(3, johnCage.getUpdateCount());
        Assert.assertEquals(4, jackDaniels.getUpdateCount());
    }
}
