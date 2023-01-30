package com.design.pattern.builder;

public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("========");
        sb.append(title);
    }

    @Override
    public void makeString(String str) {
        sb.append("■");
        sb.append(str);
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append(".");
            sb.append(s);
        }
    }

    @Override
    public void close() {
        sb.append("==============");
    }
}
