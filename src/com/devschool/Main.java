package com.devschool;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            String name = Thread.currentThread().getName();
                System.out.println("I am running in thread "+name);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }


}
