package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

import static com.company.Buyer.happyTurn;
import static com.company.Buyer.notHappyTurn;

public class Main {
    static ArrayList<Thread> bigTurn = new ArrayList();
    static ArrayList <Thread> littleTurn = new ArrayList();

    public static void main(String[] args) throws InterruptedException {





        Seller seller = new Seller();
        seller.start();




         // Создание очереди Начало
        int j = 0;
        while (j == 0){
                for (int i = 0; i < 100; ) {
             if(littleTurn.size()< 20){
                 Buyer buyer = new Buyer(i);
                 littleTurn.add(buyer);
                 buyer.start();
                 i++;
               //  System.out.println("************" + littleTurn.size());
             }
             else{
                try {
                     Thread.sleep(1);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
                  }
            j++;
               }
        //Создание очереди Конец

        //Вывод итоговых списков
        Thread.sleep(1001);

        ArrayList arrayNotHappyTurn = new ArrayList();
        for (int i = 0; i < notHappyTurn.size() - 1 ; i++) {
            arrayNotHappyTurn.add(notHappyTurn.get(i).getName());}

        ArrayList arrayLucky = new ArrayList();
        for (int i = 0; i < happyTurn.size() - 1 ; i++) {
            arrayLucky.add(happyTurn.get(i).getName());}



        System.out.println("Количество недовольных покупателей :  " + notHappyTurn.size());
        System.out.println("Количество довольных покупателе  : " + happyTurn.size() );
        System.out.println("Список недовольных покупателей : " + arrayNotHappyTurn);
        System.out.println("Список довольных покупателей : " + arrayLucky);
       // System.out.println("Список недовольных покупателей: " + arrayNotHappyTurn.toArray());



       // System.out.println("Список довольных покупателей " + happyTurn);















    }
}
