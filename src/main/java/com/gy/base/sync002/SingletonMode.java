package com.gy.base.sync002;

public class SingletonMode {

    private SingletonMode() {

    }

    public static class SingletonHolder {
        public static final SingletonMode instance = new SingletonMode();
    }

    public static SingletonMode getInstance() {
        return SingletonHolder.instance;
    }
}
