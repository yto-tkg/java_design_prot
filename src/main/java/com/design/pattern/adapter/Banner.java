package com.design.pattern.adapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithPattern() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
