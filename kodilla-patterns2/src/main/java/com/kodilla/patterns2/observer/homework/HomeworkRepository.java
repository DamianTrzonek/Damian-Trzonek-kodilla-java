package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkRepository implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworkTasks;
    private final String name;

    public HomeworkRepository(String name) {
        observers = new ArrayList<>();
        homeworkTasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        homeworkTasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getHomeworkTasks() {
        return homeworkTasks;
    }

    public String getName() {
        return name;
    }
}
