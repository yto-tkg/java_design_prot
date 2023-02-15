package com.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BIgCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static BIgCharFactory singleton = new BIgCharFactory();

    private BIgCharFactory() {

    }

    public static BIgCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get(String.valueOf(charname));
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
;        }
        return bc;
    }
}
