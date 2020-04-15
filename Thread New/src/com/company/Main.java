package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Thread> bigTurn = new ArrayList();
    static ArrayList <Thread> littleTurn = new ArrayList();

    public static void main(String[] args) {
while (true){
        for (int i = 0; i <= 100; ) {
     if(littleTurn.size()< 20){
         Buyer buyer = new Buyer(i);
         buyer.start();
         littleTurn.add(buyer);
         System.out.println("************" + littleTurn.size());

     }
            i++;
          }
        }
        }

       // Seller seller = new Seller();
        //seller.start();






    }
//}
