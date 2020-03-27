package com.company;

import java.util.ArrayList;

import static com.company.Main.littleTurn;
import static com.company.Main.notHappy;
import static java.lang.System.*;

public class Buyer extends Thread {



    int nameBuyer;
    Buyer(int nameBuyer){
        this.nameBuyer = nameBuyer;
    }
    @Override
    public synchronized void run(){
        Thread Buyer = Thread.currentThread();
        try {
            sleep(1000);// Покупатель ждёт 1000мс
            notHappy.add(Buyer.getName());
            littleTurn.remove(Buyer.getName());
            out.println(Buyer.getName() + " я недоволен"); // Если ничего не происходит уходит из магазина
        } catch (InterruptedException e) {
            out.println(Buyer.getName() + " Я нашёл всё что нужно.");
        }
        //for (int i = 0; i < 100; i++) {
          //  String nHbuyer = notHappy.get(i);
            //}
    // System.out.println("Список несчастливых покупателей = " + notHappy);
       // System.out.println("Количество несчастливых покупателей  = " + notHappy.size());
    }




}


