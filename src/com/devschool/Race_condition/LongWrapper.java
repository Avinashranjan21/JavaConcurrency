package com.devschool.Race_condition;


/**
 * Created by avinash.ranjan on 23/09/17.
 */
public class LongWrapper {

    private long l;
    private Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue(){
        return l;
    }

    public void incrementValue(){
        synchronized (key){ // using this will synchronize this block of code and handle race condition in java.
        l++;
        }
    }
}
