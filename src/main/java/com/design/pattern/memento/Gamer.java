package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] fruitsName = {
            "りんご", "ぶどう", "バナナ"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
        } else {
            System.out.println("何も起きない");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f : fruits) {
            m.addFruit(f);
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }
}
