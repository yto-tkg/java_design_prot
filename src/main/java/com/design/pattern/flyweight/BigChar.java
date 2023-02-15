package com.design.pattern.flyweight;

import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = String.valueOf(charname);
        } catch (Exception e) {
            this.fontdata = String.valueOf(charname);
        }
    }

    public void print() {
        System.out.println(fontdata);
    }
}
