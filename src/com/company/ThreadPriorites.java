package com.company;

public class ThreadPriorites {

    public static void main(String[] args) {
        myThread1 child = new myThread1();
        Thread r  = new Thread(child);
        r.start();

        //default main thread priority = 5
        //priority range -> 1-10
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());

        //main thread priority extends to child thread.
        System.out.println(r.currentThread().getPriority());

    }
}

class myThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("child Thread");
    }
}
