package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Thread> bigTurn = new ArrayList();
    static ArrayList <Thread> littleTurn = new ArrayList();

    public static void main(String[] args) {

/*
1вариан здесь, очередь работает но не сопрягается с продавцом


//while (true){                                     // через while цикл не получается
        for (int i = 0; i < 100; ) {
     if(littleTurn.size()< 20){
         Buyer buyer = new Buyer(i);
         littleTurn.add(buyer);
         buyer.start();
         i++;
         System.out.println("************" + littleTurn.size());
     }
     else{
         try {
             Thread.sleep(0,1);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

          }

      //  }


 */

addBuyerInTurn addBuyerInTurn1 = new addBuyerInTurn();
addBuyerInTurn1.start();
/*
        Seller seller = new Seller();
        seller.start();

 */






    }
}
