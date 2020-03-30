package com.company;

import java.util.ArrayList;
import java.util.Random;

import static com.company.Buyer.notHappy;

public class Main {

    static ArrayList <Thread>bigTurn = new ArrayList();
    static ArrayList <Thread> littleTurn = new ArrayList();

   // static ArrayList <String> notHappy = new ArrayList(); // список несчасливых покупателей
    //static ArrayList <String> Happy  = new ArrayList();
    public static void main(String[] args) throws InterruptedException {

       /* for (int i = 0; i < 20 ; i++) {
            Buyer buyer = new Buyer(i);
            bigTurn.add(buyer);
        }

        */

        /*  // Тест выводит список большой очереди
        System.out.println("************* 1");
        Thread buyerTest = new Thread();
        for (int i = 0; i < 20; i++) {
            buyerTest = bigTurn.get(i);
            System.out.println(buyerTest.getName());
        }
        System.out.println("************ 2");
         */
       /* for (int h = 0; h <5 ; h++) {
        for (int j = 0; j <5 ; j++) {
            littleTurn.add(bigTurn.get(0));
            bigTurn.remove(0);
            Buyer buyerInLT = new Buyer(j);
            buyerInLT.start();
        }
            System.out.println("Перерыв");}
*/





        Seller seller = new Seller();
        seller.start();


      /*  for (int i = 0; i <20 ; i++) {
            Buyer buyer = new Buyer(i);
            littleTurn.add(buyer);
            buyer.start();
          //  System.out.println(buyer.getName());
        }

       */


        for (int i = 0; i <100 ; i++) {
            Buyer buyer = new Buyer(i);
            bigTurn.add(buyer);}

        while (!bigTurn.isEmpty()){
        for (int j = 0; j < 20; j++) {
            littleTurn.add(bigTurn.get(0));
            bigTurn.remove(0);
            Thread buyerInLittle = new Thread();
            buyerInLittle = littleTurn.get(j);
            buyerInLittle.start();
        }}

        /*while (! bigTurn.isEmpty()){
        if (littleTurn.size() < 20) {
            littleTurn.add(bigTurn.get(0));
            bigTurn.remove(0);
                } else {
                    Thread buyerInLittle = new Thread();
                    for (int j = 0; j < 20; j++) {
                        buyerInLittle = littleTurn.get(j);
                        //buyerInLittle.start();
                    }
                    buyerInLittle.start();
                }}

         */










      /*  for (int j = 0; j <5 ; j++) {
        Random random = new Random();
        int rn = random.nextInt(20);
        Thread luckyBuyer = new Thread();
        luckyBuyer = littleTurn.get(rn);
        //System.out.println("Поток " + luckyBuyer.getName() + " остановлен");
        luckyBuyer.interrupt();}

       */



       /*  // Тест выводит маленькую очередь
       Thread buyerTest2 = new Thread();
        for (int i = 0; i < 5; i++) {
            buyerTest2 = littleTurn.get(i);
            System.out.println(buyerTest2.getName());
        }
        System.out.println("************ 3");

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

*/

      //  Seller seller =new Seller();
        //seller.start();






      /*  for (int i = 0; i < 100 ; i++) {
            Buyer buyer = new Buyer(i);
            bigTurn.add(buyer);
        }
        */


       /* for (int k = 0; k < 20 ; k++) {
            Buyer buyer = new Buyer(k);
            littleTurn.add(bigTurn.get(0));
            bigTurn.remove(0);
            buyer.start();
        }

        */




     /* for (int k = 0; k < 20 ; k++) {
            Buyer buyer = new Buyer(k);
            littleTurn.add(buyer);
            buyer.start();
        }

      */



       /* Thread.sleep(50000);
        System.out.println(littleTurn.size());
        for (int i = 0; i < littleTurn.size(); i++) {
        System.out.println(littleTurn.get(i));}

        */
       // System.out.println(notHappy);


      //System.out.println("Список несчастливых покупателей = " + notHappy);






      /*  Thread seller = new Thread(new Runnable() {
            Thread Seller = Thread.currentThread();
            @Override
            public synchronized void run() {
                if(!littleTurn.isEmpty()){

                   // for (int n = 0; n < 8; n++) {


                    while ( ! bigTurn.isEmpty()){
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

       */




        //System.out.println("Количество счастливых покупателей  = " + Happy.size());
        //for (int l = 0; l < Happy.size() ; l++) {
        //String happyBuyer = (String) Happy.get(l);
        //System.out.println("Список счастливых покупателей = " + happyBuyer);}


       // System.out.println("Количество несчастливых покупателей  = " + notHappy.size());

        //System.out.println("Список несчастливых покупателей = " + notHappy);


}}
