package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumCalculator {
    Statistics statistics;
    List<String> usersNames;
    int numberOfPosts;
    int numberOfComments;
    double avgPostsOnUser;
    double avgCommentsOnUser;
    double avgCommentsOnPost;

    public ForumCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        ForumCalculator forumCalculator = new ForumCalculator(statistics);
        usersNames = forumCalculator.statistics.usersNames();
        numberOfPosts = forumCalculator.statistics.postCount();
        numberOfComments = forumCalculator.statistics.commentsCount();

        if (numberOfPosts == 0) {
            avgCommentsOnPost = 0.0;
            avgPostsOnUser = numberOfPosts / usersNames.size();
            avgCommentsOnUser = numberOfComments / usersNames.size();
        } else if (usersNames.size() == 0) {
            avgCommentsOnPost = numberOfComments / numberOfPosts;
            avgPostsOnUser = 0.0;
            avgCommentsOnUser = 0.0;
        } else {

            avgCommentsOnPost = numberOfComments / numberOfPosts;
            avgPostsOnUser = numberOfPosts / usersNames.size();
            avgCommentsOnUser = numberOfComments / usersNames.size();

        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + getNumberOfUsers());
        System.out.println("Number of posts: " + getNumberOfPosts());
        System.out.println("Number of comments: " + getNumberOfComments());
        System.out.println("Average number of posts on user: " + getAvgPostsOnUser());
        System.out.println("Average number of comments on user: " + getAvgCommentsOnUser());
        System.out.println("Average number of comments on post: " + getAvgCommentsOnPost());
    }

    public int getNumberOfUsers() {
        return usersNames.size();
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsOnUser() {
        return avgPostsOnUser;
    }

    public double getAvgCommentsOnUser() {
        return avgCommentsOnUser;
    }

    public double getAvgCommentsOnPost() {
        return avgCommentsOnPost;
    }

}