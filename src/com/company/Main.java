package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread obj = new MyThread();
        obj.start();
        System.out.println("Main Thread");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run Thread");
    }

    public void run(String name) {
        System.out.println("One more run method " + name );
    }

    //if you override start method, it wont create a child moethod. SO, it won't call run method as well.
    @Override
    public synchronized void start() {
        super.start();
        System.out.println("start method");
    }




}
