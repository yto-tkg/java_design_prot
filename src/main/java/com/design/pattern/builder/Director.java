package com.design.pattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的なあいさつ");
        builder.makeItems(new String[] {
                "How are you?",
                "Hello"
        });
        builder.makeString("時間帯に応じたあいさつ");
        builder.makeItems(new String[] {
                "Good morning",
                "Good afternoon"
        });
        builder.close();
    }
}
