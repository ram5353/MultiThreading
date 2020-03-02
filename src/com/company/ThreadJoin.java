package com.company;

public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        runThread obj = new runThread();
        obj.start();
        obj.join();
        System.out.println("Main Thread");
    }
}

class runThread extends Thread {
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Exception");
            }
        }
    }
}
