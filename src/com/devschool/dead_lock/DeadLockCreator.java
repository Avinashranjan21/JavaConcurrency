package com.devschool.dead_lock;

/**
 * Created by avinash.ranjan on 23/09/17.
 */
public class DeadLockCreator {

    private Object key1 = new Object();
    private Object key2 = new Object();


    public void a(){
        synchronized (key1){
            System.out.println("[ " +Thread.currentThread().getName()+" ] I am in A()");
            b();
        }
    }
    public void b(){
        synchronized (key2){
            System.out.println("[ " +Thread.currentThread().getName()+" ] I am in B()");
            c();
        }
    }
    public void c(){
        synchronized (key1){
            System.out.println("[ " +Thread.currentThread().getName()+" ] I am in C()");
        }
    }

}
