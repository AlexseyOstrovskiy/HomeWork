package com.company;

import java.util.ArrayList;
import java.util.Random;

import static com.company.Main.Happy;
import static com.company.Main.littleTurn;

public class Seller extends Thread {


    @Override
    public void run() {
        Thread Seller = Thread.currentThread();
        if(!littleTurn.isEmpty()){
            for (int j = 0; j < 5; j++) {
                try {
                    Random random = new Random();
                    int rNumber = random.nextInt(20);
                    Seller.sleep(30);
                    Thread buyerLucky = (Thread) littleTurn.get(rNumber);
                    System.out.println("покупатель номер " + buyerLucky.getName() + " получил свой товар");
                    Happy.add(buyerLucky.getName());
                    buyerLucky.interrupt();
                    littleTurn.remove(rNumber);
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



    }

}
