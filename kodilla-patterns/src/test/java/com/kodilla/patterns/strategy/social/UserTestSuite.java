package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Guy");
        User sophie = new YGeneration("Sophie Lady");
        User greg = new ZGeneration("Greg Dude");

        //When
        String adamPublisher = adam.sharePost();
        System.out.println("Adam's publisher: " + adamPublisher);
        String sophiePublisher = sophie.sharePost();
        System.out.println("Sophie's publisher: " + sophiePublisher);
        String gregPublisher = greg.sharePost();
        System.out.println("Greg's publisher: " + gregPublisher);

        //Then
        Assert.assertEquals("=>>Facebook<<=", adamPublisher);
        Assert.assertEquals("[Twitter]", sophiePublisher);
        Assert.assertEquals("<<SNAPCHAT>>", gregPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User hanna = new Millenials("Hanna Montana");

        //When
        String hannaPublisher = hanna.sharePost();
        System.out.println("Hanna's publisher: " + hannaPublisher);
        hanna.setSocialPublisher(new SnapchatPublisher());
        hannaPublisher = hanna.sharePost();
        System.out.println("Hanna's new publisher: " + hannaPublisher);

        //Then
        Assert.assertEquals("<<SNAPCHAT>>", hannaPublisher);
    }
}
