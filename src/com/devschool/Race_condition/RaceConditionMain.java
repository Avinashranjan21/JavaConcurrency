package com.devschool.Race_condition;

/**
 * Created by avinash.ranjan on 23/09/17.
 */
public class RaceConditionMain {

    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000; i++) { // 1_000 is same as 1000 but _ will be ignored by java just to add readability in code
                longWrapper.incrementValue();
            }
        };

//        using a single thread to run the runnable
        /*Thread thread = new Thread(runnable);
        thread.start();

        thread.join(); // this added just to insure that below line of code is executed after the finish of the thread.
        System.out.println("Value = " + longWrapper.getValue());*/

        // creating a race condition by creating 1000 thread.

        Thread[] threadArray = new Thread[1000];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new Thread(runnable);
            threadArray[i].start();
        }

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].join();
        }

        System.out.println("LongWrapper Value after race condition = " + longWrapper.getValue());
    }


}
