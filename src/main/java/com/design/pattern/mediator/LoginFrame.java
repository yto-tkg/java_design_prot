package com.design.pattern.mediator;

import java.awt.*;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueTextFiled textUser;
    private ColleagueTextFiled textPass;
    private ColleagueButtone buttoneOk;
    private ColleagueButtone buttoneCancel;

    public LoginFrame(String title) {
        super(title);

        setBackground(Color.black);

        createColleagues();

        colleagueChanged();
    }

    @Override
    public void createColleagues() {
        textUser = new ColleagueTextFiled("", 10);

        buttoneOk = new ColleagueButtone("OK");

        textUser.setMediator(this);
        buttoneOk.setMediator(this);
    }

    @Override
    public void colleagueChanged() {
        textUser.setColleagueEnabled(false);
        buttoneOk.setColleagueEnabled(false);
    }
}
