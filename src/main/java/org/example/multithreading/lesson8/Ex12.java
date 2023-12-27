package org.example.multithreading.lesson8;

public class Ex12 {
    static final Object OBJECT = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableMob());
        Thread thread2 = new Thread(new RunnableSky());
        Thread thread3 = new Thread(new RunnableWht());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    synchronized void mobile() {
        synchronized (OBJECT) {
            System.out.println("Mobile call");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile end");
        }
    }

    synchronized void skype() {
        synchronized (OBJECT) {
            System.out.println("Skype call");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype end");
        }
    }

    void whatsUp() {
        synchronized (OBJECT) {
            System.out.println("WhatUp call");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatUp end");
        }
    }
}

class RunnableMob implements Runnable {

    @Override
    public void run() {
        new Ex12().mobile();
    }
}

class RunnableSky implements Runnable {

    @Override
    public void run() {
        new Ex12().skype();
    }
}

class RunnableWht implements Runnable {

    @Override
    public void run() {
        new Ex12().whatsUp();
    }
}