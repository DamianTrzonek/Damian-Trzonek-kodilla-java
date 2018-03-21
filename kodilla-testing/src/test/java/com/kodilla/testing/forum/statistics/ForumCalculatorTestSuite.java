package com.kodilla.testing.forum.statistics;

import org.junit.*;
import com.kodilla.testing.forum.statistics.ForumCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumCalculatorTestSuite {

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
    public void testForumCalculatorWithZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 0;
        int commentsCount = 1000;
        List<String> usersNames = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j"));

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();
        //Then
        double expectedAvgPostsOnUser = 0.0;
        double expectedAvgCommentsOnUser = 100.0;
        double expectedAvgCommentsOnPost = 0.0;
        System.out.println("Testing ForumCalculator with zero posts");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.0);


    }

    @Test
    public void testForumCalculatorThousandPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 1000;
        int commentsCount = 1;
        List<String> usersNames = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j"));

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();
        //Then
        double expectedAvgPostsOnUser = 100.0;
        double expectedAvgCommentsOnUser = 0.1;
        double expectedAvgCommentsOnPost = 0.001;
        System.out.println("Testing ForumCalculator with thousand posts");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.1);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.01);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.0001);
    }

    @Test
    public void testForumCalculatorZeroComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 100;
        int commentsCount = 0;
        List<String> usersNames = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j"));

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();
        //Then
        double expectedAvgPostsOnUser = 10.0;
        double expectedAvgCommentsOnUser = 0.0;
        double expectedAvgCommentsOnPost = 0.0;
        System.out.println("Testing ForumCalculator with zero comments");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.0);
    }

    @Test
    public void testForumCalculatorCommentsLessThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 500;
        int commentsCount = 125;
        List<String> usersNames = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j"));

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();

        //Then
        double expectedAvgPostsOnUser = 50.0;
        double expectedAvgCommentsOnUser = 12.5;
        double expectedAvgCommentsOnPost = 0.25;
        System.out.println("Testing ForumCalculator with comments < posts");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.00);

    }

    @Test
    public void testForumCalculatorCommentsMoreThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 112;
        int commentsCount = 1526;
        List<String> usersNames = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j"));

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();

        //Then
        double expectedAvgPostsOnUser = 11.2;
        double expectedAvgCommentsOnUser = 152.6;
        double expectedAvgCommentsOnPost = 13.625;
        System.out.println("Testing ForumCalculator with comments > posts");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.0);
    }

    @Test
    public void testForumCalculatorZeroUsers() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 550;
        int commentsCount = 1255;
        List<String> usersNames = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j"));
        usersNames.clear();

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();

        //Then
        double expectedAvgPostsOnUser = 0.0;
        double expectedAvgCommentsOnUser = 0.0;
        double expectedAvgCommentsOnPost = 2.281;
        System.out.println("Testing ForumCalculator with zero users");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.001);
    }

    @Test
    public void testForumCalculatorThousandUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 5555;
        int commentsCount = 7250;
        List<String> usersNames = new ArrayList<>(Arrays.asList());
        String randomUser = "a";
        for(int i = 0; i < 1000 ; i++) {
            usersNames.add(randomUser + i);
        }

        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);
        //When
        forumCalculator.calculateAdvStatistics(statisticsMock);
        double avgPostsOnUser = forumCalculator.getAvgPostsOnUser();
        double avgCommentsOnUser = forumCalculator.getAvgCommentsOnUser();
        double avgCommentsOnPost = forumCalculator.getAvgCommentsOnPost();

        //Then
        double expectedAvgPostsOnUser = 5.555;
        double expectedAvgCommentsOnUser = 7.25;
        double expectedAvgCommentsOnPost = 1.305;
        System.out.println("Testing ForumCalculator with thousand users");
        Assert.assertEquals(expectedAvgPostsOnUser,avgPostsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnUser, avgCommentsOnUser,0.0);
        Assert.assertEquals(expectedAvgCommentsOnPost,avgCommentsOnPost, 0.001);
    }
}