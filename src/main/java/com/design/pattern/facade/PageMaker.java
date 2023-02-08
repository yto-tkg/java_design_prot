package com.design.pattern.facade;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            String mailprop = Databases.getProperties("maildata");
            HtmlWriter write = new HtmlWriter(new FileWriter(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
