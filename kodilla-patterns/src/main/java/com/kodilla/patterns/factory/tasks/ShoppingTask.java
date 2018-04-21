package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private boolean isExecuted = false;
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskname, String whatToBuy, double quantity) {
        this.taskName = taskname;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task is finished.");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
