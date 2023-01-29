package com.design.pattern.factory;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作成");
    }

    @Override
    public void use() {
        System.out.println(this + "を使います");
    }

    @Override
    public String toString() {
        return "IDCard:" + owner;
    }

    public String getOwner() {
        return owner;
    }
}
