package org.example.multithreading.lesson9;

public class Ex {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market {
    private int brakeCount = 0;
    public synchronized void getBread() {
        while (brakeCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        brakeCount--;
        System.out.println("By one bread");
        System.out.println("Count bread " + brakeCount);
        notify();
    }

    public synchronized void putBread() {
        while (brakeCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        brakeCount++;
        System.out.println("Added one bread");
        System.out.println("Count bread " + brakeCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}