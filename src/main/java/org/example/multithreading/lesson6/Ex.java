package org.example.multithreading.lesson6;

public class Ex extends Thread{
    volatile boolean b = true;
    public void run(){
        long count = 0;


        while (b) {
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex ex = new Ex();
        ex.start();
        Thread.sleep(2000);
        ex.b = false;
        ex.join();
    }
}
