package com.company;

public class ThreadYield {

    public static void main(String[] args) {
        yieldThread obj = new yieldThread();
        obj.start();
        for (int i=0;i<10;i++) {
            System.out.println("Main thread");
        }
    }
}

class yieldThread extends Thread {
    public void run() {
        Thread.yield();
        for (int i=0;i<10;i++) {
            System.out.println("child thread");
        }
    }
}
