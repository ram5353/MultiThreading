package com.company;

public class myRunnable {
    public static void main(String[] args) {
        myThread obj = new myThread();
        Thread t = new Thread(obj);
        t.start();
        System.out.println("main method");
    }
}

class myThread implements Runnable {

    @Override
    public void run() {
        System.out.println("run method");
    }
}
