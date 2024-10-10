package com.collections;

public class PersistentTest2 {

    public static PersistentTest2 INSTANCE;
/*
    synchronized() {

    }*/
    public synchronized PersistentTest2 getInstance(){
        if(INSTANCE==null){
            INSTANCE = new PersistentTest2();
        }
        return INSTANCE;
    }

}
