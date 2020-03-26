package com.company;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {

    static ArrayList bigTurn = new ArrayList();
    static ArrayList <Thread> littleTurn = new ArrayList();
    static ArrayList notHappy = new ArrayList(); // список несчасливых покупателей
    static ArrayList <String> Happy = new ArrayList();
    public static void main(String[] args) {


      /*  for (int i = 21; i < 100 ; i++) {
            Buyer buyer = new Buyer(i);
            bigTurn.add(buyer);
        }




       */








       // Buyer b1 =(Buyer) littleTurn.get(0);
       // System.out.println(b1.getName());
       // System.out.println(littleTurn.get(0));

        // Buyer buyerLucky = (Buyer) littleTurn.get(rNumber);
        // buyerLucky.interrupt();
/*
       Thread seller = new Thread(new Runnable() {
            Thread seller = Thread.currentThread();
            @Override
            public void run() {
                if(!littleTurn.isEmpty()){
                for (int j = 0; j < 5; j++) {
                    try {
                        Random random = new Random();
                        int rNumber = random.nextInt(20);
                        sleep(30);
                        Thread buyerLucky = (Thread) littleTurn.get(rNumber);
                        System.out.println("покупатель номер " + buyerLucky.getName() + " получил свой товар");
                        buyerLucky.interrupt();
                         Happy.add(buyerLucky.getName());
                         littleTurn.remove(rNumber);
                       // if (!bigTurn.isEmpty()) {
                         //   littleTurn.add(bigTurn.get(0));
                           // bigTurn.remove(0);

                        //} else {
                        //    System.out.println("Покупателей за дверью больше нет");
                       // }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

              System.out.println("Я ухожу на склад, скоро вернусь!");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
               // else{
                   // System.out.println("Покупателей больше нет");
               // }




            }
        });


        Seller seller =new Seller();
        seller.start();

 */
        for (int i = 21; i < 100 ; i++) {
            Buyer buyer = new Buyer(i);
            bigTurn.add(buyer);
        }


        for (int k = 0; k < 20 ; k++) {
            Buyer buyer = new Buyer(k);
            littleTurn.add(buyer);
            buyer.start();
        }



        Thread seller = new Thread(new Runnable() {
            Thread Seller = Thread.currentThread();
            @Override
            public synchronized void run() {
                if(!littleTurn.isEmpty()){

                    for (int n = 0; n < 8; n++) {



                    for (int j = 0; j < 5; j++) {
                        try {
                            Random random = new Random();
                            int rNumber = random.nextInt(20);
                            Seller.sleep(30);
                            Thread buyerLucky = littleTurn.get(rNumber);
                            System.out.println("покупатель номер " + buyerLucky.getName() + " получил свой товар");
                            Happy.add(buyerLucky.getName());
                            buyerLucky.interrupt();
                            if(!bigTurn.isEmpty()){
                            littleTurn.remove(rNumber);
                            Thread b1 =(Thread) bigTurn.get(0);
                            littleTurn.add(b1);
                            bigTurn.remove(0);}
                            else{
                                System.out.println("Люди снаружи закончились");
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Я ухожу на склад, скоро вернусь!");
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}}
            }
        });

        seller.start();




        System.out.println("Количество счастливых покупателей  = " + Happy.size());
        for (int l = 0; l < Happy.size() ; l++) {
        String happyBuyer = (String) Happy.get(l);
        System.out.println("Список счастливых покупателей = " + happyBuyer);}

        System.out.println("Количество несчастливых покупателей  = " + notHappy.size());
        for (int m = 0; m < notHappy.size() ; m++) {
            Thread notHappyBuyer = (Thread) notHappy.get(m);
            System.out.println("Список счастливых покупателей = " + notHappyBuyer.getName());}
}}
