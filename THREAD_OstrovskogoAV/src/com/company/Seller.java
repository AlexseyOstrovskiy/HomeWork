package com.company;

import java.util.ArrayList;
import java.util.Random;

import static com.company.OcheredBuyer.bigTurn;
import static com.company.OcheredBuyer.littleTurn;

public class Seller extends Thread {
    @Override
    public void run(){
        for (int j = 1; j != 5; j++) {
            Random random = new Random();
            int check = random.nextInt(19) + 1;
            try {
                sleep(30);
                System.out.println("покупатель номер " + littleTurn.get(check) + " получил свой товар");
                littleTurn.remove(check);
                if(bigTurn.isEmpty()){
                    System.out.println("Покупателей больше нет");
                }
                else{
                    littleTurn.add(bigTurn.get(0));
                    bigTurn.remove(0);}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Я ухожу на склад, скоро вернусь!");
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


