package com.gy.base.common011;

public class Singletion {

    private Singletion(){}
    private static class InnerSingletion {
        private static Singletion single = new Singletion();
    }

    public static Singletion getInstance(){
        return InnerSingletion.single;
    }

}
