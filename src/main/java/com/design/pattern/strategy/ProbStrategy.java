package com.design.pattern.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1, 1, 1, },
            {1, 1, 1, },
            {1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random((seed));
    }

    @Override
    public Hand nextHand() {
        return Hand.SCISSORS;
    }

    @Override
    public void study(boolean win) {

    }
}
