package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    static ArrayList<Thread> bigTurn = new ArrayList();
    static ArrayList <Thread> littleTurn = new ArrayList();
    static LinkedList<String> notHappy = new LinkedList<>();
    static ArrayList <String> Happy  = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        class Buyer extends Thread {
            int nameBuyer;
            Buyer(int nameBuyer ){
                this.nameBuyer = nameBuyer;
            }
            @Override
            public synchronized void run(){
                synchronized (notHappy){
                Thread Buyer = Thread.currentThread();
                try {
                    Buyer.sleep(1000);// Покупатель ждёт 1000мс
                     notHappy.add(Buyer.getName());
                    System.out.println(Buyer.getName() + " я недоволен класс Buyer"); // Если ничего не происходит уходит из магазина
                    System.out.println(notHappy.size());
                    // littleTurn.remove(Buyer);
                    Buyer.interrupt();
                } catch (InterruptedException e) {
                    System.out.println(Buyer.getName() + " Я нашёл всё что нужно. класс Buyer");
                }
            }}
        }

        Thread BuyerInTurn = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 1; i <= 100; ) {
                    if (littleTurn.size() >= 20){
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        Buyer buyer = new Buyer(i);
                        littleTurn.add(buyer);
                        buyer.start();
                        i++;
                    }
                }
            }
        });


        BuyerInTurn.start();

    }
}
