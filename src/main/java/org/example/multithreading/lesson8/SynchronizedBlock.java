package org.example.multithreading.lesson8;

public class SynchronizedBlock {
    public static void main(String[] args) {
        MyRunnableImpl myRunnable = new MyRunnableImpl();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImpl implements Runnable {

    private void example() {
        System.out.println("For example");
    }
    public void increment() {
        example();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}