package com.devschool.dead_lock;

/**
 * Created by avinash.ranjan on 23/09/17.
 */
public class DeadLockMain {

    public static void main(String[] args) throws InterruptedException {

        DeadLockCreator deadLockCreator = new DeadLockCreator();

        Runnable r1 =()-> deadLockCreator.a();
        Runnable r2 =()-> deadLockCreator.b();

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();
    }
}
