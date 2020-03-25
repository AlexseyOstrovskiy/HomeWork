package com.company;

import static com.company.OcheredBuyer.bigTurn;
import static com.company.OcheredBuyer.littleTurn;
import java.util.ArrayList;

public class Main {

    static ArrayList bigTurn = new ArrayList();
    static ArrayList littleTurn = new ArrayList();
    static ArrayList notHappy = new ArrayList(); // список несчасливых покупателей
    static ArrayList Happy = new ArrayList();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Buyer buyer =new Buyer(i);
            bigTurn.add(buyer);

            for (int j = 0; j < 20; j++) {
                littleTurn.add(bigTurn.get(0));
                bigTurn.remove(0);
            }


            while (bigTurn.size() != 0){
                if (littleTurn.size() == 20){
                    Seller seller = new Seller();
                    seller.start();
                    buyer.start();





                }
                if(bigTurn.isEmpty()){
                    System.out.println("Покупателей у входа больше нет");
                }
                else{
                    littleTurn.add(bigTurn.get(0));
                    bigTurn.remove(0);
                }
            }

        }
        System.out.println("Несчастливые клиенты " + notHappy.size());

        System.out.println("Счастливые клиенты " + Happy.size());
    }
}
