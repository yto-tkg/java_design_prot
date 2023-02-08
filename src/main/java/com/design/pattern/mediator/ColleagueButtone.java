package com.design.pattern.mediator;

import java.awt.*;

public class ColleagueButtone extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButtone(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
