package com.design.pattern.adapter;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithPattern();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
