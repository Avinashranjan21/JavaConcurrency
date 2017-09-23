package com.devschool;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = () -> {
        String name = Thread.currentThread().getName();
            System.out.println("I am running in thread "+name);
        };
        Thread thread = new Thread(runnable);
        thread.setName("Thread 1");
        thread.start(); // to start this thread on the thread we had created.
//        thread.run(); // this will run the runnable on main thread.

    }


}
