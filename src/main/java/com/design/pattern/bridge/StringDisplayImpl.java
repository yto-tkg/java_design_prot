package com.design.pattern.bridge;

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println(string);
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.println("+");
    }
}
