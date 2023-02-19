package com.design.pattern.proxy;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob();
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }

    private void heavyJob() {
        System.out.println("重い作業");
    }
}
