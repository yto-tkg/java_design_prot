package com.design.pattern.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }
    public void win() {
        strategy.study(true);
    }

    public void lose() {
        strategy.study(false);
    }

    public void even() {

    }
}
