package com.kodilla.patterns.singleton;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
            public static void loggingOperation() {

        Logger.getInstance().log("Withdrawal operation");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String logName = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Withdrawal operation",logName);
    }
}
