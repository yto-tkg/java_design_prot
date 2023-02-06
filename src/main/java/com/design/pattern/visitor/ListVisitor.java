package com.design.pattern.visitor;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
    }
}
