package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkRepository homeworkRepository) {
        System.out.println(username + " new task in: " + homeworkRepository.getName() + "\n" +
        " total: " + homeworkRepository.getHomeworkTasks().size() + " tasks");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
