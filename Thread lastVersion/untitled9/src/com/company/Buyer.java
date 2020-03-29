package com.company;

import java.util.ArrayList;

import static com.company.Main.littleTurn;
//import static com.company.Main.notHappy;


public class Buyer extends Thread {


    static ArrayList<Thread> notHappy = new ArrayList();


    int nameBuyer;
    Buyer(int nameBuyer ){
        this.nameBuyer = nameBuyer;
    }
    @Override
    public synchronized void run(){
        Thread Buyer = Thread.currentThread();
        try {
           Buyer.sleep(1000);// Покупатель ждёт 1000мс
           // notHappy.add(Buyer);
            System.out.println(Buyer.getName() + " я недоволен класс Buyer"); // Если ничего не происходит уходит из магазина
           // littleTurn.remove(Buyer);
            Buyer.interrupt();
        } catch (InterruptedException e) {
            System.out.println(Buyer.getName() + " Я нашёл всё что нужно. класс Buyer");
        }
        //for (int i = 0; i < 100; i++) {
          //  String nHbuyer = notHappy.get(i);
            //}
    // System.out.println("Список несчастливых покупателей = " + notHappy);
       // System.out.println("Количество несчастливых покупателей  = " + notHappy.size());




    }





}


