package org.example.multithreading.lesson2;

public class Ex7 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
       Thread thread1 = new Thread(new MyRun());
       Ex7 thread2 = new Ex7();
       thread1.start();
       thread2.start();
        System.out.println("End");

    }
}


class MyRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}