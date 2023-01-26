package com.design.pattern.adapter.trs;

import com.design.pattern.adapter.cls.Banner;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithPattern();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
