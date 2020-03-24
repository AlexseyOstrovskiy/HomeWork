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
        for (int i = 1; i != 101 ; i++) {
            bigTurn.add(i);
        }



       //bigTurn.add(1);
        System.out.println(bigTurn);




    }
}
